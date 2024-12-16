import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main3 {
    /*
    Реализовать консольное приложение которое:
    принимает от пользователя и "запоминает" строки.
    Если введено print, выводит строки так, чтобы последняя введена первой в списке а первая последней 
    Если введено revert то удаляет предыдущую строку из памяти 
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while (work){
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    for (String s: list){
                        System.out.println(s);
                    }
                    break;
                case "revert":
                    list.remove(0);
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(0, line);
            }
        }
    }
}


