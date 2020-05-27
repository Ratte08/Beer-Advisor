package com.example.beeradvisor;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();

        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("light")) {
            brands.add("Dogfish Head Slighty Mighty");
            brands.add("Harpoon Rec League");
        } else if (color.equals("brown")) {
            brands.add("Sweetwater Georgia Brown");
            brands.add("Durty Mud Season Hoppy Brown Ale");
        } else {
            brands.add("Keegan's Mother's Milk Stout");
            brands.add("Sumi Zest | Imperial Stout");
        }

        return brands;
    }
}
