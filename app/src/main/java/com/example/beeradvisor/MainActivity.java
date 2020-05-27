package com.example.beeradvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private BeerExpert expert = new BeerExpert();

    public void onClickFindBeer (View view) {
        TextView brands = (TextView) findViewById(R.id.tv_beer_list);
        Spinner color = (Spinner) findViewById(R.id.s_beer_color);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandList) {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}
