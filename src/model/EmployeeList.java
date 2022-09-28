/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author limingxia
 */
public class EmployeeList {
    
    private ArrayList<Employee> employeeList;

    public EmployeeList() {
        this.employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public void addNewEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        this.employeeList.remove(employee);
    }
    
    public int count() {
        return this.employeeList.size();
    }
    
    
}
