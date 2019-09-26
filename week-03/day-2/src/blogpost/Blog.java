package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blog = new ArrayList<>();
    Blog(){
    }

    public void delete(int index){
        blog.remove(index);
    }
    public void update (int toUpdate, BlogPost updater){
        blog.add(toUpdate + 1, updater);
        blog.remove(toUpdate);
    }
}
