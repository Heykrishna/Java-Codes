public class JavaClass {
    int studentId;          // non-static variable 
    String name;
    String course;

    public static void main(String[] args) {
        
        JavaClass obj = new JavaClass();
        obj.studentId = 1;
        obj.name = "Krishna";
        obj.course = "Java";
        System.out.println(obj.studentId);
        System.out.println(obj.name);
        System.out.println(obj.course);
        

        JavaClass obj2 = new JavaClass();
        obj2.studentId = 2;
        obj2.name = "Cutie";
        obj2.course = "Java";  
        System.out.println(obj2.studentId);
        System.out.println(obj2.name);
        System.out.println(obj2.course);
    }
}


// In class you can store values of multiple students 

