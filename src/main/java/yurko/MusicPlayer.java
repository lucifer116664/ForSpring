package yurko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    /*@Autowired
    @Qualifier("rockMusic")*/
    private Music music;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music) {
        this.music = music;
    }

    /*@Autowired
    @Qualifier("rockMusic")
    public void setMusic(Music music) {
        this.music = music;
    }*/

    public void playMusic() {
        System.out.printf("Music is playing: %s\n", music.getSong());
    }
}
