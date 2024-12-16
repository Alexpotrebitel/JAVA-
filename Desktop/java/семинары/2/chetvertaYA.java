//напишите метод который составляет строку состоящую из 100 повторений слова Test
// и метод что запишет в простой текстовый файл обрабатывайте исключения
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.lang.model.util.TypeKindVisitor9;
public class chetvertaYA
{
    public static void main(String[] args)
        {
        String filePath="C:/Users/User/Desktop/гикбрейнс/java/семинары/2/test.txt";
        
        String s = "Test";
        int n=100;
        String s1=repeat(s,n);
        //System.out.println(s1);
        System.out.println(readfile(filePath));
        saveToFile(s1,filePath);
    }
    static void closeLqogger()
    {
        Handler[] handlers=logger.getHandlers();
        for (Handler handler:handlers){
            handler.close();
        }
    }
    static void createLogger( String logPath)
    {
        FileHandler handler=new FileHandler(logPath, append:true);
        {Logger.addHandler(handler);
        Simpleformatter formatter = new Simple formatter();
        handler.setFormatter(formatter);}

        String logPath="C:/Users/User/Desktop/гикбрейнс/java/семинары/2/log.txt";
    } catch (IOException e){
        e.printStackTrace();
    }

    static void saveToFile(String s, String filePath){
        
        Logger logger=Logger.getAnonymousLogger();
        FileHandler handler=new FileHandler();
        FileWriter writer=null;
        try (FileWriter file= new FileWriter(filePath)){
        writer.write(s);
        logger.info("запись прошла успешно");
        
        
        } catch (Exception e)
            {
            e.printStackTrace();
            logger.warning("запись не удалась");
            
            }
    }
    static String readfile (String filepath){

        File file=new File(filePath);
        StringBuuilder stringBuilder= new StringBuilder();
        try (Scanner scanner= new Scanner(file)){
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            
            }
        } catch (Exception e){
        {e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    }
    static String repeat (String s, int n)
        {
        StringBuilder stringBuilder= new StringBuilder();
        for (int i=0; i<n; i++)
            {
            stringBuilder.append(s);
            stringBuilder.append("");   
            }
// return s.repeat(n);
        return stringBuilder.toString();
    }
}
