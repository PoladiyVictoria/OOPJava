package sem4.controller;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;

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

    public void changeSomeTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Имя и Фамилию учителя которого хотите поменять!");
        System.out.print("Введите Имя: ");
        String fName = in.next();
        System.out.print("Введите Фамилию: ");
        String sName = in.next();
        teacherService.removeTeacher(fName, sName);
        teacherService.addTeacher(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
