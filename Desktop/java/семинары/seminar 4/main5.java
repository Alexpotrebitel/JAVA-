import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


    public class main5 {
        /*
        Реализовать стэк с помощью массива.
        Нужно реализовать методы:
        size(), empty(), push(), peek(), pop().
         */
        public static void main(String[] args) {
            MyStack stack = new MyStack();
            stack.push("1");
            stack.push("2");
            stack.push("3");
            stack.push("4");
    
            System.out.println(stack);
            stack.pop();
            stack.pop();
            System.out.println(stack);
        }
    }   

