/*
this class contain the specilalization information for the person.
 */
public class Specialization {
    private String AreaOfSpecialization;
    private int StratYear;
    /*
    a constructor for specialization class.
     */
    public Specialization(String areaOfSpecialization, int startYear) {
        this.AreaOfSpecialization = areaOfSpecialization;
        this.StratYear = startYear;
    }
    /*
    a setter and getter functions for specialization class
     */
    public void setAreaOfSpecialization(String areaOfSpecialization) {
        AreaOfSpecialization = areaOfSpecialization;
    }

    public void setStratYear(int stratYear) {
        StratYear = stratYear;
    }

    public int getStratYear() {
        return StratYear;
    }

    public String getAreaOfSpecialization() {
        return AreaOfSpecialization;
    }
}