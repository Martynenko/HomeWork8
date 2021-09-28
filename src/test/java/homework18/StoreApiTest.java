package homework18;

import org.testng.annotations.Test;

import java.io.IOException;

public class StoreApiTest {
    @Test
    public void InventoryTest() throws IOException {
        StoreApi.getInventory();
    }

    @Test
    public void PlacedOrderTest() throws IOException {
        StoreApi.createNewOrder();
    }

    @Test
    public void OrderIdTest() throws IOException {
        StoreApi.getPurchaseById(10);

    }

    @Test
    public void deleteOrderTest() throws IOException {
        StoreApi.deleteOrderById(10);

    }
}

