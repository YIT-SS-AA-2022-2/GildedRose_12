package Item;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBiredItemTest {

    private Arrays Arrays;
    Item item = new Item("+5 Dexterity Vest", 10, 20);
    GildedRose gildedRose = new GildedRose(new Item[]{item});

    @Test
    public void Aged_Brie_하루가_지날때마다_1씩_증가합니다() {
        Item[] item = new Item[] { new Item("Aged Brie", 10, 10) };
        gildedRose.updateQuality();
    }

    @Test
    public void Aged_Brie_유통기한이_지난_아이템의_퀄리티는_2씩_증가합니다() {
        Item[] item = new Item[] { new Item("Aged Brie", 10, 0) };
        gildedRose.updateQuality();
    }

    @Test
    public void Aged_Brie_아이템의_퀄리티는_50을_넘을_수_없습니다() {
        Item[] item = new Item[] { new Item("Aged Brie", 50, 10) };
        gildedRose.updateQuality();
    }

    @Test
    public void Aged_Brie_유통기한이_지난_아이템의_퀄리티는_50을_넘을_수_없습니다() {
        Item[] item = new Item[] { new Item("Aged Brie", 50, 0) };
        gildedRose.updateQuality();
    }
}
