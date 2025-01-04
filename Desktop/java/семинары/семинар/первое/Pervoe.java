import java.time.LocalTime;
import java.util.Scanner;
class Answer 
{
    public int factorial(int n)
    {
      if (n==0)
      {
        return 1;
      }
      if (n<0)
      {
        return -1;
      }
      int result=1;
      for (int i=2;i<=n;i=i+1)
        {
          result=result*i;  
        }
        return result;
    } 

    // Введите свое решение ниже
    
    
    }
    // Не удаляйте этот класс - он нужен для вывода результатов на   экран и проверки
    public class Pervoe {
    public static void main(String[] args) {
    int n = 5;
    if (args.length > 0) {
    n = Integer.parseInt(args[0]);
    }
    // Вывод результата на экран
    Answer ans = new Answer();
    int itresume_res = ans.factorial(n);
    System.out.println(itresume_res);
    }
    }
