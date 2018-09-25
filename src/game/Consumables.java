package game;

import java.util.HashMap;
import java.util.Map;

public class Consumables {
    public static Map<String, Integer> foodList = new HashMap<>();
    Consumables(){
        foodList.put("Apple",10);
        foodList.put("Cooked Pork",30);
        foodList.put("Rotten Apple",-20);
        foodList.put("Rotten Pork",-60);
    }
}
