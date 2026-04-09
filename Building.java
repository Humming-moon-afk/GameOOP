public class Building extends Entity {
    protected String owner;
    public Building(String name, int vitality, double position, String owner){
        super(name, position, vitality);
        this.owner = owner;
    }
}
