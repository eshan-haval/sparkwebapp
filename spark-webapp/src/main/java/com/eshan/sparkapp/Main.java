package com.eshan.sparkapp;

import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.*;

public class Main{
    
        public static void main(String args[]){
            port(8081);
            get("/helloStudents",(req,res) -> {
                return new ModelAndView(null,"index.hbs");
            }, new HandlebarsTemplateEngine());
            
            
            post("/sign-in",(req,res)->{
                Map<String, String> modelHashMap = new HashMap<String, String>();
                modelHashMap.put("username", req.queryParams("username"));
                return new ModelAndView(modelHashMap,"sign-in.hbs");
            }, new HandlebarsTemplateEngine());
        }
}
