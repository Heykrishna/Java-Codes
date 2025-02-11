
public class inheritance2 {
    
    static class parent{

        void Data(){
            int salary = 100000;
            System.out.println(salary);
        }

    }

    static class child extends parent{
        
        void Data1(){
            int childSalary = 50000;    // local variable 
            System.out.println(childSalary);
        }

    }

    public static void main(String[] args) {

        child ch = new child();

        ch.Data();
        ch.Data1();

    }

}



