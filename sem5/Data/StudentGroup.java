package Data;

import java.util.List;

public class StudentGroup {
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students){
        this.students = students;
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents(){
        return students;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    @Override
    public String toString(){
        return "StudentGroup{" + 
        "teacher(" + teacher + ")" + 
        ", students(" + students + ")" +
        '}';

    }


}
