package be.intecbrussel.the_notebook.entities.animal_entities;



public class Carnivore extends Animal{

    private double mafFoodSize;


    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMafFoodSize() {
        return mafFoodSize;
    }

    public void setMafFoodSize(double mafFoodSize) {
        this.mafFoodSize = mafFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", mafFoodSize=" + mafFoodSize +
                '}';
    }
}
