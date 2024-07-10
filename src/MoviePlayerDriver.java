// Step 12: Driver Class for MoviePlayer
public class MoviePlayerDriver {
    public static void main(String[] args) {
        Screen screen = new Screen("1920x1080", 60, 5);
        MoviePlayer moviePlayer = new MoviePlayer("DVD Player", screen, MonitorType.LCD);

        moviePlayer.play();
        moviePlayer.stop();
        moviePlayer.previous();
        moviePlayer.next();

        System.out.println(moviePlayer);
    }
}
