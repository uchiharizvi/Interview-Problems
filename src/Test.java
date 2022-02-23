public class Test {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        a.print();
        b.print();
        //for(;;); System.out.println("Executed");
    }
}
