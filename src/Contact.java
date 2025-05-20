public class Contact{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private String phone_number;
    private String email;

    public Contact(String firstName, String lastName, String address, String city, String state,
                   int zipcode, String phone_number, String email){
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
