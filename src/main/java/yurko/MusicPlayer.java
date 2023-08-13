package yurko;

import java.util.List;
import java.util.ArrayList;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String model;

    private int volume;
    public MusicPlayer() {

    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        for(Music music: musicList) {
            System.out.printf("Music is playing: %s\n", music.getSong());
        }
    }
}
