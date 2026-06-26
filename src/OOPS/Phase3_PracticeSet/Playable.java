package OOPS.Phase3_PracticeSet;

// Interface
interface Playable {
    void play(); //Interface method
}

class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Strumming the guitar...");
    }

}

class VideoFile implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the video file...");
    }

}

class Whistle implements Playable {
    @Override
    public void play() {
        System.out.println("Blowing the whistle...");
    }
}

class PlayableMain {
    public static void main(String[] args) {
        // array of Playable objects
        Playable[] items = {
                new Guitar(),
                new VideoFile(),
                new Whistle()
        };

        //Loop through and call play()
        for (Playable p : items) {
            p.play();
        }
    }
}