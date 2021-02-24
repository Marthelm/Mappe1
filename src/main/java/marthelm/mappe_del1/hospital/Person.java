package marthelm.mappe_del1.hospital;

public class Person {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Person(String lastName, String firstName, String socialSecurityNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
