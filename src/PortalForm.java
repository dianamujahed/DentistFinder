import javax.swing.*;

public class PortalForm {
    private JPanel panel1;
    private JTextField email;
    private JTextField phoneNumber;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField website;
    private JTextField licenseCountry;
    private JTextField licenseNumber;
    private JTextField yearsInPractice;
    private JTextField gender;
    private JTextField degree;
    private JTextField year;
    private JTextField major;
    private JTextField school;
    private JTextField country;
    private JTextField city;
    private JTextField state;
    private JTextField postalCode;
    private JButton addButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PortalForm");
        frame.setContentPane(new PortalForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JTextField getEmail() {
        return email;
    }

    public JTextField getPhoneNumber() {
        return phoneNumber;
    }

    public JTextField getFirstName() {
        return firstName;
    }

    public JTextField getLastName() {
        return lastName;
    }

    public JTextField getWebsite() {
        return website;
    }

    public JTextField getLicenseCountry() {
        return licenseCountry;
    }

    public JTextField getLicenseNumber() {
        return licenseNumber;
    }

    public JTextField getYearsInPractice() {
        return yearsInPractice;
    }

    public JTextField getGender() {
        return gender;
    }

    public JTextField getDegree() {
        return degree;
    }

    public JTextField getYear() {
        return year;
    }

    public JTextField getMajor() {
        return major;
    }

    public JTextField getSchool() {
        return school;
    }

    public JTextField getCountry() {
        return country;
    }

    public JTextField getCity() {
        return city;
    }

    public JTextField getState() {
        return state;
    }

    public JTextField getPostalCode() {
        return postalCode;
    }

    public JButton getAddButton() {
        return addButton;
    }
}
