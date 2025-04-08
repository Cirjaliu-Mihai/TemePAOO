package org.example;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Config {
    private static Config instance;
    private String color;
    private int weight;
    private boolean dataLoaded = false;
    private final String filePath = "config.json";

    private Config() {

    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private void loadData() {
        if (!dataLoaded) {
            JSONParser parser = new JSONParser();
            try (FileReader reader = new FileReader(filePath)) {
                JSONObject obj = (JSONObject) parser.parse(reader);
                color = (String) obj.get("color");
                Number w = (Number) obj.get("weight");
                weight = w.intValue();
                dataLoaded = true;
            }
            catch (ParseException | IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getColor() {
        if (!dataLoaded) loadData();
        return color;
    }

    public int getWeight() {
        if (!dataLoaded) loadData();
        return weight;
    }
}
