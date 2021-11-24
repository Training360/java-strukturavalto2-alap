package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void testCreateEmployee() {
        //Given
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        //Then
        assertEquals("John Doe", employee.getName());
        assertEquals("1117 Budapest, Budafoki út 56.", employee.getAddress());
        assertEquals(300_000.0, employee.getSalary());
    }

    @Test
    void testMigrateEmployee() {
        //Given
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        employee.migrate("1117 Budapest, Budafoki út 100.");
        //Then
        assertEquals("1117 Budapest, Budafoki út 100.", employee.getAddress());
    }

    @Test
    void testRaiseSalary() {
        //Given
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        //When
        employee.raiseSalary(10);
        //Then
        assertEquals(330_000.0, employee.getSalary());
    }
}
