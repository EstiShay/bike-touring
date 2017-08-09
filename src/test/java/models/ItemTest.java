package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/9/17.
 */
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


    // helper
    public Item createItem() {
        return new Item("pannier", "ortlieb", "classic roller", 5, 99);
    }


}