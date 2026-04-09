public class Player extends Entity {
    protected int level;
    protected int mana;
    public Player(String name, int vitality, double position, int level, int mana) {
        super(name, position, vitality);
        this.level = level;
        this.mana = mana;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
}
