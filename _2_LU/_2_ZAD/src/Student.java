public class Student extends Person{
    private String facNum;
    private double gradePIK;
    private double gradeTE;
    private double gradePPE;

    public Student(String names, String dateOfBirth, String facNum, double gradePIK, double gradeTE, double gradePPE) {
        super(names, dateOfBirth);
        this.facNum = facNum;
        this.gradePIK = gradePIK;
        this.gradeTE = gradeTE;
        this.gradePPE = gradePPE;
    }

    public String getFacNum() {
        return facNum;
    }

    public double getGradePIK() {
        return gradePIK;
    }

    public void setGradePIK(double gradePIK) {
        this.gradePIK = gradePIK;
    }

    public double getGradeTE() {
        return gradeTE;
    }

    public void setGradeTE(double gradeTE) {
        this.gradeTE = gradeTE;
    }

    public double getGradePPE() {
        return gradePPE;
    }

    public void setGradePPE(double gradePPE) {
        this.gradePPE = gradePPE;
    }

    @Override
    public String toString() {
        return super.toString() + " with grades: PIK - " + this.gradePIK + ", TE - " + this.gradeTE + ", PPE - " + this.gradePPE;
    }

}
