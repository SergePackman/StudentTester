import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Serge on 27.06.2016.
 */
public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Tomas", "Fogel", "Passive");
        Student s2 = new Student(3, "Carl", "Newman", "Passive");

        s2.setId(2);
        s2.setfName("Caron");
        s2.setstuStatus("Active");

        System.out.println(s1);
        System.out.println(s2);
    }
}
