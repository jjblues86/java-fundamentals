/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Restaurant {

    int price;

    public Restaurant(String name, int stars, int price) {
        super(name, stars);
        this.price = price;
        this.stars = stars;

    }

    public int getPrice() {
        return price;
    }
}
