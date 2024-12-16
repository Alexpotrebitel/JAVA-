/*

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    /*
    1) Замерьте время за которое в ArrayLiSt добавляется 1000 элементов
    2) Замерьте время за которое в LinkedLiSt добавляется 1000 элементов
     */
    
/*
    private static long work(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(list.size()/2, i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
*/ 
//чат gpt

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    /* одна из ошибок нужно было написать в терминале 
    mkdir "C:\Users\User\Desktop\гикбрейнс\java\семинары\seminar4"
   
 1) Замерьте время, за которое в ArrayList добавляются 10000 элементов. 
    2) Замерьте время, за которое в LinkedList добавляются 10000 элементов. Сравните с предыдущим.
    */ 

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println(work(list1));
        System.out.println(work(list2));
    }

    private static long work(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(list.size() / 2, i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
