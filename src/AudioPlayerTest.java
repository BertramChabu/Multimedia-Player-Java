public class AudioPlayerTest {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer("MP3 Player", "MP3 format");

        // Test multimedia control
        player.play();
        player.stop();
        player.next();
        player.previous();

        // Print details
        System.out.println(player);
    }
}
