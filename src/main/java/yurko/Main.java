package yurko;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music music = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getModel());

        musicPlayer2.setVolume(22);

        System.out.printf("Music player1 volume: %s\n", musicPlayer1.getVolume());
        System.out.printf("Music player2 volume: %s\n", musicPlayer2.getVolume());
        context.close();
    }
}
