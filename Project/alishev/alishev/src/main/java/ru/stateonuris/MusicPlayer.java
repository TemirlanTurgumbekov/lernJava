package ru.stateonuris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

//     @Value("${musicPlayer.volume}")
//    private int volume;
//    @Value("${musicPlayer.name}")
//    private String name;
    private Music music1;
    private Music music2;

@Autowired
    public MusicPlayer(@Qualifier("popMusic") Music music1,@Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

//    public int getVolume() {
//        return volume;
//    }
//
//    public String getName() {
//        return name;
//    }


    public String playMusic() {
        return " Playing: " + music1.getSong();
    }
}