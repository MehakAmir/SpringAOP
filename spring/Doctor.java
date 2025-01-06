public class Doctor implements Staff {
    private String qualification;
    private String name;
    private Nurse nurse;
//constractor 
public Doctor(String name){
    this.name=name;
}
public void displayInfo() {
    System.out.println("Name: " + name);
}
//getter setter of nurse object 
public void setnurse(Nurse nurse){
    this.nurse=nurse;
}
public void displayGreeting() {
    nurse.manage();
}
//getter setter of qualification
public String getQualification(){
    return qualification;
}

public void setQualification(String qualification){
    this.qualification=qualification;
}
    public void assist(){
    System.out.println("Doctor is assisting");
}
}
