import java.util.ArrayList;
import java.util.List;

// Generic Library class to manage media items and observers
public class Library<T extends Media> {
    private List<T> mediaItems = new ArrayList<>(); // List to store media items
    private List<LibraryObserver> observers = new ArrayList<>(); // List to store subscribed observers

    // Method to add a media item to the library
    public void addMedia(T media) {
        mediaItems.add(media); // Add the media item to the list
        // Notify all observers about the new media addition
        notifyObservers(new LibraryEvent("New media added: " + media.toString()));
    }

    // Method to update the price of a media item
    public void updateMediaPrice(T media, double newPrice) {
        media.updatePrice(newPrice); // Update the price of the specified media item
        // Notify all observers about the price update
        notifyObservers(new LibraryEvent("Price updated for " + media.toString()));
    }

    // Method to add an observer to the library
    public void addObserver(LibraryObserver observer) {
        observers.add(observer); // Add the observer to the list
        // Notify all observers about the new subscription
        notifyObservers(new LibraryEvent(observer.toString() + " has subscribed to the library notifications!"));
    }

    // Method to notify all observers about an event
    private void notifyObservers(LibraryEvent event) {
        for (LibraryObserver observer : observers) { // Loop through all observers
            observer.updateEvent(event); // Call the updateEvent method for each observer
        }
    }

    // Method to get the list of media items
    public List<T> getMediaItems() {
        return mediaItems; // Return the list of media items
    }
}
