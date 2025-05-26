package movies;
class Movie {
    private String title;
    private String director;
    private String genre;
    private int rating;

    public Movie(String title, String director, String genre, int rating) {
        this.title = capitalizeWords(title);
        this.director = capitalizeWords(director);
        this.genre = genre;
        this.rating = rating;
    }

    private String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            capitalized.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1)).append(" ");
        }
        return capitalized.toString().trim();
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");
        System.out.println("----------------------");
    }

    public static Movie compareRatings(Movie m1, Movie m2) {
        return (m1.rating >= m2.rating) ? m1 : m2;
    }
}


