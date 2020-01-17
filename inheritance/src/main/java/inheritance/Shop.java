package inheritance;

import java.util.LinkedList;

public class Shop extends Store {

    String description;

    public Shop(String name, String description, int price, int stars) {
        super(name, stars, price); //why did it not populate from the super class without the static in front of public
        this.description = description;
    }

    public String toString(){
        return super.toString() + "\nDescription: " + this.description;
    }
}
