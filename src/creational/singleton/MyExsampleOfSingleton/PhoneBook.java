package creational.singleton.MyExsampleOfSingleton;

public class PhoneBook {
    private static PhoneBook phoneBook;
    private static String phoneBookFile = "Phonebook: \n";

    public static synchronized PhoneBook getPhoneBook() {
        if (phoneBook == null) {
            phoneBook = new PhoneBook();
        }
        return phoneBook;
    }

    private PhoneBook(){}

    public void addContact(String contact) {
        phoneBookFile += contact + "\n";
    }

    public void getContactList() {
        System.out.println(phoneBookFile);
    }
}
