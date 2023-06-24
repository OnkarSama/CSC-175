public class Kennel {

    public static void main(String[] args) {
        // Instantiate several Dog objects
        Dog dog1 = new Dog("Rufus", 3);
        Dog dog2 = new Dog("Max", 5);
        Dog dog3 = new Dog("Buddy", 7);

        // Compute and print ages in "person years"
        System.out.println(dog1.getName() + " is " + dog1.computePersonYears() + " years old in human years.");
        System.out.println(dog2.getName() + " is " + dog2.computePersonYears() + " years old in human years.");
        System.out.println(dog3.getName() + " is " + dog3.computePersonYears() + " years old in human years.");

        // Test case
        double expected = 49.0;
        double actual = dog3.computePersonYears();
        System.out.println("Expected: " + expected + ", Actual: " + actual);
    }
}