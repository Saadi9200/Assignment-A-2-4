// UserObserver class, which implements the LibraryObserver interface
public class UserObserver implements LibraryObserver {
    private String username; // Username of the observer

    // Constructor to initialize the UserObserver with a username
    public UserObserver(String username) {
        this.username = username; // Set the username for this observer
    }

    // Method to handle notification updates from the library
    @Override
    public void updateEvent(LibraryEvent event) {
        // Print a notification message to the console for the observer
        System.out.println("Notification to " + username + ": " + event.getEventDescription());
    }
}
