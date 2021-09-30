package by.epam.training;

import by.epam.training.model.Reptile;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlType(name = "terrarium")
@XmlRootElement
public class Terrarium {


    private List<Reptile> terrariumList;

    private int countOfPoisonous;

    private double averageAge;

    public Terrarium() {
    }

    public Terrarium(List<Reptile> terrariumList, int countOfPoisonous, double averageAge) {
        this.terrariumList = terrariumList;
        this.countOfPoisonous = countOfPoisonous;
        this.averageAge = averageAge;
    }

    @XmlElementWrapper(name = "terrariumReptiles", nillable = true)
    @XmlElement(name = "reptile")
    public List<Reptile> getTerrariumList() {
        return terrariumList;
    }

    public void setTerrariumList(List<Reptile> terrariumList) {
        this.terrariumList = terrariumList;
    }

    @XmlElement(name = "countOfPoisonous")
    public int getCountOfPoisonous() {
        return countOfPoisonous;
    }

    public void setCountOfPoisonous(int countOfPoisonous) {
        this.countOfPoisonous = countOfPoisonous;
    }

    @XmlElement(name = "averageAgePoisonous")
    public double getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(double averageAge) {
        this.averageAge = averageAge;
    }
}
