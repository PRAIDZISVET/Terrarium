package by.epam.training.model;

public class Lizard extends Reptile {

    public Lizard() {
    }

    public Lizard(String name, int age, boolean isPoisonous) {
        super(name, age, isPoisonous);
    }

    @Override
    public String toString() {
        return "Lizard{} " + super.toString();
    }
}
