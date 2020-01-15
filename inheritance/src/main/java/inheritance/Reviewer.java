package inheritance;

public interface Reviewer {
    //By interface, we can support the functionality of multiple inheritance.
    int addReview(Reviews review);
    String toString();
}
