package ua.notebook;

public class View {
    public static final String ENTER_INFO = "Enter your ";
    public static final String WRONG_INPUT = "Wrong input. Please enter your ";

    public void printInputMessage(String message) {
        System.out.println(View.ENTER_INFO + message);
    }

    public void printWrongInputMessage(String message) {
        System.out.println(View.WRONG_INPUT + message);
    }

    public void printEntry(String entry) {
        System.out.println("==========Entry==========");
        System.out.println(entry);

    }

}
