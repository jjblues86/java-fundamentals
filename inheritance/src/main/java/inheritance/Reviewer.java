package inheritance;

public interface Reviewer {
    //By interface, we can support the functionality of multiple inheritance.
     void addReview(Reviews review);
    String toString();
}
