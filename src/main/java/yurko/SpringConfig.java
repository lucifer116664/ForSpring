package yurko;

import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("yurko")
@PropertySource("classpath:musicPlayer.properties")
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
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        MusicPlayer musicPlayer = new MusicPlayer(/*rockMusic()*/);
        musicPlayer.setMusic(rockMusic());
        return musicPlayer;
    }
}
