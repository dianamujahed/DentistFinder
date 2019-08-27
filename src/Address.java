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
    public void set_city(String city) {
        City = city;
    }

    public void set_country(String country) {
        Country = country;
    }

    public void set_postalCode(int postalCode) {
        PostalCode = postalCode;
    }

    public void set_state(String state) {
        State = state;
    }

    public void set_street(String street) {
        Street = street;
    }
    /*
    getter functions for address attributes.
     */
    public int get_postalCode() {
        return PostalCode;
    }

    public String get_city() {
        return City;
    }

    public String getcountry() {
        return Country;
    }

    public String get_state() {
        return State;
    }

    public String get_street() {
        return Street;
    }
}