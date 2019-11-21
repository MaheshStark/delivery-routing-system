/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.City;
import Models.Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hirusha
 */
public class Dijkstra {
    
    public static void calculateShortestPath(Graph g, City begin, City end){
        
        // Keep track of visited and unvisited cities.
        ArrayList<City> visitedCities = new ArrayList();
        ArrayList<City> unvisitedCities = new ArrayList();
        
        /*
        Store values.
        City | Shortest distance from source
        */
        Map<City, Integer> map = new HashMap<City, Integer>();
        
        for(City city : g.getCities()){
            unvisitedCities.add(city);
        }
        
        for(City city : unvisitedCities){
            
            //Remove city from unvisitedCities array and add to visitedCities.
            unvisitedCities.remove(city);
            visitedCities.add(city);
        }
    }
}
