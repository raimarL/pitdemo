package de.mathema.mutationtesting.itemmanagement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rai on 23.04.17.
 */
public class ItemManagementTest {

    ItemManagement itemManagement;

    @Before
    public void init(){
        itemManagement = new ItemManagement();
    }

    @Test
    public void availableItemReturnsTrue() {
        Item item = new Item("item1", Category.A, 1234, true);
        Assert.assertEquals(itemManagement.checkItem(item), true);
    }

    @Test
    public void unavailableItemReturnsFalse() {
        Item item = new Item("item2", Category.A, 9999, false);
        Assert.assertEquals(itemManagement.checkItem(item), true);
    }

    // TEST CASES AUS FOLIEN

    /*
    @Test
    public void categoryBWithLowArtNumberReturnsFalse() {
        Item item = new Item("item3", Category.B, 1, true);
        Assert.assertEquals(itemmanagement.checkItem(item), false);
    }

    @Test
    public void invalidArtNumberReturnsFalse() {
        Item item = new Item("item4", Category.A, -1, true);
        Assert.assertEquals(itemmanagement.checkItem(item), false);
    }
    */
}
