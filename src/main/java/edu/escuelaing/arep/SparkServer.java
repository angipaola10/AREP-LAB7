package edu.escuelaing.arep;

import static spark.Spark.*;
import com.google.gson.Gson;
import edu.escuelaing.arep.model.Operation;
import edu.escuelaing.arep.temperatureconverter.TemperatureConverter;

public class SparkServer {

    public static void main (String[] args){
        port(getPort());
        get("/celsius", (req, res) ->{
            Double fahrenheit = Double.valueOf(req.queryParams("fahrenheit"));
            res.type("application/json");
            return (new Gson()).toJson(new Operation("Fahrenheit to Celsius", fahrenheit, TemperatureConverter.celsius(fahrenheit)));
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
