package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hirusha
 */
public class City {
    private String cityName;
    private boolean visited;
    private List<Road> toRoads = new ArrayList<>();

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited() {
        this.visited = true;
    }

    public List<Road> getToRoads() {
        return toRoads;
    }

    public void setToRoads(List<Road> toRoads) {
        this.toRoads = toRoads;
    }

    @Override
    public String toString() {
        return this.cityName;
    }
}
