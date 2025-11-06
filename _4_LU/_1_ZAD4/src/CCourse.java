import java.util.*;
public class CCourse {
    private List<CStudent> students;
    private String courseName;

    public CCourse(String name){
        this.students = new ArrayList<>();
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<CStudent> getStudents() {
        return students;
    }

    public void addScore(String fn, double grade){
        for(CStudent st : students){
            if(st.getFn() == fn){
                st.addScore(grade);
                break;
            }
        }
    }
    public void addScores(String fn, List<Double> grades){
        for(CStudent st : students){
            if(st.getFn() == fn){
                for(double grade : grades){
                    st.addScore(grade);
                }
            }
        }
    }
    public void addStudent(String name, String fn){
        if(students.size() >= 30){
            throw new IndexOutOfBoundsException();
        }
        students.add(new CStudent(name, fn));
    }
    public void displayScores(){
        System.out.println("\nРезултати за курс: " + this.courseName);
        for (CStudent s : students) {
            System.out.println(s.toString());
        }
    }
}
