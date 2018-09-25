package game;

public class Character {
    String name;
    int health;
    int attackPower;

    public void attack(Character enemy){
        enemy.health = enemy.health - attackPower;
    }

    public int getHealth(){
        return this.health;
    }
}
