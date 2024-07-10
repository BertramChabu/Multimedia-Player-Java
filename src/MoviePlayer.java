// Step 11: MoviePlayer Class extending Product and implementing MultimediaControl
public class MoviePlayer extends Product implements MultimediaControl {
    private Screen screen;
    private MonitorType monitorType;

    public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
        super(name,Item.manufacturer);
        this.screen = screen;
        this.monitorType = monitorType;
    }

    @Override
    public void play() {
        System.out.println("Playing movie");
    }

    @Override
    public void stop() {
        System.out.println("Stopping movie");
    }

    @Override
    public void previous() {
        System.out.println("Previous movie");
    }

    @Override
    public void next() {
        System.out.println("Next movie");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMonitor Type: " + monitorType +
                "\nScreen Details:\n" + screen;
    }
}
