package marthelm.mappe_del1.hospital.healtpersonell;

import marthelm.mappe_del1.hospital.Employee;
import marthelm.mappe_del1.hospital.Patient;

public class Doctor extends Employee {
    public Doctor(String lastName, String firstName, String socialSecurityNumber){
        super(lastName, firstName, socialSecurityNumber);
    }

    protected void setDiagnosis(Patient patient, String diagnosis){

    }
}
