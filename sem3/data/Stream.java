package sem3.data;

import java.util.ArrayList;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private List<StudentGroup> groups;

    public Stream(){
        groups = new ArrayList<>();
    }

    public void addGroup (StudentGroup group) {
       groups.add(group);
    }

    public List<StudentGroup> getGroups(){
        return groups;
    }

    public int getLengthGroups(){
        return groups.size();
    }

    @Override
    public StreamIterator iterator(){
        return new StreamIterator(this);
    }
}
