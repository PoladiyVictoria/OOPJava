package sem4.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import sem4.data.Teacher;

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
    
    public Teacher getTeacherFromSystem(String firstName, String secondName){
        List<Teacher> res = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getFirstName().equalsIgnoreCase(firstName)
            && teacher.getSecondName().equalsIgnoreCase(secondName)) {
                res.add(teacher);
            }
        }
        if(res.size() == 0){
            throw new IllegalStateException(
                    String.format("Учитель с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(res.size() != 1){
            throw new IllegalStateException("Найдено более одного учителя с указанными именем и фамилией");
        }
        return res.get(0);
    }
    
    public void removeTeacher(String firstName, String secondName){
        for (Teacher teacher : teachers) {
            if (teacher.getFirstName().equalsIgnoreCase(firstName)
            && teacher.getSecondName().equalsIgnoreCase(secondName)) {
                teachers.remove(teacher);
            }
        }
    }

    public List<Teacher> addTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        Teacher newTeacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teachers.add(newTeacher);
        return teachers;
    }
}
