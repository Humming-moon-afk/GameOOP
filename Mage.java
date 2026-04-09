public class Mage extends Player implements Fireball {
    public Mage(String name, double position, int vitality, int mana, int level) {
        super(name, vitality, position, level, mana);
    }
    public void castFireball(Entity e) {
        if (!e.isAlive) {
            System.out.println(e.name + " ist bereits tot!");
            return;
        }
        mana -= 50;
        e.vitality -= 50;
        if (e.vitality < 0) {
            e.vitality = 0;
            e.isAlive = false;
            System.out.println(e.name + " ist gestorben!");
            gainExp(50);
        } else {
        System.out.println(this.name + " schleudert einen Feuerball");
        System.out.println(e.name + " hat nur noch " + e.vitality + " HP übrig");
        }
    }
}
