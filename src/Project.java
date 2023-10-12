public class Project {
    public int aaa(){
        class A {
            public void printABC(){
                System.out.println(123);
            }
        }
        class B {
            public void printABC(){
                int d = 1;

                System.out.println("A");
                System.out.println("B");
                System.out.println("C");

                System.out.println(d);
            }
        }
        A a = new A();
        a.printABC();
        return 1;
    }
}
