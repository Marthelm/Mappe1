package marthelm.mappe_del1.hospital;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    public ArrayList<Employee> employees = new ArrayList<>();
    public ArrayList<Patient> patients = new ArrayList<>();

    public Department (String departmentName){
        this.departmentName = departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee e){
        if (!employees.equals(e)) {
            employees.add(e);
        } else {
            throw new IllegalArgumentException("Employee already exists");
        }
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void addPatien(Patient p){
        if (!patients.equals(p)){
            patients.add(p);
        } else {
            throw new IllegalArgumentException("Patient already exists");
        }
    }


}
