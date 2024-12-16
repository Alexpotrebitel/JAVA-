//заполнить список случайными числами
// отсортировать методом sort и вывести на экран



    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.Random;
    
    public class vtoraya {
    
        public static void main(String[] args) {
            List<Integer> a = masRandom(5, 1, 5);
            System.out.println(a);
            a.sort(null);
            System.out.println(a);
        }
    
        public static List<Integer> masRandom(int count, int min, int max){
            List<Integer> mas = new ArrayList<>(count);
            Random rand = new Random();
            for (int i = 0; i < count; i++) {
                mas.add(rand.nextInt(min, max+1));
            }
            return mas;
        }
    }        

