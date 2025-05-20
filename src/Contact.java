public class Contact{
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String city;
    private final String state;
    private final String zipcode;
    private final String phone_number;
    private final String email;

    public Contact(String firstName, String lastName, String address, String city, String state,
                   String zipcode, String phone_number, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phone_number = phone_number;
        this.email = email;
    }
    public String toString() {
        return "Contact: \n" +
                "firstName = " + firstName + "\n" +
                "lastName = " + lastName + "\n" +
                "address = " + address + "\n" +
                "city = " + city + "\n" +
                "state = " + state + "\n" +
                "zip = " + zipcode + "\n" +
                "phoneNumber = " + phone_number + "\n" +
                "email = " + email + "\n" ;
    }
}
