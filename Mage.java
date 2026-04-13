public class Mage extends Player implements Fireball, Freeze {
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
    public void getIntelligence() {
        System.out.println("Intelligence of " + getName() + " is: " + this.intelligence);
    }
    @Override
    public void levelUp() {
        super.levelUp();
        this.intelligence += 2;
    }
    public void castFreeze(Entity e) {
        if(!e.isAlive) {
            System.out.println(e.name + " ist bereits tot!");
            return;
        }
        mana -=30;
        int damage = 30 + this.intelligence / 2;
        e.vitality -= damage;
        if (e.vitality < 0) {
            e.vitality = 0;
            e.isAlive = false;
            System.out.println(e.name + " ist gestorben!");
            gainExp(50);
        } else {
        System.out.println(this.name + " friert " + e.name + " ein für 1 sekunde!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException i) {
            i.printStackTrace();
        }
        System.out.println(e.name + " hat nur noch " + e.vitality + " HP übrig");
        }
    }
}

