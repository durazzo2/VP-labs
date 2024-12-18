package mk.finki.ukim.mk.lab.bootstrap;


import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab.model.Artist;
import mk.finki.ukim.mk.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artistList = new ArrayList<>();
    public static List<Song> songList = new ArrayList<>();

    @PostConstruct
    public void init() {
        artistList.add(new Artist(11L, "David", "Bowie", "Pesni za doma"));
        artistList.add(new Artist(22L, "David", "Ortakoski", "Majstor za gibanici"));
        artistList.add(new Artist(44L, "DJ", "Gungula", "Disko muzika"));
        artistList.add(new Artist(612L, "Robert", "Hakiboy", "Brz i besen"));
        artistList.add(new Artist(327L, "Dangara", "Dungara", "Pesni za plivanje"));

        songList.add(new Song("Meow", "Stormx", "Turbofolk", 1998));
        songList.add(new Song("Test1", "Dotako sam dno zivota", "Turbofolk", 1964));
        songList.add(new Song("TestPesna", "Test title", "Metal", 2005));
        songList.add(new Song("EDM", "Electro ", "Electric", 2021));
        songList.add(new Song("TestPesna2", "Test2Title", "Genre Genre", 2015));
    }
}