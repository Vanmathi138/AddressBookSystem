import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program\n");

        // use case 1
        Contact contact = new Contact(
                "John", "Doe", "123 Elm Street", "Springfield",
                "Illinois", "62704", "1234567890", "john.doe@example.com"
        );
        System.out.println(contact);

        AddressBook addressBook = new AddressBook();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("****************************");
            System.out.println("Address Book System Use cases.....");
            System.out.println("1. Add new Contact using console inputs: ");
            System.out.println("2. Display All contacts: ");
            System.out.println("3. Edit existing contact by their name using console: ");
            System.out.println("4. Delete a contact by their name using console: ");
            System.out.println("5. Exit");
            System.out.println("****************************");
            System.out.print("Enter option: ");

            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    addContact(scan, addressBook);
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    editExistingContact(scan, addressBook);
                    break;
                case 4:
                    deleteContact(scan,addressBook);
                    break;
                case 5:
                    System.out.println("Exiting.......");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
//use case 4
    private static void deleteContact(Scanner scan, AddressBook addressBook) {
        System.out.print("Enter the first name to delete contact: ");
        String name = scan.nextLine();

        addressBook.deleteContact(name);
    }

    //use case 3
    private static void editExistingContact(Scanner scan, AddressBook addressBook) {
        System.out.print("Enter first name to edit existing contact: ");
        String name = scan.nextLine();

        Contact contact =  addressBook.findContactByFirstName(name);

        if(contact == null){
            System.out.println("Contact not found with the name: "+name);
            return;
        }
        System.out.println("Enter the details to be edited: ");
        System.out.println("New first Name: ");
        contact.setFirstName(scan.nextLine());

        System.out.println("New last Name: ");
        contact.setLastName(scan.nextLine());

        System.out.println("New Address: ");
        contact.setAddress(scan.nextLine());

        System.out.println("New Zipcode: ");
        contact.setZipcode(scan.nextLine());

        System.out.println("New Phone number: ");
        contact.setPhone_number(scan.nextLine());

        System.out.println("New city: ");
        contact.setCity(scan.nextLine());

        System.out.println("New State: ");
        contact.setState(scan.nextLine());

        System.out.println("New Email: ");
        contact.setEmail(scan.nextLine());

        System.out.println("Contact updated successfully!");
    }

    //use case 2
    public static void addContact(Scanner scanner, AddressBook addressBook) {
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
    }
}
