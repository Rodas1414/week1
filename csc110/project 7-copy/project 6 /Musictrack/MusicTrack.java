import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicTrack implements Comparable<MusicTrack> {
    private String artist;
    private String title;
    private int trackOrder;

    // Constructor
    public MusicTrack(String artist, String title) {
        if (artist == null || title == null) {
            throw new IllegalArgumentException("Artist and title cannot be null");
        }
        this.artist = artist;
        this.title = title;
        this.trackOrder = -1; // Default value
    }

    // Getter and Setter for artist
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        if (artist != null) {
            this.artist = artist;
        }
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    // Getter and Setter for trackOrder
    public int getTrackOrder() {
        return trackOrder;
    }

    public void setTrackOrder(int trackOrder) {
        this.trackOrder = trackOrder;
    }

    // Compare method for sorting by trackOrder
    @Override
    public int compareTo(MusicTrack other) {
        return Integer.compare(this.trackOrder, other.trackOrder);
    }

    // toString method for displaying the track information
    @Override
    public String toString() {
        return title + " -- " + artist;
    }

    // Main program to demonstrate functionality
    public static void main(String[] args) {
        // Create a list of MusicTrack objects
        List<MusicTrack> playlist = new ArrayList<>();

        // Add tracks to the playlist
        playlist.add(new MusicTrack("Coldplay", "Fix You"));
        playlist.add(new MusicTrack("Adele", "Rolling in the Deep"));
        playlist.add(new MusicTrack("Queen", "Bohemian Rhapsody"));

        // Set track orders
        playlist.get(0).setTrackOrder(3); // Fix You
        playlist.get(1).setTrackOrder(2); // Rolling in the Deep
        playlist.get(2).setTrackOrder(1); // Bohemian Rhapsody

        // Display tracks before sorting
        System.out.println("Before Sorting:");
        for (MusicTrack track : playlist) {
            System.out.println(track);
        }

        // Sort the playlist by trackOrder
        Collections.sort(playlist);

        // Display tracks after sorting
        System.out.println("\nAfter Sorting:");
        for (MusicTrack track : playlist) {
            System.out.println(track);
        }

        // Demonstrate getters and setters
        System.out.println("\nDemonstrating Getters and Setters:");
        MusicTrack sampleTrack = new MusicTrack("Imagine Dragons", "Believer");
        System.out.println("Original: " + sampleTrack);

        sampleTrack.setArtist("Imagine Dragons Updated");
        sampleTrack.setTitle("Believer Updated");
        sampleTrack.setTrackOrder(4);

        System.out.println("Updated: " + sampleTrack);
        System.out.println("Artist: " + sampleTrack.getArtist());
        System.out.println("Title: " + sampleTrack.getTitle());
        System.out.println("Track Order: " + sampleTrack.getTrackOrder());
    }
}
