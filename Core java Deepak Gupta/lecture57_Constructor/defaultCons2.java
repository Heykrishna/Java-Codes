public class defaultCons2 {
    int studentId;
    String name;
    String course;

    public static void main(String[] args) {

        defaultCons2 d = new defaultCons2();    // default constructor

        d.studentId = 1;
        d.name = "Krishna";
        d.course = "Java";
        
        System.out.println(d.studentId);    // int default value = 0
        System.out.println(d.name);
        System.out.println(d.course);


    }
}
