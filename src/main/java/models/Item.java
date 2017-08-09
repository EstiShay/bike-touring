package models;

import java.util.ArrayList;
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
    private static ArrayList<Item> itemsList = new ArrayList<>();


    public Item(String name, String manufacturer, String model, double weight, double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
        this.price = price;
        this.purchased = false;
        this.packed = false;
        itemsList.add(this);
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

    public boolean updatePurchaseStatus() {
        return purchased = !purchased;
    }

    public boolean updatePackedStatus() {
        return packed = !packed;
    }

    public static ArrayList<Item> getItemsList() {
        return itemsList;
    }

    public static void clearAll(){
        itemsList.clear();
    }

    public static Item findById(String itemId) {
        //refactor as while loop
        Item result = null;
        for (Item item : itemsList) {
            if (item.getId().equals(itemId)) {
                return item;
            }
        }
        return result;
    }

    //Next step is to delete individual post based on ID

}
