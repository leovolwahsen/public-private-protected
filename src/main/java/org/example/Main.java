package org.example;

/* !!IMPORTANT!!
private --- only within same class
public --- from anywhere
protected --- same class, subclass, and same package
no modifier --- same package only
 */

import world.Plant;

public class Main {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(plant.id);

        // size is protected; Main is not in the same packages as Plant.
        // Won't work.
        // System.out.println(plant.size);

        // Won't work; Main and Plant in different packages; height has package-level visibility.
        // System.out.println(plant.height);
    }
}