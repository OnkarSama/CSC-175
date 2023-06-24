public class Dog {
    private String name;
    private float age;

    // Constructor
    public Dog(String name, float age) {

        this.name = name;
        this.age = age;
    }

    // Method to compute and return the age of the dog in "person years"
    public float computePersonYears() {

        return this.age * 7;
    }

    // Getter and setter methods for name and age
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getAge() {

        return age;
    }

    public void setAge(float age) {

        this.age = age;
    }

    // toString method to return one-line description of dog
    public String toString() {

        return("The dogs name is " + this.name + " and its age is " + this.age);
    }

    // equals method to compare dogs
    public boolean equals(Dog that) {

        return this.name.equals(that.getName()) && this.age == that.age;

    }
}
