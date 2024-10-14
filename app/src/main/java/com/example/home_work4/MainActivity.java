package com.example.home_work4;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private RecyclerView continentRecyclerView;
    private RecyclerView countryRecyclerView;
    private RecyclerView cityRecyclerView;

    private ContinentAdapter continentAdapter;
    private CountryAdapter countryAdapter;
    private CityAdapter cityAdapter;

    private Map<String, List<String>> countriesByContinent;
    private Map<String, List<String>> citiesByCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        continentRecyclerView = findViewById(R.id.continent_recycler_view);
        countryRecyclerView = findViewById(R.id.country_recycler_view);
        cityRecyclerView = findViewById(R.id.city_recycler_view);

        countriesByContinent = DataProvider.getCountriesByContinent();
        citiesByCountry = DataProvider.getCitiesByCountry();

        List<String> continents = DataProvider.getContinents();
        continentAdapter = new ContinentAdapter(continents, this::onContinentClick);
        continentRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        continentRecyclerView.setAdapter(continentAdapter);

        findViewById(R.id.country_label).setVisibility(View.GONE);
        findViewById(R.id.city_label).setVisibility(View.GONE);
    }

    private void onContinentClick(String continent) {
        List<String> countries = countriesByContinent.get(continent);
        if (countries != null) {
            findViewById(R.id.country_label).setVisibility(View.VISIBLE);
            countryAdapter = new CountryAdapter(countries, this::onCountryClick);
            countryRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            countryRecyclerView.setAdapter(countryAdapter);
        }
    }

    private void onCountryClick(String country) {
        List<String> cities = citiesByCountry.get(country);
        if (cities != null) {
            findViewById(R.id.city_label).setVisibility(View.VISIBLE);
            cityAdapter = new CityAdapter(cities);
            cityRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            cityRecyclerView.setAdapter(cityAdapter);
        }
    }
}
