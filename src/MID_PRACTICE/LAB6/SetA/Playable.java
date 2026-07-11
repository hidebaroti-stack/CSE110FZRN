package MID_PRACTICE.LAB6.SetA;

interface Playable {
    void play();
    void pause();
}
class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("The music is playing...");
    }
    @Override
    public void pause() {
        System.out.println("The music is paused.");
    }
}
class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("The video is playing...");
    }
    @Override
    public void pause() {
        System.out.println("The video is paused.");
    }
}
class PlayableMain {
    public static void main(String[] args) {
        Playable m = new MusicPlayer();
        m.play();
        m.pause();
        Playable v = new VideoPlayer();
        v.play();
        v.pause();
    }
}