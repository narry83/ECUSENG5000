package KW.CH01;

/**
 *
 * @author Paul
 */
public class CastExample {
    
    public static void main(String[] args) {
        Object aThing;
        aThing = new Integer(25);
        System.out.println(doSomething(aThing));
        System.out.println(doSomething(new Object()));
    }
    
    public static int doSomething(Object o) {
        return (Integer)o;
    }
    
}
