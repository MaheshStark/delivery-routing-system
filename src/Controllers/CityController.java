/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.City;
import java.util.ArrayList;

/**
 *
 * @author Hirusha
 */
public class CityController {

    static ArrayList<City> cities = new ArrayList<City>();
    private static int[][] adjMatrix;
    private static int numberOfCities;

    public static int getNumberOfCities() {
        return numberOfCities;
    }

    public static void setNumberOfCities(int numberOfCities) {
        CityController.numberOfCities = numberOfCities;
        adjMatrix = new int[CityController.numberOfCities][CityController.numberOfCities];
        System.out.println(numberOfCities);
    }

    public static void addCity(City city) {
        CityController.cities.add(city);
    }

    public static String[] getAllCities() {
        String[] cityArray = new String[CityController.numberOfCities];
        for (int i = 0; i < cities.size(); i++) {
            cityArray[i] = cities.get(i).getCityName();
        }
        return cityArray;
    }

    public static void addRoadDistance(int cityA, int cityB, int distance) {
        adjMatrix[cityA][cityB] = distance;
        adjMatrix[cityB][cityA] = distance;
    }

    public static ArrayList printResults() {
        
        ArrayList<Integer> output = new ArrayList();
        
        // Fill adjacency matrix.
        for (int i = 0; i < CityController.numberOfCities; i++) {
            for (int j = 0; j < CityController.numberOfCities; j++) {
                if(adjMatrix[i][j] == 0){
                    if (i == j) {
                        adjMatrix[i][j] = 0;
                    } else {
                        adjMatrix[i][j] = Integer.MAX_VALUE;
                    }
                }
            }
        }
        
        for (int i = 0; i < CityController.numberOfCities; i++) {
            for (int j = 1; j < CityController.numberOfCities; j++) {
                System.out.println(adjMatrix[i][j]);
            }
        }

        System.out.println("The cities are visited as follows");
       
        ArrayList<String> cityNames = new ArrayList();

        
            System.out.println("The shortest path is: ");
            TSPAlgo algo = new TSPAlgo();
            output = algo.calculateShortestPath(adjMatrix);
            
            
            System.out.println(cities.get(output.get(0)-1));
            cityNames.add(cities.get(output.get(0)-1).getCityName());
            for (int i = 0; i < output.size(); i++) {
                System.out.println(cities.get(output.get(i)));
                cityNames.add(cities.get(output.get(i)).getCityName());
            }
            
            //return output;
            return cityNames;
            
    }
}
