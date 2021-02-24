package marthelm.mappe_del1.hospital;


public class Patient extends Person implements IDiagnosable{

    private String diagnosis = "";

    public Patient(String lastName, String firstName, String socialSecurityNumber){
        super(lastName, firstName, socialSecurityNumber);
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
