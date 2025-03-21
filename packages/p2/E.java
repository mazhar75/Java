package p2;

import p1.A; // you need this import

public class E {
    A obj = new A(); // create an instance of A

    public E() {
        System.out.println("Inside E");
        // System.out.println("x=" + obj.x); // ERROR if x is package-private and p2 is a different package
        // System.out.println("y=" + obj.y); // ERROR: private
        // System.out.println("z=" + obj.z); // OK if protected and E is subclass, which it's not
        System.out.println("q=" + obj.q); // OK if public
    }
}
