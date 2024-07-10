// Step 13: Driver Class demonstrating MultimediaControl interface
public class MultimediaControlDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer("MP3 Player", "MP3");
        MoviePlayer moviePlayer = new MoviePlayer("DVD Player", new Screen("1920x1080", 60, 5), MonitorType.LCD);

        testMultimediaControl(audioPlayer);
        testMultimediaControl(moviePlayer);
    }

    private static void testMultimediaControl(MultimediaControl device) {
        device.play();
        device.stop();
        device.previous();
        device.next();
    }
}
