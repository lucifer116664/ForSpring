package yurko;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer2.setVolume(60);

        musicPlayer.playMusic();
        musicPlayer2.playMusic();

        context.close();
    }
}
