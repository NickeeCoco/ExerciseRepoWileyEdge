/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.classes_objects.statecapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Nickee Coco
 */
public class StateCapitals {
    public static void main(String[] args) {
        
        Map<String, String> statesAndCapitals = new HashMap<>();
        statesAndCapitals.put("Alabama", "Montgomery");
        statesAndCapitals.put("Alaska", "Juneau");
        statesAndCapitals.put("Arizona", "Phoenix");
        statesAndCapitals.put("Arkansas", "Little Rock");
        statesAndCapitals.put("California", "Sacramento");
        statesAndCapitals.put("Colorado", "Denver");
        statesAndCapitals.put("Connecticut", "Harford");
        statesAndCapitals.put("Delaware", "Dover");
        statesAndCapitals.put("Florida", "Tallahassee");
        statesAndCapitals.put("Georgia", "Atlanta");
        statesAndCapitals.put("Hawaii", "Honolulu");
        statesAndCapitals.put("Idaho", "Boise");
        statesAndCapitals.put("Illinois", "Springfield");
        statesAndCapitals.put("Indiana", "Indianapolis");
        statesAndCapitals.put("Iowa", "Des Moines");
        
        Set<String> allStates = statesAndCapitals.keySet();
        System.out.println("STATES:");
        System.out.println("=======");
        
        for(String state : allStates) {
            System.out.println(state);
        }
        
        System.out.println();
        
        Collection<String> allCapitals = statesAndCapitals.values();
        System.out.println("CAPITALS:");
        System.out.println("========");
        
        for(String capital : allCapitals) {
            System.out.println(capital);
        }
        
        System.out.println();
        
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("====================");
        
        for(String state : allStates) {
            System.out.println(state + " - " + statesAndCapitals.get(state) );
        }
    }   
}
