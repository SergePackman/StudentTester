public class Student {
    private int studentId;
    private String name;
    private String ssn;
    private Double gpa;
    public final int SchCode = 34958;

    public Student(int i, String n, String s, Double g){
        studentId = i;
        name = n;
        ssn = s;
        gpa = g;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int x) {
        studentId = x;
    }

    public String getStudentName() {
        return name;
    }
    public void setStudentName(String x) {
        name = x;
    }

    public String getStudentSsn() {
        return ssn;
    }
    public void setStudentSsn(String x){
        ssn = x;
    }

    public Double getStudentGpa() {
        return gpa;
    }
    public void setStudentGpa(Double x){
        gpa = x;
    }
}
