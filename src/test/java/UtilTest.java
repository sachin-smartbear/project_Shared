import org.example.Employee;
import org.example.Util;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilTest {

    private Util util = new Util();

    @Test
    public void testCreateEmployee() {
        Employee employee = util.createEmployee("John", 30, 50000, "IT");
        assertEquals("John", employee.getName());
        assertEquals(30, employee.getAge());
        assertEquals(50000, employee.getSalary(), 0);
        assertEquals("IT", employee.getDepartment());

    }

    @Test
    public void testUpdateEmployee() {
        Employee employee = util.createEmployee("John", 30, 50000, "IT");
        util.updateEmployee(employee, 31, 55000, "HR");
        assertEquals("John", employee.getName());
        assertEquals(31, employee.getAge());
        assertEquals(55000, employee.getSalary(), 0);
        assertEquals("HR", employee.getDepartment());
    }
}