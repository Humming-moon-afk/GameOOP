public class Player extends Entity {
    protected int level;
    protected int mana;
    protected int currentExp;
    protected int expToNextLevel;
    public Player(String name, int vitality, double position, int level, int mana) {
        super(name, position, vitality);
        this.level = level;
        this.mana = mana;
        this.currentExp = 0;
        this.expToNextLevel = 100;
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    public int getLevel() {
        return level;
    }
    public int getMana() {
        return mana;
    }
    public int getXp() {
        return currentExp;
    }
    public int getXpNextLevel() {
        return expToNextLevel;
    }
    public void gainExp(int amount) {
        this.currentExp += amount;
        System.out.println(this.name + " erhält " + amount + " Erfahrungspunkte.");
        if(this.currentExp >= this.expToNextLevel) {
            levelUp();
        }
    }
    protected void levelUp() {
        this.currentExp -= this.expToNextLevel;
        this.level++;
        this.expToNextLevel +=20;
        System.out.println("---NOTIFICATION: LEVELUP! --- ");
        System.out.println("YOUR LEVEL IS NOW: " + this.level);
    }
    public void expLeft() {
        int missingXp = getXpNextLevel() - getXp();
        int nextLevel = getLevel()+1;
        System.out.println(getName() + "fehlen noch " + missingXp + " XP für Level " + nextLevel);
    }
    public void drinkManaPotion() {
        if(getMana() == 100) {
            System.out.println("Mana ist schon voll!");
        } else {
        this.mana = 100;
        System.out.println(getName() + " trinkt einen trank und hat nun " + getMana() + " Mana");
        }
    }
}
