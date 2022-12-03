package Item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.gildedrose.GildedRose;
import com.gildedrose.Item;
import org.junit.jupiter.api.Test;


public class SulfurasItemTest {
    Item item = new Item("+5 Dexterity Vest", 10, 20);
    GildedRose gildedRose = new GildedRose(new Item[]{item});

    @Test
    public void Sulfuras_아이템은_퀄리티와_유통기한_모두_절대_변하지_않습니다() {
        Item[] item = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 10) };
        gildedRose.updateQuality();
    }

    @Test
    public void Sulfuras_아이템의_퀄리티는_0에서_50제한과_상관없이_변하지_않습니다() {
        Item[] item = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 80, -1) };
        gildedRose.updateQuality();
    }
}
