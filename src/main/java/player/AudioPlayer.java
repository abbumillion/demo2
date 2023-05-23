package player;

public interface AudioPlayer {
    void init();
    void play();
    void pause();
    void next();
    void prev();
    void stop();
    void shuffle();
    void repeat();
    void forward();
    void backward();
}
