package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeMockTestLab3 {
    private EmployeeMock employeeMock;

    @Before
    public void setUp() {
        employeeMock = new EmployeeMock();
    }
    @Test
    public void TC01_testModifyEmployeeFunction() {
        List<Employee> employeeList = employeeMock.getEmployeeList();

        Employee employeeToModify = employeeList.get(1);

        DidacticFunction newFunction = DidacticFunction.TEACHER;

        DidacticFunction oldFunction = employeeToModify.getFunction();

        employeeMock.modifyEmployeeFunction(employeeToModify, newFunction);

        assertEquals(newFunction, employeeToModify.getFunction());

       // List<Employee> updatedEmployeeList = employeeMock.getEmployeeList();
      //  assertEquals(employeeList, updatedEmployeeList);
    }

    @Test
    public void testModifyEmployeeFunctionWithTheSameFunction() {
        EmployeeMock employeeMock = new EmployeeMock();
        List<Employee> employeeList = employeeMock.getEmployeeList();

        Employee employeeToModify = employeeList.get(0);

        DidacticFunction newFunction = DidacticFunction.ASISTENT;

        DidacticFunction oldFunction = employeeToModify.getFunction();

        employeeMock.modifyEmployeeFunction(employeeToModify, newFunction);

        assertEquals(newFunction, employeeToModify.getFunction());

        for (Employee employee : employeeList) {
            if (employee != employeeToModify) {
                assertEquals(oldFunction, employee.getFunction());
            }
        }
    }
    @Test
    public void TC02_testModifyEmployeeFunction() {
        EmployeeMock employeeMock = new EmployeeMock();
        List<Employee> employeeList = employeeMock.getEmployeeList();

        Employee employeeToModify = null;

        DidacticFunction newFunction = DidacticFunction.TEACHER;

        employeeMock.modifyEmployeeFunction(employeeToModify, newFunction);

        List<Employee> updatedEmployeeList = employeeMock.getEmployeeList();
        assertEquals(employeeList, updatedEmployeeList);
    }
    @Test
    public void TC03_testModifyEmployeeFunction() {
        EmployeeMock employeeMock = new EmployeeMock();
        List<Employee> employeeList = employeeMock.getEmployeeList();

        int nonExistentEmployeeId = 9;

        Employee nonExistentEmployee = new Employee();
        nonExistentEmployee.setId(nonExistentEmployeeId);
        DidacticFunction newFunction = DidacticFunction.TEACHER;

        employeeMock.modifyEmployeeFunction(nonExistentEmployee, newFunction);

        List<Employee> updatedEmployeeList = employeeMock.getEmployeeList();
        assertEquals(employeeList, updatedEmployeeList);
    }
}
