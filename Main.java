import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String [] args) {
        List<Entity> worldObjects = new ArrayList<>();
        Player Milian = new Player("Milianimus", 100, 0, 1, 100);
        Building spawn = new Building("Spawn", 1, 0, "System");
        Mage Milian2Acc = new Mage("Mili", 0, 200, 500, 10);
        worldObjects.add(Milian);
        worldObjects.add(spawn);
        
        for(Entity e : worldObjects) {
            System.out.println("Objekte derzeitig in der Welt: " + e.name);
        }
        Milian.sayHello();
        Milian2Acc.castFireball(Milian);
    }
}