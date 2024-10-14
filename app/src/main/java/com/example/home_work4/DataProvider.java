package com.example.home_work4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {

    public static List<String> getContinents() {
        return Arrays.asList("Africa", "Asia", "Europe", "North America", "South America", "Australia");
    }

    public static Map<String, List<String>> getCountriesByContinent() {
        Map<String, List<String>> countries = new HashMap<>();
        countries.put("Africa", Arrays.asList("Egypt", "Nigeria", "South Africa"));
        countries.put("Asia", Arrays.asList("China", "India", "Japan"));
        countries.put("Europe", Arrays.asList("Germany", "France", "UK"));
        countries.put("North America", Arrays.asList("USA", "Canada", "Mexico"));
        countries.put("South America", Arrays.asList("Brazil", "Argentina", "Chile"));
        countries.put("Australia", Arrays.asList("Australia"));
        return countries;
    }

    public static Map<String, List<String>> getCitiesByCountry() {
        Map<String, List<String>> cities = new HashMap<>();
        cities.put("Egypt", Arrays.asList("Cairo", "Alexandria"));
        cities.put("Nigeria", Arrays.asList("Lagos", "Abuja"));
        cities.put("South Africa", Arrays.asList("Cape Town", "Johannesburg"));
        cities.put("China", Arrays.asList("Beijing", "Shanghai"));
        cities.put("India", Arrays.asList("Delhi", "Mumbai"));
        cities.put("Japan", Arrays.asList("Tokyo", "Osaka"));
        cities.put("Germany", Arrays.asList("Berlin", "Munich"));
        cities.put("France", Arrays.asList("Paris", "Lyon"));
        cities.put("UK", Arrays.asList("London", "Manchester"));
        cities.put("USA", Arrays.asList("New York", "Los Angeles"));
        cities.put("Canada", Arrays.asList("Toronto", "Vancouver"));
        cities.put("Mexico", Arrays.asList("Mexico City", "Cancun"));
        cities.put("Brazil", Arrays.asList("Rio de Janeiro", "Sao Paulo"));
        cities.put("Argentina", Arrays.asList("Buenos Aires", "Cordoba"));
        cities.put("Chile", Arrays.asList("Santiago", "Valparaiso"));
        cities.put("Australia", Arrays.asList("Sydney", "Melbourne"));
        return cities;
    }
}

