import java.util.List;

/**
 * Created by ethan on 2017-02-07.
 */
public class Student extends Person {
    String major;
    boolean fullTime;
    List<Course> courseList;

    public Student(String name, String emailAddress, String major, boolean fullTime) {
        super(name, emailAddress);
        this.major = major;
        this.fullTime = fullTime;

    }

    public String toString() {
        return String.format("Name: %s\nMajor: %s\nEmail: %s", this.name, this.major, this.emailAddress);
    }

    public void addCourse(Course c){
        courseList.add(c);
    }
}
