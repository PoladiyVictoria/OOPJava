package sem4.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import sem3.data.Teacher;

public class TeacherService implements UserService<Teacher>{
    
    private List<Teacher> teachers;

    public TeacherService(){
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll(){
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teachers.add(teacher);
    }
}
