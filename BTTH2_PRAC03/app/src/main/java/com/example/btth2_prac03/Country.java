
package com.example.btth2_prac03;

public class Country {
    private String name;
    private String capital;
    private String population;
    private String area;
    private String density;
    private String worldShare;
    private int flagResId;  // Lưu trữ resource id của lá cờ

    public Country(String name, String capital, String population, String area, String density, String worldShare, int flagResId) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.density = density;
        this.worldShare = worldShare;
        this.flagResId = flagResId;
    }

    public String getName() { return name; }
    public String getCapital() { return capital; }
    public String getPopulation() { return population; }
    public String getArea() { return area; }
    public String getDensity() { return density; }
    public String getWorldShare() { return worldShare; }
    public int getFlagResId() { return flagResId; }
}
