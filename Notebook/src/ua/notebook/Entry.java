package ua.notebook;

public class Entry {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String fullName;
    private String nickname;
    private String comment;
    private Group group;
    private String homePhoneNumber;
    private String mobileNumber1;
    private String mobileNumber2;
    private String email;
    private String skype;

    public Entry(
        final String lastName,
        final String firstName,
        final String patronymic,
        final String fullName,
        final String nickname,
        final String comment,
        Group group,
        final String homePhoneNumber,
        final String mobileNumber1,
        final String mobileNumber2,
        final String email,
        final String skype) 
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.fullName = fullName;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.homePhoneNumber = homePhoneNumber;
        this.mobileNumber1 = mobileNumber1;
        this.mobileNumber2 = mobileNumber2;
        this.email = email;
        this.skype = skype;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", fullName='" + fullName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", mobileNumber1='" + mobileNumber1 + '\'' +
                ", mobileNumber2='" + mobileNumber2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                '}';
    }
}
