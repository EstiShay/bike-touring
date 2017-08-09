import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import models.Item;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;



public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (req, res) -> {
           Map <String, Object> allItems = new HashMap<>();
           return new ModelAndView(allItems, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/allitems", (request, response) -> {
            Map <String, Object> allItems = new HashMap<String, Object>();
            ArrayList<Item> listOfItems = Item.getItemsList();
            String nameInput = request.queryParams("item-name");
            String manufacturerInput = request.queryParams("manufacturer");
            String modelNameInput = request.queryParams("model-name");
            double weightInput = Double.parseDouble(request.queryParams("weight"));
            double priceInput = Double.parseDouble(request.queryParams("price"));
            Item newItemInput = new Item(nameInput, manufacturerInput, modelNameInput, weightInput, priceInput);
            allItems.put("listOfItems", listOfItems);
            return new ModelAndView(allItems, "all-items.hbs");
        }, new HandlebarsTemplateEngine());

        get("/allitems", (request, response) -> {
            Map<String, Object> allItems = new HashMap<>();
            ArrayList<Item> listOfItems = Item.getItemsList();
            System.out.println("the size is " + listOfItems.size());
            allItems.put("listOfItems", listOfItems);
            return new ModelAndView(allItems, "all-items.hbs");
        }, new HandlebarsTemplateEngine());

        get("/delete", (request, response) -> {
            Map<String, Object> allItems = new HashMap<>();
            Item.clearAll();
            return new ModelAndView(allItems, "all-items.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
