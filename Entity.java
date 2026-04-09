public abstract class Entity {
    protected String name;
    protected double position;
    protected int vitality;
    public Entity(String name, double position, int vitality) {
        this.name = name;
        this.position = position;
        this.vitality = vitality;
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
