package Static;
import java.util.*;

public class static_ {
    static int sv1 = 11;
    static int sv2 = 22;

    int iv1 = 33;
    int iv2 = 44;

    static void staticMethod1() {
        static_ obj = new static_();
        System.out.println("Instance variables: " + obj.iv1 + ", " + obj.iv2);
    }

    void instanceMethod1() {
        System.out.println("Static variables: " + sv1 + ", " + sv2);
    }

    static void staticMethod2() {
        static_ obj = new static_();
        obj.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
    }

    public static void main(String[] args) {
        static_ stc = new static_();

        // 8. Prints all the static, instance variables in main method
        System.out.println("Static variables: " + sv1 + ", " + sv2);
        System.out.println("Instance variables: " + stc.iv1 + ", " + stc.iv2);

        staticMethod1();
        staticMethod2();
        
        stc.instanceMethod1();
        stc.instanceMethod2();
    }
}
