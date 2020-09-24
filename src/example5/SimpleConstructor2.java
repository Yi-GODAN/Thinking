package example5;
//:	initialization/SimpleConstrucor2.java
//	Demonstration of a simple constructor.

class Rock2 {
    Rock2(int i) {    // This is the constructor
        System.out.println("Rock " + i + " ");
    }
}

public class SimpleConstructor2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }

    }

}
