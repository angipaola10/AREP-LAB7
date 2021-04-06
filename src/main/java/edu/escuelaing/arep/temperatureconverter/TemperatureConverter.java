package edu.escuelaing.arep.temperatureconverter;

/**
 * The type Temperature converter.
 */
public class TemperatureConverter {

    /**
     * Celsius double.
     *
     * @param fahrenheit the fahrenheit
     * @return the double
     */
    public static Double celsius(Double fahrenheit){
        return (fahrenheit - 32) / 1.8f;
    }

}
