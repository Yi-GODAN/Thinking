package example5;
//:	initialization/OverLoading.java
//	Demonstration of both constructor
//	and ordinary method overloading

class Tree {
    int height;

    Tree() {
        System.out.println("Planting a seeding");
        height = 0;
    }

    Tree(int initialHeigth) {
        height = initialHeigth;
        System.out.println("Tree is " + height + " feet tall ");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println("Tree is " + height + " feet tall");
    }
}

public class OverLoading {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        //	Overloaded method:
        new Tree();
    }

}
