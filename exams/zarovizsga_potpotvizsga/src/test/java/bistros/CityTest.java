package bistros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City city = new City();

    @BeforeEach
    void init(){
        MenuItem food1 = new MenuItem("Chicken",2400,MenuItemType.FOOD);
        MenuItem food2 = new MenuItem("Beef",4400,MenuItemType.FOOD);
        MenuItem food3 = new MenuItem("Pork",3400,MenuItemType.FOOD);
        MenuItem drink1 = new MenuItem("Coke",550,MenuItemType.DRINK);
        MenuItem drink2 = new MenuItem("Beer",750,MenuItemType.DRINK);
        MenuItem drink3 = new MenuItem("Sprite",550,MenuItemType.DRINK);

        Bistro bistro1 = new Bistro("Best bistro",new Address("Kossuth",12));
        Bistro bistro2 = new Bistro("Good bistro",new Address("Kossuth",13));
        Bistro bistro3= new Bistro("Cool bistro",new Address("Rákóczi",18));
        Bistro bar1= new Bar("Cool bar",new Address("Rákóczi",11));
        Bistro bar2= new Bar("Best bar",new Address("Kossuth",19));

        bistro1.addMenuItem(food1);
        bistro1.addMenuItem(food2);
        bistro1.addMenuItem(food3);
        bistro1.addMenuItem(drink1);
        bistro1.addMenuItem(drink2);
        bistro1.addMenuItem(drink3);

        bistro2.addMenuItem(food1);
        bistro2.addMenuItem(food2);
        bistro2.addMenuItem(drink1);

        bistro3.addMenuItem(food1);
        bistro3.addMenuItem(food3);
        bistro3.addMenuItem(drink2);
        bistro3.addMenuItem(drink3);

        bar1.addMenuItem(drink1);
        bar1.addMenuItem(drink3);

        bar2.addMenuItem(drink1);
        bar2.addMenuItem(drink2);
        bar2.addMenuItem(drink3);

        city.addBistro(bistro1);
        city.addBistro(bistro2);
        city.addBistro(bistro3);
        city.addBistro(bar1);
        city.addBistro(bar2);

    }

    @Test
    void addBistroToCityTest(){
        City city = new City();

        assertTrue(city.getBistros().isEmpty());

        Bistro bistro1 = new Bistro("Best bistro",new Address("Kossuth",12));
        MenuItem food1 = new MenuItem("Chicken",2400,MenuItemType.FOOD);

        bistro1.addMenuItem(food1);
        city.addBistro(bistro1);

        assertEquals(List.of("Best bistro"), city.getBistros().stream().map(Bistro::getName).toList());

    }

    @Test
    void testFindBistroByAddress(){

        assertEquals("Cool bistro", city.findBistroByAddress(new Address("Rákóczi",18)).getName());
        assertEquals("Best bar (Only Drinks)", city.findBistroByAddress(new Address("Kossuth",19)).getName());
    }

    @Test
    void testFindLongestMenu(){
        assertEquals("Best bistro",city.findLongestMenu().getName());
    }

    @Test
    void testFindBistroWithMenuItem(){
        assertEquals(List.of("Best bistro","Good bistro","Cool bistro"),city.findBistroWithMenuItem("Chicken").stream().map(Bistro::getName).toList());
        assertEquals(List.of("Best bistro","Cool bistro","Best bar (Only Drinks)"),
                city.findBistroWithMenuItem("Beer").stream().map(Bistro::getName).toList());

    }

}