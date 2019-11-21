/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delivery.routing.app;

import static Controllers.Dijkstra.calculateShortestPath;
import Models.Graph;
import Models.City;
import Models.Road;
import java.util.ArrayList;

/**
 *
 * @author Hirusha
 */
public class DeliveryRoutingApp {
    static City[] cities;
    static ArrayList<Road> roads;

    public static void main(String[] args) {
        
        calculateShortestPath(cityGraph(), null, null);
        
        
    }
    
    public static Graph cityGraph(){
        cities = new City[6];
        roads = new ArrayList();
        
        cities[0] = new City("Colombo");
        cities[1] = new City("Moratuwa");
        cities[2] = new City("Dehiwala");
        cities[3] = new City("Nugegoda");
        cities[4] = new City("Rathmalana");
        cities[5] = new City("Wellawatta");
        
        roads.add(new Road(cities[0], cities[1], 20));
        roads.add(new Road(cities[1], cities[2], 10));
        roads.add(new Road(cities[2], cities[3], 7));
        roads.add(new Road(cities[3], cities[4], 8));
        roads.add(new Road(cities[4], cities[5], 6));
        
        Graph g = new Graph(cities, roads);
        return g;
    }
    
}
