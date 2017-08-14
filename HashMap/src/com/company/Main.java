package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        // To add something
        languages.put("Java", "a compiled high level, objected-language, platform indepedant language");
        languages.put("Python", "a interpreted, object-oriented, hig-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All PUrposes Symbolic Instruction Code");

        // To access value
        // Keys are unique
        // Value get override when adding the key that already exist
        // When a brand new pair add to hash map it will return null
        // When add to a key that already exist will return previous value
        System.out.println(languages.get("Java"));

        // containsKey method determine if a Key already exist in the HashMap
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "This course is about Java");
        }

        // To remove pair
        languages.remove("BASIC");
        // Also can be removed by both key value pair at the same time
        if(languages.remove("Algol", "an  language")) {
            System.out.println("Algol removed");
        }else{
            System.out.println("key value pair not found");
        }

        System.out.println(languages.replace("Algol", "a functional language"));

        // Printing Hash Map
        System.out.println("====================================");

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }




    }
}
