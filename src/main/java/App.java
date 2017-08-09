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

    }



}
