import java.util.*;

class Song {
    private String title;
    private String artist;
    private String album;
    private double duration; // in minutes

    public Song(String title, String artist, String album, double duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void play() {
        System.out.println("Playing: " + title + " - " + artist);
    }

    public void displaySong() {
        System.out.println(title + " - " + artist);
    }
}

class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(String title, String artist, String album, double duration) {
        songs.add(new Song(title, artist, album, duration));
        System.out.println("Song added to the playlist!");
    }

    public void removeSong(String title) {
        for (Iterator<Song> it = songs.iterator(); it.hasNext();) {
            Song song = it.next();
            if (song.getTitle().equalsIgnoreCase(title)) {
                it.remove();
                System.out.println("Song removed from the playlist!");
                return;
            }
        }
        System.out.println("Song not found in the playlist.");
    }

    public void listSongs() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.println("Playlist:");
        int count = 1;
        for (Song song : songs) {
            System.out.print(count + ". ");
            song.displaySong();
            count++;
        }
    }

    public void playSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                song.play();
                return;
            }
        }
        System.out.println("Song not found in the playlist.");
    }
}

public class musicplaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int choice;

        do {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. List Songs");
            System.out.println("4. Play Song");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = sc.nextLine();
                    System.out.print("Enter album name: ");
                    String album = sc.nextLine();
                    System.out.print("Enter song duration (in minutes): ");
                    double duration = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    playlist.addSong(title, artist, album, duration);
                    break;
                case 2:
                    System.out.print("Enter title of the song to remove: ");
                    String removeTitle = sc.nextLine();
                    playlist.removeSong(removeTitle);
                    break;
                case 3:
                    playlist.listSongs();
                    break;
                case 4:
                    System.out.print("Enter title of the song to play: ");
                    String playTitle = sc.nextLine();
                    playlist.playSong(playTitle);
                    break;
                case 5:
                    System.out.println("Exiting Music Playlist Manager...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

