
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class chat {
    public static void main(String[] args) {
        String filePath = "C:/Users/User/Desktop/гикбрейнс/java/семинары/2/test.txt";
        String s = "Test";
        int n = 100;
        String s1 = repeat(s, n);
        System.out.println(readFile(filePath));
        saveToFile(s1, filePath);
    }

    static void saveToFile(String s, String filePath) {
        String logPath = "C:/Users/User/Desktop/гикбрейнс/java/семинары/2/log.txt";
        Logger logger = Logger.getAnonymousLogger();
        FileHandler handler;
        try {
            handler = new FileHandler(logPath);
            logger.addHandler(handler);
            FileWriter writer = new FileWriter(filePath);
            writer.write(s);
            writer.close();
            logger.info("запись прошла успешно");
        } catch (IOException e) {
            e.printStackTrace();
            logger.warning("запись не удалась");
        }
    }

    static String readFile(String filePath) {
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static String repeat(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}