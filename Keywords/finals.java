package Keywords;

public class finals {
    // declaring final variable final int age = 18;
    void display() {

        // reassigning value to age variable
        // gives compile time error
        age = 55;
        System.out.println(age);
    }

    public static void main(String[] args) {

        finals obj = new finals();
        // gives compile time error
        obj.display();
    }
}
