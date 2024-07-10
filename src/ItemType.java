public enum ItemType {
    AU("Audio"),
    VI("Visual"),
    AM("AudioMobile"),
    VM("VisualMobile");

    private final String code;

    ItemType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
