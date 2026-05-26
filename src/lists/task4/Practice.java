package lists.task4;

import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("Bohemian Rhapsody");
        playlist.add("Shape of You");
        playlist.add("Smells Like Teen Spirit");
        playlist.add("Blinding Lights");
        playlist.add("Hotel California");

        Player player = new Player(playlist);

        System.out.println(player.nextSong());
        System.out.println(player.nextSong());

        System.out.println(player.previousSong());
        System.out.println(player.previousSong());

        player.shufflePlaylist();
        System.out.println(player.nextSong());
        System.out.println(player.nextSong());
        player.deleteSong();



    }

}
