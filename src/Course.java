/**
 * Created by cmorris on 2017-02-14.
 */

import java.util.List;

public class Course {
    String cname;
    String description;
    List<Course> courseList;

    public Course(String cname, String description){
        this.cname=cname;
        this.description=description;
    }

    public void addCourse(Course c){
        courseList.add(c);
    }
}
