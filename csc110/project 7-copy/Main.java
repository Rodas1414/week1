import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList for favorite music tracks
        ArrayList<MusicTrack> favoriteTracks = new ArrayList<>();
        favoriteTracks.add(new MusicTrack("Die Happy", "Dreamers"));
        favoriteTracks.add(new MusicTrack("Superpower", "Adam Lambert"));
        favoriteTracks.add(new MusicTrack("&Run", "Sir Sly"));
        favoriteTracks.add(new MusicTrack("Good Thing", "Zedd & Kahlani"));
        favoriteTracks.add(new MusicTrack("Side Effects", "Chainsmokers & Emily Warren"));

        // Create an ArrayList for music tracks that friends might like
        ArrayList<MusicTrack> friendTracks = new ArrayList<>();
        friendTracks.add(new MusicTrack("Done For Me", "Charlie Puth & Kehlani"));
        friendTracks.add(new MusicTrack("Dancing with a Stranger", "Sam Smith & Normani"));
        friendTracks.add(new MusicTrack("Dissolve", "Absofacto"));
        friendTracks.add(new MusicTrack("Say Amen", "Panic at the Disco"));
        friendTracks.add(new MusicTrack("Almost (Sweet Music)", "Hozier"));
        friendTracks.add(new MusicTrack("Blinding Lights", "The Weeknd"));

        // Remove the second track from the friend list (index 1)
        friendTracks.remove(1);

        // Create a third ArrayList to hold the party playlist
        ArrayList<MusicTrack> partyPlaylist = new ArrayList<>();
        // Add all the tracks from favoriteTracks and friendTracks to partyPlaylist
        partyPlaylist.addAll(favoriteTracks);
        partyPlaylist.addAll(friendTracks);

        // Randomize the trackOrder by generating a random number between 0 and 100
        Random random = new Random();
        for (MusicTrack track : partyPlaylist) {
            track.setTrackOrder(random.nextInt(101)); // Random number between 0 and 100
        }

        // Sort the party playlist by trackOrder
        Collections.sort(partyPlaylist);

        // Print the party playlist in the correct order
        System.out.println("--------------");
        System.out.println("Party Playlist");
        System.out.println("--------------");
        int count = 1;
        for (MusicTrack track : partyPlaylist) {
            System.out.println(count + ". " + track);
            count++;
        }
    }
}
