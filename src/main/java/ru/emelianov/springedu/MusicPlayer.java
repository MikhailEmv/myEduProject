package ru.emelianov.springedu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import ru.emelianov.springedu.beans.Music;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private final List<Music> musicGenresList;

    @Autowired
    public MusicPlayer(List<Music> musicGenresList) {
        this.musicGenresList = musicGenresList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        var random = new Random();
        return "Playing the current song <" +
                musicGenresList.get(random.nextInt(musicGenresList.size())).getSong() +
                "> with the volume " + this.volume;
    }
}
