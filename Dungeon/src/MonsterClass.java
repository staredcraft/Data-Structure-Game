/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class MonsterClass {

    protected String name;
    protected String description;
    protected int hitPoints;
    protected int minDamage;
    protected int maxDamage;
    Random random = new Random();
     Set<Integer> monstersSeen = new HashSet<Integer>();
    protected int NUM_MONSTERS = 3;

    public MonsterClass newRandomInstance() {
        if (monstersSeen.size() == NUM_MONSTERS) {
            monstersSeen.clear();
        }
        int i;
        do {
            i = random.nextInt(NUM_MONSTERS);
        } while (monstersSeen.contains(i));
        monstersSeen.add(i);

        if (i == 0) {
            return new MonsterClass("Harpy", "", 6, 8, 12);
        } else if (i == 1) {
            return new MonsterClass("Gargoyle", "", 6, 4, 6);
        } else {
            return new MonsterClass("Hobgoblin", "", 6, 1, 2);
        }
    }


    private MonsterClass(String name, String description, int hitPoints, int minDamage, int maxDamage) {
        this.name = name;
        this.description = description;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return "Monster HP: " + hitPoints;
    }

    public int attack() {
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }


    public boolean isAlive() {
        return hitPoints > 0;
    }

}