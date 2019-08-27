
/*
This class contain the basic information about  address for the person.
 */
public class Address {

    private String Country;
    private String State;
    private String City;
    private String Street;
    private int PostalCode;
    /*
    A constructor for address class with parameters.
     */
    public Address(String country, String state, String city, String street, int postalCode) {
        this.Country = country;
        this.State = state;
        this.City = city;
        this.Street = street;
        this.PostalCode = postalCode;
    }
    /*
    Setter functions for address attributes.
     */
    public void setCity(String city) {
        City = city;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setPostalCode(int postalCode) {
        PostalCode = postalCode;
    }

    public void setState(String state) {
        State = state;
    }

    public void setStreet(String street) {
        Street = street;
    }
    /*
    getter functions for address attributes.
     */
    public int getPostalCode() {
        return PostalCode;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    public String getState() {
        return State;
    }

    public String get_street() {
        return Street;
    }
}