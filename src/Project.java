public class Project {
    public int aaa(){
        class A {
            public void printABC(){
                System.out.println("A");
                System.out.println("B");
                System.out.println("C");
            }
        }
        A a = new A();
        a.printABC();
        return 1;
    }
}
