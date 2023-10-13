package sem3.service;

import java.util.List;

import sem3.data.Stream;
import sem3.data.StreamComparator;


public class StreamService {
   
    public void  getSortedStudentGroup(List<Stream> stream){
        stream.sort(new StreamComparator());
    }
}
