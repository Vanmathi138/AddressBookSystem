public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        System.out.println();
        Contact contact = new Contact(
                "John", "Doe", "123 Elm Street", "Springfield",
                "Illinois", 62704, "1234567890", "john.doe@example.com"
        );
        System.out.println(contact);
    }
}
