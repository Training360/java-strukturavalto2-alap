package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testPublicVehicles() {
        PublicVehicle bus = new Bus(18, 16.5, "Ikarus");
        PublicVehicle tram = new Tram(17, 31.2, 2);
        PublicVehicle metro = new Metro(4, 89.4, 10);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicles().size());
    }
}