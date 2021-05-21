public class SimpleArray {
    public static void main(String[] args) {
        String[] movies = new String[5];
        movies[0] = "Harry Potter";
        movies[1] = "Lord of the Rings";
        movies[2] = "Forrest Gump";
        movies[3] = "Breaking Bad";
        movies[4] = "Stranger Things";

        String[] movies2 = {"tytul 1", "tytul 2", "tytul 3", "tytul 4", "tytul 5"};
        String movie = movies[3];
        System.out.println(movie);

        String movie2 = movies2[2];
        System.out.println(movie2);
    }
}
