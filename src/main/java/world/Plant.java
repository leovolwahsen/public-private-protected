package world;

public class Plant {
    public String name;

    public final static int id = 8;

    private String type;

    protected String size;

    // package level visibility, when without private/protected or public
    int height;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";

        this.size = "medium";
        this.height = 12;
    }
}
