package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    public void setName(String aged_brie) {
        this.name = name;
    }
    public void setSellIn(int i) {
        this.sellIn = sellIn;
    }
    public int getSellIn() {
        return sellIn;
    }
    public void setQuality(int i) {
        this.quality = quality;
    }
    public int getQuality() {
        return quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }



}
