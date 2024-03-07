import java.util.List;
import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("C/C++");
        list.add("Python");
        list.add("GO");
        System.out.println("Program Language....");
        for (String item:list)
        {
            System.out.println("\t" + item);
        }
    }
}
