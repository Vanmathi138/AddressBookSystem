import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public AddressBook(){
        this.contacts = new ArrayList<>();
    }
    public void addContacts(Contact contact){
        contacts.add(contact);
        System.out.println("Contact added successfully");
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
}
