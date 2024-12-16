
    /*каталог товаров книжного магазина сохранен в виде двухмерного списка
     List<ArratList<String>> так что на нулевой позиции каждого внутреннего списка находится название жанра
     а на остальных названия книг. напишит метод для заполгеничиданной структуры.
     только уникальные значенич*/


import java.util.ArrayList;
import java.util.List;

public class chetvertaya {


    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "роман", "война и мир");
        addBook(shopBook, "сказка", "золотой ключик");
        addBook(shopBook, "роман", "Мастер и маргарита");
        addBook(shopBook, "фэнтези", "гарри поттер");
        addBook(shopBook, "сказка", "репка");
        addBook(shopBook, "сказка", "репка");
        addBook(shopBook, "фэниези", "репека");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> curList = shopBook.get(i);
            if (curList.get(0).equalsIgnoreCase(genre)){
                if (!curList.contains(nameBook)){
                    curList.add(nameBook);
                }
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);
    }
}
