
public class multi {
    
    static class Parent{

        int salary = 100000;
        void Property (){
            System.out.println("Parent salary " + salary);
        }
    }

    static class Child1 extends Parent{
        
        int childSalary1 = 50000;
        void ChildProperty1 (){
            System.out.println("Child1 salary " + childSalary1);
        }
    }

    static class Child2 extends Child1{
        
        int childSalary2 = 40000;
        void ChildProperty2 (){
            System.out.println("Child2 salary " + childSalary2);
        }
    }

    public static void main(String[] args) {
        Child2 ch = new Child2();
        
        ch.Property();
        ch.ChildProperty1();
        ch.ChildProperty2();
    }
}
