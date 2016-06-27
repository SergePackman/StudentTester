public class Student {
    private int stuId;
    private String fName;
    private String lName;
    private String stuStatus;
    private Double gpa;
    public final int SchCode = 34958;

    public Student(int i, String f, String l, String s){
        stuId = i;
        fName = f;
        lName = l;
        stuStatus = s;
    }

    public int getId() {
        return stuId;
    }
    public void setId(int x) {
        stuId = x;
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String x) {
        fName = x;
    }

    public String getlName() {
        return lName;
    }
    public void setlName(String x){
        lName = x;
    }

    public String getstuStatus() {
        return stuStatus;
    }
    public void setstuStatus(String x){
        stuStatus = x;
    }

    public String toString(){
        String s1 = "";
        s1 =    "Student ID: \t"+getId()+"\n"+
                "Student Name:\t"+getfName()+" "+getlName()+"\n"+
                "Student Status:\t"+getstuStatus()+"\n"+
                "- - - - - - - - -";
        return s1;
    }
}
