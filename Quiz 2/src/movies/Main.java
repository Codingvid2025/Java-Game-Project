package movies;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("star wars", "george lucas", "Sci-Fi", 9);
        Movie movie2 = new Movie("avatar", "james cameron", "Action", 8);
        Movie movie3 = new Movie("the hunger games", "gary ross", "Action", 7);

        System.out.println("Movie Details:");
        movie1.display();
        movie2.display();
        movie3.display();

        System.out.println("Comparing movies:");
        Movie higherRated = Movie.compareRatings(movie1, movie2);
        System.out.println("Higher rated movie:");
        higherRated.display();
    }
}
