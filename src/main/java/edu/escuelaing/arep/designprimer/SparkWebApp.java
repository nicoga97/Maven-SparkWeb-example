package edu.escuelaing.arep.designprimer;

import static spark.Spark.*;

public class SparkWebApp {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello Heroku");
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set

    }
}
