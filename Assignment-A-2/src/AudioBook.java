// AudioBook class implementation, representing an audiobook in the media library
public class AudioBook implements Media {
    private String title;      // Title of the audiobook
    private String narrator;   // Narrator of the audiobook
    private double price;      // Price of the audiobook

    // Constructor to initialize audiobook attributes
    public AudioBook(String title, String narrator, double price) {
        this.title = title;
        this.narrator = narrator;
        this.price = price;
    }

    // Method to update the price of the audiobook
    @Override
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // Method to retrieve the current price of the audiobook
    @Override
    public double getPrice() {
        return price;
    }

    // Method to retrieve the title of the audiobook
    @Override
    public String getTitle() {
        return title;
    }

    // Method to represent the audiobook as a string
    @Override
    public String toString() {
        return "AudioBook: " + title + " narrated by " + narrator + ", Price: $" + price;
    }
}
