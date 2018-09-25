package game;

public class PC extends Character {
    Consumables c = new Consumables();
    PC(String name){
        this.name = name;
        this.health = 100;
        this.attackPower = 10;
    }
    public void eat(String food){
        this.health += Consumables.foodList.get(food);
    }
    public void attack(){

    }
    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
    public int getAttackPower(){
        return this.attackPower;
    }
}
