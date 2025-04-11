import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Main Creation of Lists
        ArrayList<MusicTrack> favoriteTracks = new ArrayList<>();
        favoriteTracks.add(new MusicTrack("Die Happy", "Dreamers"));
        favoriteTracks.add(new MusicTrack("Superpower", "Adam Lambert"));
        favoriteTracks.add(new MusicTrack("&Run", "Sir Sly"));
        favoriteTracks.add(new MusicTrack("Good Thing", "Zedd & Kehlani"));
        favoriteTracks.add(new MusicTrack("Side Effects", "Chainsmokers & Emily Warren"));

        ArrayList<MusicTrack> friendTracks = new ArrayList<>();
        friendTracks.add(new MusicTrack("Done For Me", "Charlie Puth & Kehlani"));
        friendTracks.add(new MusicTrack("Dancing with a Stranger", "Sam Smith & Normani"));
        friendTracks.add(new MusicTrack("Dissolve", "Absofacto"));
        friendTracks.add(new MusicTrack("Say Amen", "Panic at the Disco"));
        friendTracks.add(new MusicTrack("Almost (Sweet Music)", "Hozier"));
        friendTracks.add(new MusicTrack("Blinding Lights", "The Weeknd"));

        // Main Deletion: Remove the second track from friendTracks (index 1)
        friendTracks.remove(1);

        // Main List Combining: Combine favoriteTracks and friendTracks into partyPlaylist
        ArrayList<MusicTrack> partyPlaylist = new ArrayList<>();
        partyPlaylist.addAll(favoriteTracks);
        partyPlaylist.addAll(friendTracks);

        // Main Randomization: Assign random trackOrder for each track
        Random random = new Random();
        for (MusicTrack track : partyPlaylist) {
            track.setTrackOrder(random.nextInt(101)); // Random number between 0 and 100
        }

        // Main Sorting: Sort the partyPlaylist by trackOrder
        Collections.sort(partyPlaylist);

        // Main Output: Print the sorted playlist
        System.out.println("--------------");
        System.out.println("Party Playlist");
        System.out.println("--------------");
        int count = 1;

        // Main Looping: Iterate through partyPlaylist and print tracks
        for (MusicTrack track : partyPlaylist) {
            System.out.println(count + ". " + track);
            count++;
        }
    }
}

// MusicTrack class with Comparable implementation
class MusicTrack implements Comparable<MusicTrack> {
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
}
