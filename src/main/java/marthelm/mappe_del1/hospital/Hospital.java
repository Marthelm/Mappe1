package marthelm.mappe_del1.hospital;

import java.util.ArrayList;

public class Hospital {

    private String hospitalName;
    public ArrayList<Department> departments;

    public Hospital (String hospitalName){
        this.hospitalName = hospitalName;
        this.departments = new ArrayList<>();
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void addDepartments(Department d){
        if (!departments.equals(d)) {
            departments.add(d);
        } else {
            throw new IllegalArgumentException ("Department allready in list");
        }
    }

    public String getHospitalName() {
        return hospitalName;
    }

    @Override
    public String toString() {
        return "Hospital" +
                "\nhospitalName: " + hospitalName + "\n" + "departments: " + departments;
    }
}
