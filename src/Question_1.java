import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) {

        float sum = 0;

        List<Float> list = new ArrayList<>(5);
        list.add(13.2f);
        list.add(6.3f);
        list.add(79.2f);
        list.add(22.4f);
        list.add(23.2f);

        Iterator<Float> itr = list.iterator();
        while (itr.hasNext()){
            sum += itr.next();
        }

        System.out.println("Total sum : " + sum);
    }
}
