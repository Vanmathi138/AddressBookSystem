import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program\n");

        AddressBook addressBook = new AddressBook();
        Map<String, AddressBook> addressBookSystem = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("****************************");
            System.out.println("Address Book System Use cases.....");
            System.out.println("1. Create new Contact in Address book");
            System.out.println("2. Add new Contact using console inputs ");
            System.out.println("3. Display All contacts ");
            System.out.println("4. Edit existing contact by their name using console ");
            System.out.println("5. Delete a contact by their name using console ");
            System.out.println("6. Add multiple contact to address book");
            System.out.println("7. Exit");
            System.out.println("****************************");
            System.out.print("Enter option: ");

            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter new Address Book Name: ");
                    String newBookName = scan.nextLine();
                    if (addressBookSystem.containsKey(newBookName)) {
                        System.out.println("Address Book already exists!");
                    } else {
                        addressBookSystem.put(newBookName, new AddressBook());
                        System.out.println("Address Book created: " + newBookName);
                    }
                    break;
                case 2:
                    System.out.print("Enter Address Book Name to Add Contact: ");
                    String bookName = scan.nextLine();
                    AddressBook selectedBook = addressBookSystem.get(bookName);
                    if (selectedBook != null) {
                        addContact(scan, selectedBook);
                    } else {
                        System.out.println("Address Book not found!");
                    }
                    break;
                case 3:
                    for (String name : addressBookSystem.keySet()) {
                        System.out.println("\nAddress Book: " + name);
                        addressBookSystem.get(name).displayContacts();
                    }
                    break;
                case 4:
                    editExistingContact(scan, addressBook);
                    break;
                case 5:
                    deleteContact(scan,addressBook);
                    break;
                case 6:
                    addMultipleContact(scan, addressBook);
                    break;
                case 7:
                    System.out.println("Exiting.......");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
//use case 5
    private static void addMultipleContact(Scanner scanner, AddressBook addressBook) {
        boolean addMore = true;

        while (addMore){
            System.out.println("\nEnter details for Contact");

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

            System.out.println("Do you want to add more? (Yes/No): ");
            String choice = scanner.nextLine();
            addMore = choice.equalsIgnoreCase("yes");
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
