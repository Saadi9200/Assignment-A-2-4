// Movie class implementation, representing a movie in the media library
public class Movie implements Media {
    private String title;      // Title of the movie
    private String director;   // Director of the movie
    private double price;      // Price of the movie

    // Constructor to initialize movie attributes
    public Movie(String title, String director, double price) {
        this.title = title;
        this.director = director;
        this.price = price;
    }

    // Method to update the price of the movie
    @Override
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // Method to retrieve the current price of the movie
    @Override
    public double getPrice() {
        return price;
    }

    // Method to retrieve the title of the movie
    @Override
    public String getTitle() {
        return title;
    }

    // Method to represent the movie as a string
    @Override
    public String toString() {
        return "Movie: " + title + " directed by " + director + ", Price: $" + price;
    }
}
