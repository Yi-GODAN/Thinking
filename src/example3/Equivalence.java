package example3;
//: operators/Equivalence.java

public class Equivalence {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Integer n1 = new Integer(47);
        @SuppressWarnings("deprecation")
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));
    }

}//:~
