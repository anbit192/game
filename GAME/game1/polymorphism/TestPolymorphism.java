package polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal cat = new Cat("shironeko"); // polymorphism
        Animal dog = new Dog("tom"); // polymorphism
        Cat cat2 = new Cat("jerry"); // polymorphism

        cat.makeNoise();
        dog.makeNoise();
    }
}
