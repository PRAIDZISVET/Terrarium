package by.epam.training.model;


import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Crocodile")
public class Crocodile extends Reptile {

    public Crocodile() {
    }

    public Crocodile(String name, int age, boolean isPoisonous) {
        super(name, age, isPoisonous);
    }

    @Override
    public String toString() {
        return "Crocodile{} " + super.toString();
    }
}
