//public class Main4 {
    /* Взять набор строк например
     Мороз и солнце день чудесный 
     Еще ты дремлешь друг прелестный.
     Пора красавица проснись .
     Написать метод, который отсортирует эти строки по длине с помощью Treemap 
     сЛОВА с одинаковой длиной не должны "потеряться"

  
    public static void main(String[] args) {
        String line = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "пора красавица проснись.";
        Map<Integer, List<String>> map = new TreeMap<>();
        line = line.replace("\n", " ").replace(".", "");
        String[] words = line.split(" ");
        for (String word: words){
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }

        System.out.println(map);
    }
}
*/
import java.util.*;

public class Main4 
{
    /*
     Взять набор строк например:
     Мороз и солнце день чудесный
     Еще ты дремлешь друг прелестный.
     Пора красавица проснись.
     Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
     Слова с одинаковой длиной не должны "потеряться".
    */
    public static void main(String[] args) {
        String line = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "пора красавица проснись.";
        
        Map<Integer, List<String>> map = new TreeMap<>();
        line = line.replace("\n", " ").replace(".", "");
        String[] words = line.split("\\s+"); // Используем "\\s+" для корректного разделения слов по пробелам

        for (String word: words) {
            int len = word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }

        // Выводим отсортированные строки по длине
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) 
        {
            System.out.println("Длина: " + entry.getKey() + " Слова: " + entry.getValue());
        
        }    }
}