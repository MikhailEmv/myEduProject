package ru.emelianov.springedu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.emelianov.springedu.beans.Music;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private final Music firstMusic;
    private final Music secondMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music firstMusic,
                       @Qualifier("jazzMusic") Music secondMusic) {
        this.firstMusic = firstMusic;
        this.secondMusic = secondMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println(firstMusic.getSong() + "\n" + secondMusic.getSong());
    }
}
