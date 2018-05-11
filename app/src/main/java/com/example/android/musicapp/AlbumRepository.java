package com.example.android.musicapp;

import java.util.ArrayList;

public class AlbumRepository {

    private ArrayList<Album> albums = new ArrayList<>();

    public AlbumRepository() {

        ArrayList<Song> firstAlbumSongs = new ArrayList<>();
        firstAlbumSongs.add(new Song(1, "Eraser", "3:47"));
        firstAlbumSongs.add(new Song(2, "Castle on the Hill", "4:21"));
        firstAlbumSongs.add(new Song(3, "Dive", "3:58"));
        firstAlbumSongs.add(new Song(4, "Shape of You", "3:54"));
        firstAlbumSongs.add(new Song(5, "Perfect", "4:23"));
        firstAlbumSongs.add(new Song(6, "Galway Girl", "2:48"));
        firstAlbumSongs.add(new Song(7, "Happier", "3:28"));
        firstAlbumSongs.add(new Song(8, "New Man", "3:09"));
        firstAlbumSongs.add(new Song(9, "Hearts Don't Break Around Here", "4:08"));
        firstAlbumSongs.add(new Song(10, "What Do I Know?", "3:57"));
        firstAlbumSongs.add(new Song(11, "How Would You Feel", "4:41"));
        firstAlbumSongs.add(new Song(12, "Supermarket Flowers", "3:41"));
        firstAlbumSongs.add(new Song(13, "Barcelona", "3:11"));
        firstAlbumSongs.add(new Song(14, "Bibia Be Ye Ye", "2:57"));
        firstAlbumSongs.add(new Song(15, "Nancy Mulligan", "3:00"));
        firstAlbumSongs.add(new Song(16, "Save Myself", "4:07"));

        ArrayList<Song> secondAlbumSongs = new ArrayList<>();
        secondAlbumSongs.add(new Song(1, "Chandelier", "3:36"));
        secondAlbumSongs.add(new Song(2, "Big Girls Cry", "3:31"));
        secondAlbumSongs.add(new Song(3, "Burn the Pages", "3:15"));
        secondAlbumSongs.add(new Song(4, "Eye of the Needle", "4:09"));
        secondAlbumSongs.add(new Song(5, "Hostage", "2:56"));
        secondAlbumSongs.add(new Song(6, "Straight for the Knife", "3:31"));
        secondAlbumSongs.add(new Song(7, "Fair Game", "3:52"));
        secondAlbumSongs.add(new Song(8, "Elastic Heart", "4:17"));
        secondAlbumSongs.add(new Song(9, "Free the Animal", "4:25"));
        secondAlbumSongs.add(new Song(10, "Fire Meet Gasoline", "4:02"));
        secondAlbumSongs.add(new Song(11, "Cellophane", "4:26"));
        secondAlbumSongs.add(new Song(12, "Dressed In Black", "6:40"));

        ArrayList<Song> thirdAlbumSongs = new ArrayList<>();
        thirdAlbumSongs.add(new Song(1, "Welcome To New York", "3:32"));
        thirdAlbumSongs.add(new Song(2, "Blank Space", "3:51"));
        thirdAlbumSongs.add(new Song(3, "Style", "3:51"));
        thirdAlbumSongs.add(new Song(4, "Out of the Woods", "3:55"));
        thirdAlbumSongs.add(new Song(5, "All You Had To Do Was Stay", "3:13"));
        thirdAlbumSongs.add(new Song(6, "Shake It Off", "3:39"));
        thirdAlbumSongs.add(new Song(7, "I Wish You Would", "3:27"));
        thirdAlbumSongs.add(new Song(8, "Bad Blood", "3:31"));
        thirdAlbumSongs.add(new Song(9, "Wildest Dreams", "3:40"));
        thirdAlbumSongs.add(new Song(10, "How You Get The Girl", "4:07"));
        thirdAlbumSongs.add(new Song(11, "This Love", "4:10"));
        thirdAlbumSongs.add(new Song(12, "I Know Places", "3:15"));
        thirdAlbumSongs.add(new Song(12, "Clean", "4:31"));

        ArrayList<Song> fourthAlbumSongs = new ArrayList<>();
        fourthAlbumSongs.add(new Song(1, "Young Girls", "3:49"));
        fourthAlbumSongs.add(new Song(2, "Locked Out Of Heaven", "3:54"));
        fourthAlbumSongs.add(new Song(3, "Gorilla [Clean]", "4:05"));
        fourthAlbumSongs.add(new Song(4, "Treasure [Clean]", "2:56"));
        fourthAlbumSongs.add(new Song(5, "Moonshine", "3:49"));
        fourthAlbumSongs.add(new Song(6, "When I Was Your Man", "3:34"));
        fourthAlbumSongs.add(new Song(7, "Natalie", "3:45"));
        fourthAlbumSongs.add(new Song(8, "Show Me", "3:28"));
        fourthAlbumSongs.add(new Song(9, "Money Make Her Smile", "3:24"));
        fourthAlbumSongs.add(new Song(10, "If I Knew", "2:13"));

        ArrayList<Song> fifthAlbumSongs = new ArrayList<>();
        fifthAlbumSongs.add(new Song(1, "M! Ssundaztood", "3:37"));
        fifthAlbumSongs.add(new Song(2, "Don't Let Me Get Me", "3:31"));
        fifthAlbumSongs.add(new Song(3, "Just Like a Pill [Explicit]", "3:57"));
        fifthAlbumSongs.add(new Song(4, "Get the Party Started", "3:12"));
        fifthAlbumSongs.add(new Song(5, "Respect", "3:25"));
        fifthAlbumSongs.add(new Song(6, "18 Wheeler", "3:44"));
        fifthAlbumSongs.add(new Song(7, "Family Portrait", "4:56"));
        fifthAlbumSongs.add(new Song(8, "Misery", "4:32"));
        fifthAlbumSongs.add(new Song(9, "Dear Diary", "3:29"));
        fifthAlbumSongs.add(new Song(10, "Eventdally", "3:35"));
        fifthAlbumSongs.add(new Song(11, "Lonely Girl", "4:20"));
        fifthAlbumSongs.add(new Song(12, "Numb", "3:08"));
        fifthAlbumSongs.add(new Song(13, "Gone to California", "4:34"));
        fifthAlbumSongs.add(new Song(14, "My Vietnam", "5:19"));

        Album firstAlbum = new Album("Devide", "Ed Sheeren", firstAlbumSongs, "devide", R.drawable.ed);
        Album secondAlbum = new Album("1000 Forms of Fear", "Sia", secondAlbumSongs, "a_1000_forms_of_fear", R.drawable.sia);
        Album thirdAlbum = new Album("1989","Taylor Swift", thirdAlbumSongs, "a_1989", R.drawable.taylor);
        Album fourthAlbum = new Album("Unorthodox Jukebox", "Bruno Mars", fourthAlbumSongs, "unorthodox_jukebox", R.drawable.bruno);
        Album fifthAlbum = new Album("M!ssundaztood", "Pink", fifthAlbumSongs, "missundaztood", R.drawable.pink);

        albums.add(firstAlbum);
        albums.add(secondAlbum);
        albums.add(thirdAlbum);
        albums.add(fourthAlbum);
        albums.add(fifthAlbum);
    }


    public Album findOne(String id) {
        Album found = null;
        for (Album album: albums) {
            if (album.getId().equals(id)) {
                found = album;
            }
        }
        return found;
    }

    public ArrayList<Album> findAll() {
        return albums;
    }
}
