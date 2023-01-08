package abstraction;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int atk;

    public Character() {
    }

    public void greets() {
        System.out.println("Hello, Im " + this.name);
    }
}
