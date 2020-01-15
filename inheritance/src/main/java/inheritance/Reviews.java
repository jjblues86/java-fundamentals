package inheritance;

public class Reviews {

    public String body;
    public String author;
    public int numberOfStars;

    public Reviews(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }

    public String toString(){
        return String.format("Review: %s\n by %s.\n %s star rating.", this.body, this.author, this.numberOfStars);
    }
}
