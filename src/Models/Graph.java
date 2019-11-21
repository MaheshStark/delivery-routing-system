/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Hirusha
 */
public class Graph {
    private City[] cities;
    private ArrayList<Road> roads;

    public Graph(City[] cities, ArrayList<Road> roads) {
        this.cities = cities;
        this.roads = roads;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public ArrayList<Road> getRoads() {
        return roads;
    }

    public void setRoads(ArrayList<Road> roads) {
        this.roads = roads;
    }
    
}
