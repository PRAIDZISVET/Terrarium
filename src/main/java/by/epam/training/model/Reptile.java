package by.epam.training.model;

import javax.xml.bind.annotation.XmlElement;


public abstract class Reptile {


    private String name;

    private int age;

    private boolean isPoisonous;


    public Reptile() {
    }

    public Reptile(String name, int age, boolean isPoisonous) {
        this.name = name;
        this.age = age;
        this.isPoisonous = isPoisonous;
    }

    @XmlElement(name = "reptileName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement(name = "poisonous")
    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", isPoisonous=" + isPoisonous +
                '}';
    }
}
