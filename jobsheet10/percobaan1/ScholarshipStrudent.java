package jobsheet10.percobaan1;

public class ScholarshipStrudent extends Student{
    private String sponsor;

    public ScholarshipStrudent(String name, String sponsor) {
        this.name = name;
        this.sponsor = sponsor;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    @Override 
    public String getStudentInfo() {
        String info = super.getStudentInfo() +"\n";
        info += "Registered as scholarship student sponsored by" +sponsor +"\n";
        return info;
    }
    
}
