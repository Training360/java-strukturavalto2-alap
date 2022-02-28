package shipping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShippingServiceTest {


    ShippingService shippingService;

    @BeforeEach
    void init(){
        shippingService = new ShippingService();

        shippingService.addPackage(new NationalPackage(30,true));
        shippingService.addPackage(new NationalPackage(14,false));
        shippingService.addPackage(new NationalPackage(20,true));
        shippingService.addPackage(new NationalPackage(21,true));
        shippingService.addPackage(new InternationalPackage(13,false,"England",3800));
        shippingService.addPackage(new InternationalPackage(40,true,"Germany",1300));
        shippingService.addPackage(new InternationalPackage(2,false,"Germany",1700));
        shippingService.addPackage(new InternationalPackage(20,true,"Austria",600));
        shippingService.addPackage(new InternationalPackage(50,false,"Russia",7900));
    }



    @Test
    void testAddPackage(){
        ShippingService shippingService = new ShippingService();

        assertEquals(0, shippingService.getPackages().size());

        shippingService.addPackage(new NationalPackage(30,true));
        shippingService.addPackage(new InternationalPackage(13,false,"England",3800));

        assertEquals(2, shippingService.getPackages().size());

    }

    @Test
    void testCollectItemsByBreakableAndWeight(){
        List<Transportable> result = shippingService.collectItemsByBreakableAndWeight(true,21);
        assertEquals(3, result.size());

        result = shippingService.collectItemsByBreakableAndWeight(false,40);
        assertEquals(1, result.size());
        assertEquals(50, result.get(0).getWeight());
    }

    @Test
    void testCollectTransportableByCountry(){
        Map<String, Integer> result = shippingService.collectTransportableByCountry();

        assertEquals(4, result.get("Hungary"));
        assertEquals(2, result.get("Germany"));
        assertEquals(1,result.get("Russia"));

        shippingService.addPackage(new InternationalPackage(24,false,"Russia",8900));
        result = shippingService.collectTransportableByCountry();

        assertEquals(4, result.get("Hungary"));
        assertEquals(2, result.get("Germany"));
        assertEquals(2,result.get("Russia"));
        assertEquals(1,result.get("England"));
    }

    @Test
    void testSortInternationalPackagesByDistance(){
        List<Transportable> result = shippingService.sortInternationalPackagesByDistance();
        assertEquals(3800, ((InternationalPackage)shippingService.getPackages().get(4)).getDistance());

        assertEquals("Austria",result.get(0).getDestinationCountry());
        assertEquals("Germany",result.get(1).getDestinationCountry());
        assertEquals("Germany",result.get(2).getDestinationCountry());
        assertEquals("England",result.get(3).getDestinationCountry());
        assertEquals("Russia",result.get(4).getDestinationCountry());

        shippingService.addPackage(new InternationalPackage(24,false,"Slovakia",200));
        result = shippingService.sortInternationalPackagesByDistance();

        assertEquals("Slovakia",result.get(0).getDestinationCountry());

    }


}