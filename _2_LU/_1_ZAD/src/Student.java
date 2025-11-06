public class Student extends Person{
    private String facNumber;

    public Student(String name, String egn, String facNumber) {
        super(name, egn);
        this.facNumber = facNumber;
    }

    public String getFacNumber() {
        return facNumber;
    }

    public void setFacNumber(String facNumber) {
        this.facNumber = facNumber;
    }
}
