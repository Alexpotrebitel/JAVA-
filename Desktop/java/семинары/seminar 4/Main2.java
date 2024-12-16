
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    /*
    реализовать консольное приложение которое:
    Принимает от пользователя строку вида:
    text-num
    нужно расплитить строку по~, сохранить text в связный список на позицию num
    Если введено print~num, выводит строку из позиции num и удаляет ее из списка
     */
     public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            String line = scanner.nextLine();
            String[] partsLine = line.split("~");
            String text = partsLine[0];
            String strNum = partsLine[1];
            int num = Integer.parseInt(strNum);
            if ((list.isEmpty() && num == 0) || (num <= list.size() && num >= 0)) {
                switch (text) {
                    case "print":
                        print(num, list);
                        break;
                    case "finish":
                        work = false;
                        break;
                    default:
                        list.add(num, text);
                }
            } else {
                System.out.println("Недопустимый индекс. Укажите значения от 0 до" + list.size());
            }
        }
    }

    private static void print(int num, List<String> list) {
        if (num == list.size()){
            System.out.println("Недопустимый индекс. Укажите значения от 0 до "
                    + (list.size() - 1));
        } else {
            System.out.println(list.remove(num));
        }
    }
}

















