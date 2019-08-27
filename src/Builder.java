/*
we use a builder design pattern to make the dentist class more simple.
so first we create an interface called builder, and the builder specifies methods
for the dentist class parts.
 */
interface Builder{
    public void setFirstName(String firstName);
    public void setLastName(String lastName);
    public void setEmailAddress(String emailAddress);
    public void setWebsite(String website);
    public void setPhoneNumber(String phoneNumber);
    public void setLicenseCountryName(String licenseCountryName);
    public void setLicenceNumber(String licenceNumber);
    public void setYearOfPractice(String yearOfPractice);
    public void setGender(String gender);

}
