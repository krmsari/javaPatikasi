package Java102.NestedveInnerClasses;

public class NestedAndInner {

    public void run(){
        System.out.println("Nested method");
        Inner inner = new Inner();
        inner.run();
    }
    public class Inner{
        public void run(){
            System.out.println("Inner method");
        }
    }
}
