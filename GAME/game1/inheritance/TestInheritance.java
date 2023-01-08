package inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Cat normalCat = new Cat("neko");
        PurpleCat weirdCat = new PurpleCat("purple");

        normalCat.makeNoise();
        weirdCat.makeNoise(); // weirdCat ke thua normalCat nen dung duoc ham makeNoise()
    }
}
