package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {
    @Test
    public void foo() {
        GildedRose app = testItem("test", 0, 0);
        assertEquals(0, app.items[0].quality);
    }

    private GildedRose testItem(String item, Integer sellin, Integer quality) {
        Item[] items = new Item[]{new Item(item, sellin, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        return app;
    }
}
