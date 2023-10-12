public class Project {
    public int aaa(){
        class D {
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
        D a = new D();
        a.printABC();
        return 1;
    }
}
