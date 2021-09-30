package by.epam.training.util;
import by.epam.training.model.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;

public class XMLHandler extends DefaultHandler{
    private static ArrayList<Reptile> reptileArrayList = new ArrayList<>();

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("crocodile")) {
                String name = attributes.getValue("name");
                int age = Integer.valueOf(attributes.getValue("age"));
                boolean isPoisonous = Boolean.valueOf(attributes.getValue("poisonous"));
                reptileArrayList.add(new Crocodile(name,age,isPoisonous));
            } else if (qName.equals("turtle")) {
                String name = attributes.getValue("name");
                int age = Integer.valueOf(attributes.getValue("age"));
                boolean isPoisonous = Boolean.valueOf(attributes.getValue("poisonous"));
                reptileArrayList.add(new Turtle(name,age,isPoisonous));
            } else if (qName.equals("lizard")) {
                String name = attributes.getValue("name");
                int age = Integer.valueOf(attributes.getValue("age"));
                boolean isPoisonous = Boolean.valueOf(attributes.getValue("poisonous"));
                reptileArrayList.add(new Lizard(name,age,isPoisonous));
            } else if (qName.equals("snake")) {
                String name = attributes.getValue("name");
                int age = Integer.valueOf(attributes.getValue("age"));
                boolean isPoisonous = Boolean.valueOf(attributes.getValue("poisonous"));
                reptileArrayList.add(new Snake(name,age,isPoisonous));
            }
        }

    public static ArrayList<Reptile> getReptileArrayList() {
        return reptileArrayList;
    }
}
