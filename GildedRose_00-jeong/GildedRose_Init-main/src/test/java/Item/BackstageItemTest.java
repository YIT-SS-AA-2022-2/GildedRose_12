package Item;

import org.junit.jupiter.api.Test;
import com.gildedrose.GildedRose;
import com.gildedrose.Item;

public class BackstageItemTest {
    Item item = new Item("+5 Dexterity Vest", 10, 20);
    GildedRose gildedRose = new GildedRose(new Item[]{item});

    @Test
    public void Backstage_아이템의_퀄리티는_유통기한이_10일보다_많이_남으면_1씩_증가합니다() {
        Item[] item = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 11) };
        gildedRose.updateQuality();
    }

    @Test
    public void Backstage_아이템의_퀄리티는_유통기한이_10일보다_많아도_50을_넘을_수_없습니다() {
        Item[] item = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 50, 11) };
        gildedRose.updateQuality();
    }

    @Test
    public void Backstage_아이템의_퀄리티는_유통기한이_5일_초과_10일_이하로_남으면_2씩_증가합니다() {
        Item[] item = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10) };
        gildedRose.updateQuality();
    }

    @Test
    public void Backstage_아이템의_퀄리티는_유통기한이_5일_초과_10일_이하로_남아도_50을_넘을_수_없습니다() {
        Item[] item = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 49, 10) };
        gildedRose.updateQuality();
    }

    @Test
    public void Backstage_아이템의_퀄리티는_유통기한이_1일_이상_5일_이하로_남으면_3씩_증가합니다() {
        Item[] item = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5) };
        gildedRose.updateQuality();
    }

    @Test
    public void Backstage_아이템의_퀄리티는_유통기한이_1일이상_5일이하로_남아도_퀄리티는_50을_넘을_수는_없습니다() {
        Item[] item = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 48, 5) };
        gildedRose.updateQuality();
    }

    @Test
    public void Backstage_아이템의_퀄리티는_유통기한이_지나면_0이_됩니다() {
        Item[] item = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 0) };
        gildedRose.updateQuality();
    }
}