public class DentistBuilder implements Builder {
    private Dentist dentist;

    public DentistBuilder() {
        this.reset();
    }
    // The reset method clears the object being built.
    public void reset() {
        this.dentist = new Dentist();
    }
    public void setEducation(Education education) {
        dentist.setEducation(education);
    }
    public void setAddress(Address address) {
        dentist.setAddress(address);
    }
    public void setSpecialization(Specialization specialization) {
        dentist.setSpecialization(specialization);
    }
    public void setFirstName(String firstName) {
        dentist.setFirstName(firstName);
    }
    public void setLastName(String lastName) {
        dentist.setLastName(lastName);
    }
    public void setEmailAddress(String emailAddress) {
        dentist.setEmailAddress(emailAddress);
    }
    public void setWebsite(String website) {
        dentist.setWebSite(website);
    }
    public void setPhoneNumber(String phoneNumber) {
        dentist.setPhoneNumber(phoneNumber);
    }
    public void setLicenseCountryName(String licenseCountryName) {
        dentist.setLicenseCountryName(licenseCountryName);
    }
    public void setLicenceNumber(String licenceNumber) {
        dentist.setLicenseNumber(licenceNumber);
    }
    public void setYearOfPractice(String yearsInPractice) {
        dentist.setYearsInPractice(yearsInPractice);
    }
    public void setGender(String gender) {

    }
    public Dentist getResult() {
        Dentist FinalDentist = this.dentist;
        this.reset();
        return FinalDentist;

    }


}