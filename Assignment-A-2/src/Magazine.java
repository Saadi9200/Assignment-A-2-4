// Magazine class implementation, representing a magazine in the media library
public class Magazine implements Media {
    private String title;      // Title of the magazine
    private String publisher;  // Publisher of the magazine
    private double price;      // Price of the magazine

    // Constructor to initialize magazine attributes
    public Magazine(String title, String publisher, double price) {
        this.title = title;
        this.publisher = publisher;
        this.price = price;
    }

    // Method to update the price of the magazine
    @Override
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // Method to retrieve the current price of the magazine
    @Override
    public double getPrice() {
        return price;
    }

    // Method to retrieve the title of the magazine
    public String getTitle() {
        return title;
    }

    // Method to represent the magazine as a string
    @Override
    public String toString() {
        return "Magazine: " + title + " published by " + publisher + ", Price: $" + price;
    }
}
