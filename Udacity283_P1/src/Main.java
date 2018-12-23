public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        ContactsManager myContactManager = new ContactsManager();
        Contact myContact = new Contact();

        myContact = myContact.setContact("9999999999", "Miley", "miley@miley.com");

        myContactManager.addContact(myContact);

        Contact foundContact = myContactManager.searchContact("Miley");

        if(foundContact != null)
        {
            System.out.println("Found "+foundContact.name+" having email: "+foundContact.email);
            System.out.println(foundContact.phoneNumber);
        }
    }
}
