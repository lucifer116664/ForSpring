package yurko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;

    @Autowired
    public MusicPlayer(ClassicalMusic music) {
        this.music = music;
    }

    /*@Autowired
    public void setMusic(RockMusic music) {
        this.music = music;
    }*/

    public void playMusic() {
        System.out.printf("Music is playing: %s\n", music.getSong());
    }
}
