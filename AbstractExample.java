/*
    Object can not be intiantiated from abstrac class

 */
package Abstract;

/**
 *
 * @author abli
 */
abstract class Super {

    public Super() {
        System.out.println("Super Constructor");
    }

    public void method1() {
        System.out.println("Method 01");

    }

    abstract public void method2();

}

class Sub extends Super {

    @Override
    public void method2() {
        System.out.println("Sub method2 ");
    }

}

public class AbstractExample {

    public static void main(String[] args) {

        Super aSuper = new Sub();
        aSuper.method1();
        aSuper.method2();
        
    }

}
