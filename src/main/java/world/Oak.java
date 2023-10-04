package world;

public class Oak extends Plant {
    public Oak(){

        // This works --- size is protected, Oak is a subclass (extends) of Plant.
        this.size = "large";

        // no access specifier; works because Oak and Plant in same package
        this.height = 200;
    }
}
