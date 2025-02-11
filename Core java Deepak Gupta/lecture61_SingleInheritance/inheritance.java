
public class inheritance {
    
    static class parent {
        int salary = 100000;
    }


    static class child extends parent {
        int childSalary = 50000;
        
        
    }
    
    public static void main(String[] args) {

        child ch = new child();

        System.out.println(ch.salary);
        System.out.println(ch.childSalary);
    }
    
}
