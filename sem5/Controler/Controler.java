package Controler;

import Data.Type;
import Data.User;
import Data.Student;
import Data.Teacher;
import Service.DataService;
import Service.StudentGroupService;
import View.StudentGroupView;
import View.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudentGroupService stGroupService = new StudentGroupService();
    private final StudentGroupView stGroupView = new StudentGroupView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.TEACHER);
    }



    public void createStudentGroup(Teacher teacher){
        List<Student> students = stGroupService.getSomeStudents();
        stGroupService.createStudentGroup(teacher, students);
        
    }
}
