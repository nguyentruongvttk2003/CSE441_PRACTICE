
package com.example.btth2_prac03;

import java.util.ArrayList;
import java.util.List;

public class CountryData {

    public static List<Country> getTopCountries() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("India", "New Delhi", "1,428.6 million", "2,973,190 Km²", "481 people/Km²", "17.76%", R.drawable.india));
        countries.add(new Country("China", "Beijing", "1,412.6 million", "9,596,961 Km²", "147 people/Km²", "17.36%", R.drawable.china));
        countries.add(new Country("United States", "Washington DC", "334.8 million", "9,833,517 Km²", "36 people/Km²", "4.35%", R.drawable.united_states));
        countries.add(new Country("Indonesia", "Jakarta", "276.4 million", "1,904,569 Km²", "145 people/Km²", "3.51%", R.drawable.indoesia));
        countries.add(new Country("Pakistan", "Islamabad", "231.4 million", "881,912 Km²", "262 people/Km²", "2.89%", R.drawable.pakistan));
        countries.add(new Country("Nigeria", "Abuja", "223.8 million", "923,768 Km²", "243 people/Km²", "2.78%", R.drawable.nigeria));
        countries.add(new Country("Brazil", "Brasilia", "216.6 million", "8,515,767 Km²", "25 people/Km²", "2.73%", R.drawable.brazil));
        countries.add(new Country("Bangladesh", "Dhaka", "172.9 million", "147,570 Km²", "1,173 people/Km²", "2.20%", R.drawable.bangladesh));
        return countries;
    }
}
