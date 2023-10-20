package Service;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;
import Data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<Student> students){
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup(){
        return studentGroup;
    }
    
    public List<Student> getSomeStudents(){
        Scanner in = new Scanner(System.in);
        DataService data = new DataService();
        List<User> listStudents = new ArrayList<>();
        listStudents = data.getAllStudent();
        List<Student> resList = new ArrayList<>();
        System.out.println("Выберите студентов в группу!");
        for (User student : listStudents) {
            System.out.print("Введите id Студента");
            Integer idSt = in.nextInt();
            if (idSt == ((Student) student).getStudentId()) {
                resList.add((Student) student);
            }
        }
        return resList;
    }
}
