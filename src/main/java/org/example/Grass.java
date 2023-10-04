package org.example;

import world.Plant;

public class Grass extends Plant {
    public Grass() {

        // Won't work --- Grass is not the same packages as Plant, even though it's a subclass
        // System.out.println(this.height);
    }
}
