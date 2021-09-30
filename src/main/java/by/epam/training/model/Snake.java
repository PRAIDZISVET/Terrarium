package by.epam.training.model;

public class Snake extends Reptile {

    public Snake() {
    }

    public Snake(String name, int age, boolean isPoisonous) {
        super(name, age, isPoisonous);
    }

    @Override
    public String toString() {
        return "Snake{} " + super.toString();
    }
}
