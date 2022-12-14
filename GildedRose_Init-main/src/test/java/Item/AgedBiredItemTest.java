package Item;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBiredItemTest {
    Item item = new Item("+5 Dexterity Vest", 10, 20);
    private Arrays Arrays;
    GildedRose gildedRose = new GildedRose(new Item[]{item});

    @Test
    public void Aged_Brie_하루가_지날때마다_1씩_증가합니다() {
        item.setName("Aged Brie");
        item.setQuality(10);
        item.setSellIn(10);
        gildedRose.updateQuality();

        assertEquals(11, item.getQuality());
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void Aged_Brie_유통기한이_지난_아이템의_퀄리티는_2씩_증가합니다() {
        item.setName("Aged Brie");
        item.setQuality(10);
        item.setSellIn(0);
        gildedRose.updateQuality();

        assertEquals(12, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }

    @Test
    public void Aged_Brie_아이템의_퀄리티는_50을_넘을_수_없습니다() {
        item.setName("Aged Brie");
        item.setQuality(50);
        item.setSellIn(10);
        gildedRose.updateQuality();

        assertEquals(50, item.getQuality());
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void Aged_Brie_유통기한이_지난_아이템의_퀄리티는_50을_넘을_수_없습니다() {
        item.setName("Aged Brie");
        item.setQuality(50);
        item.setSellIn(0);
        gildedRose.updateQuality();

        assertEquals(50, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }
}
