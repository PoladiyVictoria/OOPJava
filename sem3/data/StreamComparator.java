package sem3.data;

import java.util.Comparator;

public class StreamComparator  implements Comparator<Stream>{
    @Override
    public int compare(Stream s1, Stream s2) {
        int sizeStream1 = s1.getGroups().size();
        int sizeStream2 = s2.getGroups().size();
        
        return Integer.compare(sizeStream1, sizeStream2);
    }
    
}
