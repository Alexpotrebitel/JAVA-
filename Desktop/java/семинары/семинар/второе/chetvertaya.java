import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;

public class chetvertaya {
   
    
    class ArrayOperations {
        private static File log;
        private static FileWriter fileWriter;
    
        static {
            try {
                log = new File("log.txt");
                if (!log.exists()) {
                    log.createNewFile();
                }
                fileWriter = new FileWriter(log, true); // Открытие для добавления данных
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
        public static void findMinMax(int[] arr) {
            if (arr == null || arr.length == 0) {
                System.out.println("Массив пуст.");
                return;
            }
    
            int min = arr[0];
            int max = arr[0];
    
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
    
            logStep(min, max);
        }
    
        private static void logStep(int min, int max) {
            try {
                String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
                fileWriter.write(timeStamp + " {" + min + "}, {" + max + "}\n");
                fileWriter.flush(); // Обязательно для записи данных
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
        public static void main(String[] args) {
            int[] arr = {};
            // При отправке кода на выполнение, вы можете варьировать эти параметры
            if (args.length == 0) {
                arr = new int[]{9, 4, 8, 3, 1};
            } else {
                arr = Arrays.stream(args[0].split(", "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            }
            ArrayOperations ans = new ArrayOperations();
            ans.findMinMax(arr);
    
            try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    } 
 }