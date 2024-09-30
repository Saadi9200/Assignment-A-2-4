import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class to run the library system and handle user interactions
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to read user input
        Library<Media> library = new Library<>(); //  new Library instance
        boolean continueProgram = true;

        while (continueProgram) { // Main program loop
            System.out.println("Welcome to the Media Library System!");
            System.out.println("1. Subscribe to Library Notifications");
            System.out.println("2. Access Library Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int mainChoice = scanner.nextInt(); // Read user choice from the main menu
            scanner.nextLine(); // Consume newline

            switch (mainChoice) {
                case 1:
                    // Subscribe to notifications
                    System.out.print("Enter your username to subscribe: ");
                    String username = scanner.nextLine(); // Get username from user
                    UserObserver user = new UserObserver(username); // Create a new UserObserver
                    library.addObserver(user); // Add user as an observer to the library
                    System.out.println("User " + username + " subscribed to the notification system.");
                    break;

                case 2:
                    // Access Library Menu
                    boolean continueLibrary = true; //  library menu loop
                    while (continueLibrary) {
                        System.out.println("\nLibrary Menu");
                        System.out.println("1. Add Book");
                        System.out.println("2. Add Movie");
                        System.out.println("3. Add AudioBook");
                        System.out.println("4. Add Magazine");
                        System.out.println("5. Update Media Price");
                        System.out.println("6. Show All Media");
                        System.out.println("7. Return to Main Menu");
                        System.out.print("Choose an option: ");

                        int libraryChoice = scanner.nextInt(); // Read user choice from the library menu
                        scanner.nextLine(); // Consume newline

                        switch (libraryChoice) {
                            case 1:
                                // Add Book
                                System.out.print("Enter Book Title: ");
                                String bookTitle = scanner.nextLine(); // Get book title
                                System.out.print("Enter Author: ");
                                String bookAuthor = scanner.nextLine(); // Get book author
                                System.out.print("Enter Price: ");
                                double bookPrice = scanner.nextDouble(); // Get book price
                                Book book = new Book(bookTitle, bookAuthor, bookPrice); // Create a new Book object
                                library.addMedia(book); // Add book to the library
                                break;

                            case 2:
                                // Add Movie
                                System.out.print("Enter Movie Title: ");
                                String movieTitle = scanner.nextLine(); // Get movie title
                                System.out.print("Enter Director: ");
                                String movieDirector = scanner.nextLine(); // Get movie director
                                System.out.print("Enter Price: ");
                                double moviePrice = scanner.nextDouble(); // Get movie price
                                Movie movie = new Movie(movieTitle, movieDirector, moviePrice); // Create a new Movie object
                                library.addMedia(movie); // Add movie to the library
                                break;

                            case 3:
                                // Add AudioBook
                                System.out.print("Enter AudioBook Title: ");
                                String audioBookTitle = scanner.nextLine(); // Get audiobook title
                                System.out.print("Enter Narrator: ");
                                String audioBookNarrator = scanner.nextLine(); // Get audiobook narrator
                                System.out.print("Enter Price: ");
                                double audioBookPrice = scanner.nextDouble(); // Get audiobook price
                                AudioBook audioBook = new AudioBook(audioBookTitle, audioBookNarrator, audioBookPrice); // Create a new AudioBook object
                                library.addMedia(audioBook); // Add audiobook to the library
                                break;

                            case 4:
                                // Add Magazine
                                System.out.print("Enter Magazine Title: ");
                                String magazineTitle = scanner.nextLine(); // Get magazine title
                                System.out.print("Enter Publisher: ");
                                String magazinePublisher = scanner.nextLine(); // Get magazine publisher
                                System.out.print("Enter Price: ");
                                double magazinePrice = scanner.nextDouble(); // Get magazine price
                                Magazine magazine = new Magazine(magazineTitle, magazinePublisher, magazinePrice); // Create a new Magazine object
                                library.addMedia(magazine); // Add magazine to the library
                                break;

                            case 5:
                                // Update Media Price
                                System.out.println("Enter the media index to update the price (starting from 1): ");
                                int index = scanner.nextInt(); // Get the index of media to update
                                System.out.print("Enter the new price: ");
                                double newPrice = scanner.nextDouble(); // Get the new price
                                // Check if the index is valid
                                if (index > 0 && index <= library.getMediaItems().size()) {
                                    Media media = library.getMediaItems().get(index - 1); // Get media by index
                                    library.updateMediaPrice(media, newPrice); // Update media price
                                } else {
                                    System.out.println("Invalid media index!"); // Error message for invalid index
                                }
                                break;

                            case 6:
                                // Show All Media
                                int count = 1; // Counter for media listing
                                for (Media media : library.getMediaItems()) {
                                    System.out.println(count++ + ". " + media); // Display media details
                                }
                                break;

                            case 7:
                                // Return to Main Menu
                                continueLibrary = false; // Exit library menu loop
                                break;

                            default:
                                System.out.println("Invalid option. Please try again."); // Error message for invalid option
                        }
                    }
                    break;

                case 3:
                    // Exit
                    continueProgram = false; // Exit main program loop
                    System.out.println("Exiting the system."); // Exit message
                    break;

                default:
                    System.out.println("Invalid option. Please try again."); // Error message for invalid option
            }
        }

        scanner.close(); // Close the scanner resource
    }
}
