import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

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
}
