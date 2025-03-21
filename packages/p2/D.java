package p2;

import p1.A; // you need this if you use class A

public class D extends A {
    public D() {
        System.out.println("Inside D");
       // System.out.println("x=" + x); // OK (package-private if p2 in same package; if not, needs to be public/protected)
        System.out.println("z=" + z); // OK if protected
        System.out.println("q=" + q); // OK if public
    }
}
