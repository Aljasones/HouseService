package ru.itpark.service;
import ru.itpark.model.House;
import java.util.ArrayList;
import java.util.List;

public class HouseService {

    private List<House> listHouse = new ArrayList<>();

    public void addNew (House house) {
        listHouse.add(house);
    }

    public List<House> searchByPrice (int min, int max) {
        List<House> results = new ArrayList<>();

        for (House house : listHouse) {
            if (house.getPrice() >= min && house.getPrice() <= max){
                results.add(house);
            }
        }
        return results;
    }

    public List<House> searchByArea (String area) {
        List<House> results = new ArrayList<>();

        for (House house : listHouse) {
            if (house.getArea().toLowerCase().contains(area.toLowerCase())){
                results.add(house);
            }
        }
        return results;
    }

    public List<House> searchByAreaAndByPrice (String area, int min, int max) {
        List<House> firstresults = new ArrayList<>();

        for (House house : listHouse) {
            if (house.getArea().toLowerCase().contains(area.toLowerCase()) && house.getPrice() >= min && house.getPrice() <= max){
                firstresults.add(house);
            }
        }

       return firstresults;

    }
}
