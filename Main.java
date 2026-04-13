import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Entity> worldObjects = new ArrayList<>();

        
        Player milian = new Player("Milianimus", 30, 0.0, 1, 100);
        
        Building spawn = new Building("Spawn", 1000, 50.0, "System");
        
        Mage milian2Acc = new Mage("Mili", 10.0, 80, 200, 5);

        Mage kim = new Mage("Redhead", 50, 10000, 2000, 67);

        worldObjects.add(milian);
        worldObjects.add(spawn);
        worldObjects.add(milian2Acc);
        worldObjects.add(kim);

        System.out.println("--- Objekte derzeit in der Welt ---");
        for (Entity e : worldObjects) {
            System.out.println("Entity gefunden: " + e.name + " an Position: " + e.position);
        }

        System.out.println("\n--- Interaktionen ---");        
        milian2Acc.castFireball(milian);
        milian2Acc.expLeft();
        milian2Acc.getLevel();
        milian2Acc.castFireball(milian);
        milian2Acc.getLevel();
        milian2Acc.drinkManaPotion();
        milian2Acc.getIntelligence();
        kim.getLevel();
        milian2Acc.castFreeze(kim);
        kim.castFireball(milian2Acc);
        kim.castFireball(milian2Acc);
        kim.levelUp();
        kim.levelUp();

    }
}