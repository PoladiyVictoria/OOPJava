package sem3.service;

import java.util.ArrayList;
import java.util.List;

import sem3.data.Stream;
import sem3.data.StreamComparator;


public class StreamService {
     
    private List<Stream> streams;

    public StreamService(){
        streams = new ArrayList<>();
    }
    
    public void  SortedStudentGroup(List<Stream> stream){
        stream.sort(new StreamComparator());
    }

    public List<Stream> getSortedStreams(){
        SortedStudentGroup(streams);
        return streams;
    }

}
