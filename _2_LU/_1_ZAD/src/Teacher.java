public class Teacher extends Person{
private Course nameOfCourse;

    public Teacher(String name, String egn, Course nameOfCourse) {
        super(name, egn);
        this.nameOfCourse = nameOfCourse;
    }

    public Course getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(Course nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }
}
