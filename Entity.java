public abstract class Entity {
    protected String name;
    protected double position;
    protected int vitality;
    protected boolean isAlive;
    public Entity(String name, double position, int vitality) {
        this.name = name;
        this.position = position;
        this.vitality = vitality;
        this.isAlive = true;
        /**
         * Getters
         */
    } 
    public String getName() {
        return name;
    }
    public double getPosition() {
        return position;
    }
    public int getVitality() {
        return vitality;
    }
}
