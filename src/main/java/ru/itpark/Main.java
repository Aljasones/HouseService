package ru.itpark;
import ru.itpark.model.House;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService houseServise = new HouseService();

        houseServise.addNew(new House(1,"1 room flat", 1_000_000, "Кировский"));
        houseServise.addNew(new House(2, "1 room flat", 1_500_000, "Московский"));
        houseServise.addNew(new House(3, "2 room flat", 2_500_000, "Московский"));
        houseServise.addNew(new House(4, "3 room flat", 3_500_000, "Московский"));
        houseServise.addNew(new House(5, "2 room flat", 3_000_000, "Кировский"));

        System.out.println(houseServise.searchByArea("Кировский"));
        System.out.println(houseServise.searchByPrice(1_500_000, 3_000_000));
        System.out.println(houseServise.searchByAreaAndByPrice("Московский", 2_000_000, 3_000_000));

    }
}
