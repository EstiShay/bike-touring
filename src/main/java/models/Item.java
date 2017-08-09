package models;

import java.util.UUID;


public class Item {
    private String id;
    private String name;
    private String manufacturer;
    private String model;
    private double weight;
    private double price;
    private boolean purchased;
    private boolean packed;


    public Item(String name, String manufacturer, String model, double weight, double price) {
        this.id =  UUID.randomUUID().toString();;
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
        this.price = price;
        this.purchased = false;
        this.packed = false;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public boolean isPacked() {
        return packed;
    }
}
