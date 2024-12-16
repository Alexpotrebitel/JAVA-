import java.time.LocalTime;
import java.util.Scanner;

public class seminar 
{
 /*В консоли запросить имя пользователя в зависимости от текущего времени вывести:
"доброе утро <Имя>!" если время с 5:00 до 11:59
"добрый день<имя>"нсли время с 12:00 до 17:59
"добрый вечер <имя!>"если 18:00 до 22:59
"доброй ночи <имя!>" если время с 23:00 до 4:59

*/

        public static void main(String[] args){ 
        System.out.println("Укажите ваше имя");
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();
        LocalTime time=LocalTime.now();
        int hour=time.getHour();
        if (hour>=5 && hour<12){
            System.out.println("доброе утро,"+name+"!");
        }else if (hour>=12 && hour<18){
            System.out.println("добрый день"+name+"!");
        } else if (hour>=18 && hour<23){
            System.out.println("добрый вечер,"+name+"!");
        }else{
            System.out.println("доброй ночи"+name+"!");
        }
    }
}
    
