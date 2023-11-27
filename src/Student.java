import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String name;
    private int group;
    private int course;

    private List<Grade> grades = new ArrayList<Grade>();

    Student (String name) {
        this.name = name;
    }
    Student (String name, int group, int course, List<Grade> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    Student (String name, int group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAverageMark() {
        int sum = 0, i;
        for (i = 0; i < 1; i++){
            sum += grades.get(i).getMark();
            }
        return sum/i;
    }

    public void addSubject(Subject subject, int mark) {
        Grade grade = new Grade(subject, mark);
        grades.add(grade);
    }


}
