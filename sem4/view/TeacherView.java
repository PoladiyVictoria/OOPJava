package sem4.view;

import sem4.data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    
    
    @Override
    public void sendOnConsole(List<Teacher> teachers){
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }
}
