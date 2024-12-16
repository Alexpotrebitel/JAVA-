import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Integer a = 5;
        List<Integer> list = new ArrayList<>();
        test(a, list);
        System.out.println(a);
        System.out.println(list);

        double b = 3.14;
        int c = Integer.parseInt("5");
        System.out.println(c);
    }

    static void test(int a, List<Integer> list){
        a++;
        list.add(7);
    }
}
    

