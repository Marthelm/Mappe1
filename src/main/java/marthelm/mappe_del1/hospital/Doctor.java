package marthelm.mappe_del1.hospital;

public class Doctor extends Employee{
    public Doctor(String lastName, String firstName, String socialSecurityNumber){
        super(lastName, firstName, socialSecurityNumber);
    }

    protected void setDiagnosis(Patient patient, String diagnosis){

    }
}
