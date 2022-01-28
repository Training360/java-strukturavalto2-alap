package week14.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    OrderService orderService;

    @BeforeEach
    void init() {
        orderService = new OrderService();

        Product p1 = new Product("Tv", "IT", 2000);
        Product p2 = new Product("Laptop", "IT", 2400);
        Product p3 = new Product("Phone", "IT", 400);
        Product p4 = new Product("Lord of The Rings", "Book", 20);
        Product p5 = new Product("Harry Potter Collection", "Book", 120);

        Order o1 = new Order("pending", LocalDate.of(2021, 06, 01));
        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p5);

        Order o2 = new Order("on delivery", LocalDate.of(2021, 06, 07));
        o2.addProduct(p3);
        o2.addProduct(p1);
        o2.addProduct(p2);

        Order o3 = new Order("pending", LocalDate.of(2021, 06, 07));
        o3.addProduct(p1);
        o3.addProduct(p2);
        o3.addProduct(p5);

        Order o4 = new Order("on delivery", LocalDate.of(2021, 06, 01));
        o4.addProduct(p3);
        o4.addProduct(p1);
        o4.addProduct(p2);
        o4.addProduct(p5);

        Order o5 = new Order("pending", LocalDate.of(2021, 06, 01));
        o5.addProduct(p1);
        o5.addProduct(p2);


        orderService.saveOrder(o1);
        orderService.saveOrder(o2);
        orderService.saveOrder(o3);
        orderService.saveOrder(o4);
        orderService.saveOrder(o5);
    }

    @Test
    void getOrdersByStatusTest(){
        List<Order> result = orderService.findOrdersByStatus("pending");
        assertEquals(3,result.size());
        assertEquals(3, result.get(0).getProducts().size());
    }

    @Test
    void countOrdersByStatusTest(){
       long result = orderService.countOrdersByStatus("pending");
        assertEquals(3,result);

    }

    @Test
    void ordersBetweenDatesTest(){
        List<Order> result = orderService.getOrdersBetweenDates(LocalDate.of(2021,6,1),LocalDate.of(2021,6,8));

        assertEquals(3,result.size());
    }

    @Test
    void getOrderWithMaxProducts(){
        Order result = orderService.getOrderWithMaxNumberOfProducts();

        assertEquals(4, result.getProducts().size());
    }

     @Test
    void testFlatMap(){
        List<Product> result = orderService.findProductsOverPrice(400);

        result.stream().forEach(p->System.out.println(p.getPrice()));
     }

     @Test
    void thenComparingTest(){
         orderService.sortOrdersByStatusAndOrderDate().forEach(o-> System.out.println(o.getStatus()+" "+o.getOrderDate()));
     }

}