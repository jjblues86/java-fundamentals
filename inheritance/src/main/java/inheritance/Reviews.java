package inheritance;

public class Reviews {

    public String body;
    public String author;
    public int numberOfStars;
    public Store store;
    public String movie;

    public Reviews(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        ratedStar(numberOfStars);
    }

    public Reviews(String body, String author, int numberOfStars, String movie){
        this.body = body;
        this.author = author;
        ratedStar(numberOfStars);
        this.movie = movie;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }


    public int getNumberOfStars() {
        return numberOfStars;
    }


    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void ratedStar(int stars){
        if(stars < 0 || stars > 6){
            throw new IllegalArgumentException("Stars should be integer values between 0-5");
        }
        this.numberOfStars = stars;
    }


    public String toString(){
        return String.format("Review: %s\n by %s.\n %s star rating.", this.body, this.author, this.numberOfStars);
    }
}
