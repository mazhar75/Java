package p1;

class C {
    A p = new A();

    C() {
        System.out.println("x=" + p.x); // OK
        // System.out.println("y=" + p.y); // ERROR: y is private
        System.out.println("z=" + p.z); // OK
        System.out.println("q=" + p.q); // OK
    }
}
