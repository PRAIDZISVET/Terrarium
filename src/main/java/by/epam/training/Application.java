package by.epam.training;

import by.epam.training.model.Reptile;
import by.epam.training.util.XMLHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("src/main/resources/reptiles.xml"), handler);

        ArrayList<Reptile> reptiles = XMLHandler.getReptileArrayList();
        int count=0;
        for (Reptile item : reptiles) {
   //         System.out.println(item);
            count++;
        }
        System.out.printf("Total number of reptiles: %d ",count);
        System.out.println();

        System.out.println("Enter count of reptiles for terrarium:");
        Scanner scanner = new Scanner(System.in);
        int countReptilesForTerrarium = scanner.nextInt();

        ArrayList<Reptile> terrariumList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < countReptilesForTerrarium; i++) {
            Reptile terrariumReptile = reptiles.get(random.nextInt(reptiles.size()));
            terrariumList.add(terrariumReptile);
        }
        System.out.println("Terrarium reptiles: ");
        int totalAge=0;
        int totalAgePoison=0;
        double averageAge=0;
        double averageAgePoison=0;
        int countOfPoison = 0;
        int countNotPoison=0;
        for (Reptile item : terrariumList) {
            System.out.println(item);
            if (item.isPoisonous()) {
                countOfPoison++;
                totalAgePoison+=item.getAge();
            } else {
                countNotPoison++;
                totalAge+=item.getAge();
            }
        }
        System.out.println();
        if (countOfPoison!=0) {
            System.out.printf("Count of poisonous reptiles: %d, average age: %d",countOfPoison,totalAgePoison/countOfPoison);
        } else {
            System.out.println("Count of poisonous reptiles: 0");
        }
        System.out.println();
        if (countNotPoison!=0) {
            System.out.printf("Count of not poisonous reptiles: %d, average age: %d",countNotPoison,totalAge/countNotPoison);
        } else {
            System.out.println("Count of not poisonous reptiles: 0");
        }

        System.out.println();
    }

}
