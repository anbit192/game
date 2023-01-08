package abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

        Character mage = new Mage();
        Character fighter = new Fighter();

        mage.greets(); // abstraction
        fighter.greets(); // abstraction

        // ko the tao doi tuong o lop Character
        // Character char = new Character(); => ERROR

    }
}
