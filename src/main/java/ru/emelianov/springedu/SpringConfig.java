package ru.emelianov.springedu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.emelianov.springedu.beans.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicGenresList());
    }

    @Bean
    public List<Music> musicGenresList() {
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }
}
