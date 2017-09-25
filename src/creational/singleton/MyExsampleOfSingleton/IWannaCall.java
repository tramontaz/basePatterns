package creational.singleton.MyExsampleOfSingleton;

public class IWannaCall {
    public static void main(String[] args) {
        PhoneBook.getPhoneBook().addContact("Marty +1565464646465");
        PhoneBook.getPhoneBook().addContact("Connor +98464654561513");
        PhoneBook.getPhoneBook().addContact("Shults +86546546546545");

        PhoneBook.getPhoneBook().getContactList();
    }
}
