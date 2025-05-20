import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        System.out.println();

        //use case 1
        Contact contact = new Contact(
                "John", "Doe", "123 Elm Street", "Springfield",
                "Illinois", "62704", "1234567890", "john.doe@example.com"
        );
        System.out.println(contact);

        //use case 2
        AddressBook addressBook = new AddressBook();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of contacts to add: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Contact " + (i + 1));

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("State: ");
            String state = scanner.nextLine();

            System.out.print("Zip: ");
            String zip = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            Contact contact1 = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
            addressBook.addContacts(contact1);
        }
        System.out.println();
        addressBook.displayContacts();
    }
}
