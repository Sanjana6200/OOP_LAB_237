abstract class Animal {

    public String name;
    protected int age;
    private double weight;

    static String kingdom = "Animalia";

    final void displayKingdom() {
        System.out.println("Kingdom: " + kingdom);
    }

    public abstract void sound();

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

class Dog extends Animal {

    public static int count = 0;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class ModifiersDemo {

    public static void main(String[] args) {

        Dog d = new Dog("Rocky", 3);
        d.setWeight(15.5);

        System.out.println("Name: " + d.name);
        System.out.println("Age: " + d.age);
        System.out.println("Weight: " + d.getWeight());

        d.sound();
        d.displayKingdom();

        System.out.println("Total Dogs: " + Dog.count);
    }
}
