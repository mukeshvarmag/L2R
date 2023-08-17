package org.example.dynamic;

import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ExternalRaing {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/mukes/Projects/L2R/src/main/resources/dynamic/test.json"))) {
            StringBuilder jsonData = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonData.append(line);
            }

            // Create a JSONObject from the JSON data
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(jsonData.toString());

            // Now you can work with the jsonObject
            String name = (String) jsonObject.get("name");
            long age = (long) jsonObject.get("age");
            long weight = (long) jsonObject.get("weight");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("weight: " +weight );

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
