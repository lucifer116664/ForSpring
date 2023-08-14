package yurko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class MusicPlayer {
    /*@Autowired
    @Qualifier("rockMusic")*/
    private Music music;

    @Value("${musicPlayer.model}")
    private String model;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }

    /*@Autowired
    @Qualifier("classicalMusic")
    public void setMusic(Music music) {
        this.music = music;
    }*/

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @PostConstruct
    private void init() {
        System.out.printf("%s was initialized\n", getClass());
    }

    @PreDestroy
    private void destroy() {
        System.out.printf("%s was destroyed\n", getClass());
    }

    public void playMusic() {
        System.out.printf("Music is playing on your %S: %s\nVolume = %d\n", model, music.getSong(), volume);
    }
}
