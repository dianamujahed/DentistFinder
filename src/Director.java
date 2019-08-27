public class Director {
    private Builder builder;
    private PortalForm portalForm=new PortalForm();
    private SpecialityForm specialityForm=new SpecialityForm();
    public void setBuilder(Builder builder)
    {
        this.builder=builder;
    }
    public void constructGeneralDentist(Builder builder)
    {
        builder.setEmailAddress(portalForm.getEmail().getText());
        System.out.print(portalForm.getEmail().getText());
        builder.setFirstName(portalForm.getFirstName().getText());
        builder.setLastName(portalForm.getLastName().getText());
        builder.setGender(portalForm.getGender().getText());
        builder.setLicenceNumber(portalForm.getLicenseNumber().getText());
        builder.setLicenseCountryName(portalForm.getLicenseCountry().getText());
        builder.setPhoneNumber(portalForm.getPhoneNumber().getText());
        builder.setWebsite(portalForm.getWebsite().getText());
        builder.setYearOfPractice(portalForm.getYearsInPractice().getText());
        builder.setEducation(new Education(portalForm.getDegree().getText(),portalForm.getMajor().getText(),
                portalForm.getSchool().getText(),portalForm.getYear().getText()));
        builder.setAddress(new Address(portalForm.getCountry().getText(),portalForm.getState().getText(),
          portalForm.getCity().getText(),Integer.parseInt(portalForm.getPostalCode().getText())));

    }
    public void constructSpesialistlDentist(Builder builder)
    {
        builder.setEmailAddress(portalForm.getEmail().getText());
        System.out.print(portalForm.getEmail().getText());
        builder.setFirstName(portalForm.getFirstName().getText());
        builder.setLastName(portalForm.getLastName().getText());
        builder.setGender(portalForm.getGender().getText());
        builder.setLicenceNumber(portalForm.getLicenseNumber().getText());
        builder.setLicenseCountryName(portalForm.getLicenseCountry().getText());
        builder.setPhoneNumber(portalForm.getPhoneNumber().getText());
        builder.setWebsite(portalForm.getWebsite().getText());
        builder.setYearOfPractice(portalForm.getYearsInPractice().getText());
        builder.setEducation(new Education(portalForm.getDegree().getText(),portalForm.getMajor().getText(),
                portalForm.getSchool().getText(),portalForm.getYear().getText()));
        builder.setAddress(new Address(portalForm.getCountry().getText(),portalForm.getState().getText(),
                portalForm.getCity().getText(),Integer.parseInt(portalForm.getPostalCode().getText())));
        builder.setSpecialization(new Specialization(specialityForm.getAreaOfSpecialization().getText(),
                Integer.parseInt(specialityForm.getStartYear().getText())));

    }
}
