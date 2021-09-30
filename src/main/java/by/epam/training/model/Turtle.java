package by.epam.training.model;

public class Turtle extends Reptile {

    public Turtle() {
    }

    public Turtle(String name, int age, boolean isPoisonous) {
        super(name, age, isPoisonous);
    }

    @Override
    public String toString() {
        return "Turtle{} " + super.toString();
    }
}
