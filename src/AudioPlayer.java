class AudioPlayer extends Product implements MultimediaControl {
    private String audioSpecification;
    private ItemType mediaType;

    public AudioPlayer(String name, String audioSpecification) {
        super(name,Item.manufacturer);
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.AU; // Default to Audio type

    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public void next() {
        System.out.println("Next");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAudio Spec : " + audioSpecification +
                "\nType : " + mediaType;
    }
}
