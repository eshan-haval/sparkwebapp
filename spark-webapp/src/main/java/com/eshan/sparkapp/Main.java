package com.eshan.sparkapp;

import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Main{
    
        public static void main(String args[]){
            port(8081);
            get("/helloStudents",(req,res) -> {
                return new ModelAndView(null,"index.hbs");
            }, new HandlebarsTemplateEngine());
        }
}