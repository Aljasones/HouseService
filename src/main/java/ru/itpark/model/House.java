package ru.itpark.model;

public class House {
    private int id;
    private String name;
    private int price;
    private String area;

    public House(int id, String name, int price, String area) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", area='" + area + '\'' +
                '}';
    }
}
