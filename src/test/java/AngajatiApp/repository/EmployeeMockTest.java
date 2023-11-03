package AngajatiApp.repository;

import AngajatiApp.model.Employee;
import org.junit.Before;
import org.junit.Test;

import static AngajatiApp.controller.DidacticFunction.ASISTENT;
import static org.junit.Assert.*;

public class EmployeeMockTest {

    private EmployeeMock employeeMock;
    @Before
    public void setUp() {
        employeeMock = new EmployeeMock();
    }

    @Test
    public void TC1_EC_addEmployee() {

        Employee employee = new Employee("Maria","Ion","285011223331",ASISTENT, 2500.0);

        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertFalse(added);

        assertFalse(employeeMock.getEmployeeList().contains(employee));
    }
    @Test
    public void TC2_EC_addEmployee() {
        Employee employee = new Employee("Maria","Ion","2850112233311",ASISTENT, 2500.0);

        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertTrue(added);

        assertTrue(employeeMock.getEmployeeList().contains(employee));
        System.out.println(employee);
    }

    @Test
    public void TC3_EC_addEmployee() {

        Employee employee = new Employee("Maria","Ion","28501122333111",ASISTENT, 2500.0);

        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertFalse(added);

        assertFalse(employeeMock.getEmployeeList().contains(employee));
    }

@Test
public void TC7_EC_addEmployee() {

    Employee employee = new Employee("Maria","I","2850112233311",ASISTENT, 2500.0);

    EmployeeMock employeeMock = new EmployeeMock();

    boolean added = employeeMock.addEmployee(employee);

    assertFalse(added);

    assertFalse(employeeMock.getEmployeeList().contains(employee));
}

    @Test
    public void TC8_EC_addEmployee() {
        Employee employee = new Employee("Maria","Io","2850112233311",ASISTENT, 2500.0);

        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertTrue(added);

        assertTrue(employeeMock.getEmployeeList().contains(employee));
        System.out.println(employee);
    }


    @Test
    public void TC9_EC_addEmployee() {
        Employee employee = new Employee("Maria","Ion","2850112233311",ASISTENT, 2500.0);
        ;
        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertTrue(added);

        assertTrue(employeeMock.getEmployeeList().contains(employee));
        System.out.println(employee);
    }

@Test
public void TC13_EC_addEmployee() {

    Employee employee = new Employee("M","Ion","2850112233311",ASISTENT, 2500.0);

    EmployeeMock employeeMock = new EmployeeMock();

    boolean added = employeeMock.addEmployee(employee);

    assertFalse(added);

    assertFalse(employeeMock.getEmployeeList().contains(employee));
}
    @Test
    public void TC14_EC_addEmployee() {
        Employee employee = new Employee("Ma","Ion","2850112233311",ASISTENT, 2500.0);

        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertTrue(added);

        assertTrue(employeeMock.getEmployeeList().contains(employee));
        System.out.println(employee);
    }


    @Test
    public void TC15_EC_addEmployee() {
        Employee employee = new Employee("Mar","Ion","2850112233311",ASISTENT, 2500.0);
        ;
        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertTrue(added);

        assertTrue(employeeMock.getEmployeeList().contains(employee));
        System.out.println(employee);
    }


    @Test
    public void TC19_EC_addEmployee() {

        Employee employee = new Employee("Maria","Ion","2850112233311",ASISTENT, 0.0);

        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertFalse(added);

        assertFalse(employeeMock.getEmployeeList().contains(employee));
    }

    @Test
    public void TC20_EC_addEmployee() {
        Employee employee = new Employee("Maria","Ion","2850112233311",ASISTENT, 1.0);
        ;
        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertTrue(added);

        assertTrue(employeeMock.getEmployeeList().contains(employee));
        System.out.println(employee);
    }

    @Test
    public void TC25_EC_addEmployee() {
        Employee employee = new Employee("Maria","Ion","2850112233311",ASISTENT, 2500.0);

        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertTrue(added);

        assertTrue(employeeMock.getEmployeeList().contains(employee));
        System.out.println(employee);
    }


    @Test
    public void TC26_EC_addEmployee() {

        Employee employee = new Employee("Maria","Ion","285011223331a",ASISTENT, 2500.0);

        EmployeeMock employeeMock = new EmployeeMock();

        boolean added = employeeMock.addEmployee(employee);

        assertFalse(added);

        assertFalse(employeeMock.getEmployeeList().contains(employee));
    }
}