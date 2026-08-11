package FZRN_SLIDES.Interface;

public interface Camera {
    public void takePhoto();
}
interface MusicPlayer {
    public void playMusic();
}
class SmartPhone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.takePhoto();
        myPhone.playMusic();
    }
}