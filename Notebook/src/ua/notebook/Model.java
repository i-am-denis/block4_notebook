package ua.notebook;

public class Model {
    private NoteBook noteBook;;

    public Model() {
        noteBook = new NoteBook();
    }

    public void addEntry(
            String lastName,
            String firstName,
            String patronymic,
            String nickname,
            String comment,
            String group,
            String homePhoneNumber,
            String mobileNumber1,
            String mobileNumber2,
            String email,
            String skype)
    {
        String fullName = lastName + " " + firstName + " " + patronymic;
        Group realGroup = Group.valueOf("group" + group);

        Entry entry = new Entry(
                lastName,
                firstName,
                patronymic,
                fullName,
                nickname,
                comment,
                realGroup,
                homePhoneNumber,
                mobileNumber1,
                mobileNumber2,
                email,
                skype);

        noteBook.addEntry(entry);
    }

    public String getEntry(int index) {
        return noteBook.getEntry(0).toString();
    }
}
