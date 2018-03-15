package ua.notebook;

import java.util.Scanner;

public class Controller {
    private final String regLastName = "[A-ZА-ЯҐІЇЄa-zа-яґіїє]{2,20}";
    private final String infoLastName = "Last Name (2-20 letters, e.g. Makarenko, Шевченко)";

    private final String regFirstName = "[A-ZА-ЯҐІЇЄa-zа-яґіїє]{2,20}";
    private final String infoFirstName = "First Name (2-20 letters, e.g. Дмитрий, Андрій)";

    private final String regPatronymic = "[A-ZА-ЯҐІЇЄa-zа-яґіїє]{2,20}";
    private final String infoPatronymic = "Patronymic (2-20 letters, e.g. Igorovich, Алексеевна)";

    private final String regNickname = "[A-Za-z0-9_]{2,20}";
    private final String infoNickname = "Nickname (2-20 symbols: letters, digits and \"_\", e.g. abc_def, g1hi)";

    private final String regComment = ".*|-";
    private final String infoComment = "Comment OR \"-\" to skip";

    private final String regGroup = "1|2|3";
    private final String infoGroup = "Group (1, 2 or 3)";

    private final String regHomePhoneNumber = "[0-9]{3,5}-[0-9]{5,7}";
    private final String infoHomePhoneNumber = "Home Phone Number ([city code 3-5 digits]-[phone number 5-7 digits], "
            + "e.g 344-32156, 044-9217462)";

    private final String regMobileNumber1 = "0[0-9]{2}-[0-9]{7}";
    private final String infoMobileNumber1 = "Mobile Number 1 ([operator number 3 digits, "
            + "starts from zero]-[phone number 7 digits], e.g. 099-1234567)";

    private final String regMobileNumber2 = "(0[0-9]{2}-[0-9]{7})|-";
    private final String infoMobileNumber2 = "Mobile Number 2 ([operator number 3 digits, starts from zero]-"
            + "[phone number 7 digits] OR \"-\" to skip, e.g. 099-1234567)";

    private final String regEmail = "[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?"
            + "(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*";
    private final String infoEmail = "Email";

    private final String regSkype = "[A-Za-z0-9_]{2,20}";
    private final String infoSkype = "Skype";


    private Model model;
    private View view;
    private Scanner sc;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        sc = new Scanner(System.in);
    }

    public void processUser() {
        String lastName = inputStringValueWithScanner(infoLastName, regLastName);
        String firstName = inputStringValueWithScanner(infoFirstName, regFirstName);
        String patronymic = inputStringValueWithScanner(infoPatronymic, regPatronymic);
        String nickname = inputStringValueWithScanner(infoNickname, regNickname);
        String comment = inputStringValueWithScanner(infoComment, regComment);
        String group = inputStringValueWithScanner(infoGroup, regGroup);
        String homePhoneNumber = inputStringValueWithScanner(infoHomePhoneNumber, regHomePhoneNumber);
        String mobileNumber1 = inputStringValueWithScanner(infoMobileNumber1, regMobileNumber1);
        String mobileNumber2 = inputStringValueWithScanner(infoMobileNumber2, regMobileNumber2);
        String email = inputStringValueWithScanner(infoEmail, regEmail);
        String skype = inputStringValueWithScanner(infoSkype, regSkype);

        model.addEntry(lastName, firstName, patronymic,
                nickname, comment, group, homePhoneNumber,
                mobileNumber1, mobileNumber2, email, skype);

        view.printEntry(model.getEntry(0));
    }

    private String inputStringValueWithScanner(String message, String regex) {
        String res;
        view.printInputMessage(message);

        while( !(sc.hasNext() && (res = sc.next()).matches(regex)) ) {
            view.printWrongInputMessage(message);
        }

        return res;
    }
}
