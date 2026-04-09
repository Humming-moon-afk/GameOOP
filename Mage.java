public class Mage extends Player implements Fireball {
    private int intelligence;
    public Mage(String name, double position, int vitality, int mana, int level) {
        super(name, vitality, position, level, mana);
        this.intelligence = 20;
    }
    public void castFireball(Entity e) {
        if (!e.isAlive) {
            System.out.println(e.name + " ist bereits tot!");
            return;
        }
        mana -= 50;
        int damage = 50 + this.intelligence;
        e.vitality -= damage;
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
    @Override
    public void levelUp() {
        super.levelUp();
        this.intelligence += 2;
    }
}

