package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BossTest {

    @Test
    void testCreateBoss() {
        Boss boss = new Boss("John Doe", "1117 Budapest, Budafoki út 56.", 500_000, 3);

        assertEquals("John Doe", boss.getName());
        assertEquals("1117 Budapest, Budafoki út 56.", boss.getAddress());
        assertEquals(650_000.0, boss.getSalary());
        assertEquals(3, boss.getNumberOfEmployees());
    }

    @Test
    void testCreateBigBoss() {
        BigBoss boss = new BigBoss("John Doe", "1117 Budapest, Budafoki út 56.", 1_000_000, 6, 200_000);

        assertEquals("John Doe", boss.getName());
        assertEquals("1117 Budapest, Budafoki út 56.", boss.getAddress());
        assertEquals(1_800_000.0, boss.getSalary());
        assertEquals(6, boss.getNumberOfEmployees());
    }
}
