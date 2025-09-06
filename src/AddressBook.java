import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public AddressBook(){
        this.contacts = new ArrayList<>();
    }
    public void addContacts(Contact contact) {
        boolean exists = contacts.stream()
                .anyMatch(c -> c.equals(contact)); // uses overridden equals

        if (exists) {
            System.out.println("Duplicate contact found! Cannot add.");
        } else {
            contacts.add(contact);
            System.out.println("Contact added successfully");
        }
    }


    public void displayContacts(){
        if(!contacts.isEmpty()){
            System.out.println("All contacts");
            for (Contact contact: contacts){
                System.out.println(contact);
            }
        }else {
            System.out.println("Contact is empty");
        }
    }

    public Contact findContactByFirstName(String firstName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                return contact;
            }
        }
        return null;
    }
    public List<Contact> getContacts() {
        return contacts;
    }

    public void deleteContact(String firstName){
        Contact contact = findContactByFirstName(firstName);
        if(contact == null){
            System.out.println("Contact not found with name: "+ firstName);
        }else {
            contacts.remove(contact);
            System.out.println("Contact deleted successfully.");
        }
    }

    public void sortContactsByName() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to sort.");
            return;
        }

        List<Contact> sortedList = contacts.stream()
                .sorted((c1, c2) -> {
                    int firstNameCompare = c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
                    if (firstNameCompare != 0) {
                        return firstNameCompare;
                    } else {
                        return c1.getLastName().compareToIgnoreCase(c2.getLastName());
                    }
                })
                .toList();

        System.out.println("\nContacts sorted by Name:");
        sortedList.forEach(System.out::println);
    }

}
