package be.intecbrussel.the_notebook.App;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {
        ForestNoteBook natureDiary = new ForestNoteBook();

        Flower edelweiss = new Flower("Edelweiss", 15);
        edelweiss.setSmell(Scent.SWEET);
        Flower lilly = new Flower("Lilly");
        lilly.setSmell(Scent.SWEET);
        Bush roseBush = new Bush("Rosebush", 50);
        roseBush.setFruit("none");
        roseBush.setLeafType(LeafType.HEART);
        Weed dandelion = new Weed("Dandelion", 12);
        dandelion.setArea(30);
        Tree oak = new Tree("Oak", 200);
        oak.setLeafType(LeafType.HAND);
        Weed grass = new Weed("Grass", 10);
        grass.setArea(500);

        Set<Plant> plantDietOfAnimalsEncountered = new HashSet<>();
        plantDietOfAnimalsEncountered.add(grass);
        plantDietOfAnimalsEncountered.add(edelweiss);
        plantDietOfAnimalsEncountered.add(lilly);


        Herbivore cow = new Herbivore("Cow", 500, 140, 200);
        cow.setPlantDiet(plantDietOfAnimalsEncountered);

        Herbivore elk = new Herbivore("Elk", 700, 160,200);
        elk.setPlantDiet(plantDietOfAnimalsEncountered);



        Omnivore pig = new Omnivore("Pig", 600, 90, 100);
        pig.setPlantDiet(plantDietOfAnimalsEncountered);

       Omnivore bear = new Omnivore("Bear", 1000, 170, 210);
       bear.setPlantDiet(plantDietOfAnimalsEncountered);



        Carnivore tiger = new Carnivore("Tiger", 150, 80, 170);
        Carnivore snake = new Carnivore("Snake", 4, 10, 60);
        Carnivore wolf = new Carnivore("Wolf", 90, 70, 120);
        Carnivore lion = new Carnivore("Lion", 300, 100, 150);
        Carnivore hyena = new Carnivore("Hyena", 100, 60, 80);
        Carnivore mongoose = new Carnivore("Mongoose", 50, 20, 30);

        natureDiary.addPlant(roseBush);
        natureDiary.addPlant(lilly);
        natureDiary.addPlant(oak);
        natureDiary.addPlant(edelweiss);
        natureDiary.addPlant(grass);

        natureDiary.setHerbivores(List.of(cow, elk));
        natureDiary.setCarnivores(List.of(tiger, snake, lion, wolf, hyena, mongoose));
        natureDiary.setOmnivores(List.of(pig, bear));

        System.out.println(natureDiary.getPlantCount());
        System.out.println(natureDiary.getAnimalCount());

        System.out.println("-----------------");

        System.out.println(natureDiary.getOmnivores());
        System.out.println("-----------------");
        System.out.println(natureDiary.getHerbivores());
        System.out.println("-----------------");
        System.out.println(natureDiary.getCarnivores());
        System.out.println("-----------------");

        natureDiary.sortAnimalsByName();
        natureDiary.sortPlantsByName();

        natureDiary.printNoteBook();

    }
}
