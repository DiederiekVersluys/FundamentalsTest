package be.intecbrussel.the_notebook.entities.plant_entities;

public class Plant {

    public String name;
    public double height;



    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
