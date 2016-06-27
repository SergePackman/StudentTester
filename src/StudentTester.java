import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Serge on 27.06.2016.
 */
public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student(12, "Tomas", "123-456", 4.5);
        Student s2 = new Student(13, "Varis", "654-321", 2.5);
        s1.setStudentId(11);
        s1.setStudentName("Tom");
        s2.setStudentSsn("111-222");
        s2.setStudentGpa(4.0);

        System.out.println(s1.getStudentId());
        System.out.println(s1.getStudentName());
        System.out.println(s1.getStudentSsn());
        System.out.println(s1.getStudentGpa());
        System.out.println();
        System.out.println(s2.getStudentId());
        System.out.println(s2.getStudentName());
        System.out.println(s2.getStudentSsn());
        System.out.println(s2.getStudentGpa());
    }
}
