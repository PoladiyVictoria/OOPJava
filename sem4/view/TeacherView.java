package sem4.view;

import sem4.data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    
    
    @Override
    public void sendOnConsole(List<Teacher> list){
        for (Teacher teacher : list) {
            System.out.println(teacher.toString());
        }
    }
}
