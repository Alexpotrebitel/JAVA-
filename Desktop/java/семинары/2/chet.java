import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class chet {
    private static Logger logger = Logger.getLogger(ChetvertaYA.class.getName());

    public static void main(String[] args) {
        String filePath = "C:/Users/User/Desktop/гикбрейнс/java/семинары/2/test.txt";

        String s = "Test";
        int n = 100;
        String s1 = repeat(s, n);
        System.out.println(s1);
        System.out.println(readFile(filePath));
        saveToFile(s1, filePath);
    }

    static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler : handlers) {
            handler.close();
        }
    }

    static void createLogger(String logPath) {
        try {
            FileHandler handler = new FileHandler(logPath, true);
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void saveToFile(String s, String filePath) {
        String logPath = "C:/Users/User/Desktop/гикбрейнс/java/семинары/2/log.txt";
        createLogger(logPath);

        FileWriter writer = null;
        try {
            writer = new FileWriter(filePath);
            writer.write(s);
            logger.info("запись прошла успешно");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("запись не удалась");
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            closeLogger();
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
