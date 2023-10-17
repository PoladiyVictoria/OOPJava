package sem4.controller;

import java.time.LocalDate;
import java.util.Collections;

import sem4.data.Teacher;
import sem4.service.TeacherService;
import sem4.view.TeacherView;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public void getTeacherFromList(String firstName, String secondName){
        Teacher teacher = teacherService.getTeacherFromSystem(firstName, secondName);
        teacherView.sendOnConsole(Collections.singletonList(teacher));
    }

    public void changeSomeTeacher(){
        teacherService.removeTeacher(firstName, secondName);
    }
}
