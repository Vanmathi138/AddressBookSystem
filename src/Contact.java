public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phone_number;
    private String email;

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

    @Override
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return firstName.equalsIgnoreCase(contact.firstName) &&
                lastName.equalsIgnoreCase(contact.lastName);
    }

    @Override
    public int hashCode() {
        return (firstName.toLowerCase() + lastName.toLowerCase()).hashCode();
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void setAddress(String address){ this.address = address; }
    public void setEmail(String email){ this.email = email; }
    public void setCity(String city){ this.city=city; }
    public void setState(String state){ this.state=state; }
    public void setZipcode(String zipcode){ this.zipcode=zipcode; }
    public void setPhone_number(String phone_number){ this.phone_number=phone_number; }
}
