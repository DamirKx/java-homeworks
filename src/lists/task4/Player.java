package lists.task4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Player {
    private LinkedList<String> playlist;
    private ListIterator<String> iterator;
    private String currentSong = null;

    public Player(LinkedList<String> playlist) {
        this.playlist = playlist;
        this.iterator = playlist.listIterator();
    }

    public String nextSong(){
        if (playlist.isEmpty()){
            return "Плейлист пустой";
        }
        else if (iterator.hasNext()){
            currentSong = iterator.next();
            return currentSong;
        }
        return "Дальше песен нет";
    }

    public String previousSong(){
        if (playlist.isEmpty()){
            return "Плейлист пустой";
        }
        else if (iterator.hasPrevious()){
            currentSong = iterator.previous();
            return currentSong;
        }
        return "песен нет";
    }

    public void deleteSong(){
        if (currentSong == null){
            System.out.println("нечего удалять");
        } else {
            iterator.remove();
            System.out.println("Песня " + currentSong + " удалена.");
            currentSong = null;
        }

    }
    public String repeatSong(){
        if (playlist.isEmpty()){
            return "Плейлист пустой";
        }
        else if (iterator.hasPrevious()){
            currentSong = iterator.previous();
            currentSong = iterator.next();
            return currentSong;
        }
        return "Дальше песен нет";
    }

    public void shufflePlaylist(){
        Collections.shuffle(playlist);
        iterator = playlist.listIterator();
    }
}
