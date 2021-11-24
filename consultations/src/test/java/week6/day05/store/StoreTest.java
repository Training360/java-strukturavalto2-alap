package week6.day05.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week6.day05.store.Product;
import week6.day05.store.ProductWithCount;
import week6.day05.store.Store;
import week6.day05.store.Type;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {


    Store store = new Store();

    @BeforeEach
    void init(){
        store.addProduct(new Product("Milk", Type.DIARY,0.7));
        store.addProduct(new Product("Butter",Type.DIARY,2.3));
    }



    @Test
    void testNumberOfProductsByOneType(){
        List<ProductWithCount> result = store.numberOfProductsByType();

        assertEquals(1,result.size());
        assertEquals(Type.DIARY,result.get(0).getType());
        assertEquals(2,result.get(0).getCount());

    }

    @Test
    void testNumberOfProductsByMoreType(){
        store.addProduct(new Product("Beef",Type.MEAT,2.7));
        List<ProductWithCount> result = store.numberOfProductsByType();


        assertEquals(2,result.size());
        assertEquals(Type.DIARY,result.get(0).getType());
        assertEquals(2,result.get(0).getCount());
        assertEquals(Type.MEAT,result.get(1).getType());
        assertEquals(1,result.get(1).getCount());
    }
}