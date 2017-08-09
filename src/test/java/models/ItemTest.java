package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void itemObjectInstantiatesCorrectly_true() {
        Item item = createItem();
        assertTrue(item instanceof Item);
    }

    @Test
    public void getName_returnsNameOfItem() {
        Item item = createItem();
        assertEquals("pannier", item.getName());
    }

    @Test
    public void getManufacturer_returnsManufacturerOfItem() {
        Item item = createItem();
        assertEquals("ortlieb", item.getManufacturer());
    }

    @Test
    public void getModel_returnsModelOfItem() {
        Item item = createItem();
        assertEquals("classic roller", item.getModel());
    }

    @Test
    public void getWeight_returnsWeightOfItem() {
        Item item = createItem();
        assertEquals(5, item.getWeight(), 0);
    }

    @Test
    public void getPrice_returnsPriceOfItem() {
        Item item = createItem();
        assertEquals(99, item.getPrice(), 0);
    }

    @Test
    public void updatePurchaseStatus_returnOpposite() {
        Item item = createItem();
        assertEquals(true, item.updatePurchaseStatus());
    }

    @Test
    public void updatePackedStatus_returnOpposite() {
        Item item = createItem();
        assertEquals(true, item.updatePackedStatus());
    }

    @Test
    public void itemsCanBeAddedToItemsList_returnsSize() {
        Item itemOne = createItem();
        Item itemTwo = new Item("pannier", "ortlieb", "classic roller", 5, 199);
        assertEquals(2, Item.getItemsList().size());

    }

        // helper
    public Item createItem() {
        return new Item("pannier", "ortlieb", "classic roller", 5, 99);
    }
}