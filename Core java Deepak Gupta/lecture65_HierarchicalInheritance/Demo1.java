
public class Demo1 {

    static class Super {

        int a = 10, b = 20;

        void add() {
            System.out.println("The sum is " + (a + b));
        }
    }


    static class subshcild1 extends Super {
    
        void sub() {
            System.out.println("The difference is " + (a - b));
        }
    }

    static class subchild2 extends Super {
    
        void mul() {
            System.out.println("The multiplication is " + (a * b));
        }
    }

    static class subchild3 extends Super {
    
        void div() {
            System.out.println("The division is " + (a / b));
        }
    }


    public static void main(String[] args) {

        // Object of subchild 3
        subchild3 s = new subchild3();
        s.add();
        s.div();

    }

}


