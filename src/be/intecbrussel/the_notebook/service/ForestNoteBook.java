package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForestNoteBook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public ForestNoteBook() {
        
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        for (Carnivore carnivore : carnivores) {
            addAnimal(carnivore);
        }
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        for (Omnivore omnivore : omnivores) {
            addAnimal(omnivore);
        }
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        for (Herbivore herbivore : herbivores) {
            addAnimal(herbivore);
        }
    }

    public int getPlantCount() {
        return plants.size();
    }

    public int getAnimalCount() {
        return this.carnivores.size() + this.omnivores.size() + this.herbivores.size();
    }

    public void addAnimal(Animal animal) {

        if (!isAnimalExists(animal)) {
            this.animals.add(animal);
        } else {
            System.err.println("This animal has already been recorded.");
        }

        if (animal instanceof Carnivore) {
            carnivores.add((Carnivore) animal);
        } else if (animal instanceof Omnivore) {
            omnivores.add((Omnivore) animal);
        } else if (animal instanceof Herbivore) {
            herbivores.add((Herbivore) animal);
        }

    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    private boolean isAnimalExists(final Animal animal) {

        return animals

                .stream()

                .anyMatch(a -> a.getName().equalsIgnoreCase(animal.getName()));

    }

    public void printNoteBook() {

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        for (Plant plant : plants) {
            System.out.println(plant);
        }

    }

    public void sortAnimalsByName() {

        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getName().toLowerCase(Locale.ROOT).compareTo(o2.getName().toLowerCase(Locale.ROOT));
            }
        });

    }

    public void sortPlantsByName() {

        Collections.sort(plants, new Comparator<Plant>() {

            @Override
            public int compare(Plant o1, Plant o2) {
                return o1.getName().toLowerCase(Locale.ROOT).compareTo(o2.getName().toLowerCase(Locale.ROOT));
            }
        });

    }

}
