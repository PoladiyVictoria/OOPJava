package sem3.data;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

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

    @Override
    public StreamIterator iterator(){
        return new StreamIterator(this);
    }
}
