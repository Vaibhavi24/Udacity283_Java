public class Contact {

    String phoneNumber;
    String name;
    String email;

    public Contact setContact(String phoneNumber, String name, String email)
    {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;

        return (this);
    }
}
