public class AudioPlayerDriver {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer("MP3 Player", "MP3");
        audioPlayer.play();
        audioPlayer.stop();
        audioPlayer.previous();
        audioPlayer.next();
        System.out.println(audioPlayer);
    }
}
