package example5;

//:	initialization/OverLoadingOrder.java
//	OverLoading based on the order of the argument.
public class OverLoadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");

    }

}
