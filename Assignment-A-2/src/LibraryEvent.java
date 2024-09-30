// LibraryEvent class to describe events that occur in the library
public class LibraryEvent {
    private String eventDescription; // Description of the event

    // Constructor to initialize a LibraryEvent with a description
    public LibraryEvent(String eventDescription) {
        this.eventDescription = eventDescription; // Set the event description
    }

    // Getter method to retrieve the event description
    public String getEventDescription() {
        return eventDescription; // Return the description of the event
    }
}
