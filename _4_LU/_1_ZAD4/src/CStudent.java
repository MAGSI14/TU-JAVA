import java.util.ArrayList;
import java.util.List;

public class CStudent {
    private String name;
    private List<Double> scores;
    private String fn;

    public CStudent(String name, String fn){
        this.name = name;
        this.scores = new ArrayList<>();
        this.fn = fn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public List<Double> getScores() {
        return scores;
    }

    public double getGrade(){
        if(scores.isEmpty()){
            throw new NullPointerException("There are no grades!");
        }

        double avg = 0;

        for (double score : scores){
            avg += score;
        }
        return avg / scores.size();
    }

    public void addScore(double grade){
        this.scores.add(grade);
    }

    @Override
    public String toString() {
        return "\nName: " + this.name + "\nF number: " + this.fn + "\nGrades: " + scores + "\nAvg grade: " + getGrade();
    }
}
