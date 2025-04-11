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
        this.trackOrder = -1;  // Default value, will be set later
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
