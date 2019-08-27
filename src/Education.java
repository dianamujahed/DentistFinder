//this class contains the basic information about education for the person 
public class Education {
    private String Degree;
    private  String major;
    private String school;
    private String year;

    public Education(String degree, String major, String school, String year) {
        this.Degree = degree;
        this.major = major;
        this.school = school;
        this.year = year;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
