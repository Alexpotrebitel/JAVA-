// дан массив nums=[3,2,5,3] и число val=3
// если в масмиве есть числа равные заданному, нужно перевести эти эллемееты в конец массива
// таким образом первыке или все элеэлементы должны быть отличны от заданного а последние равны еск
import java.util.Arrays;
/*
public class seminar3zadacha {
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 3};
        int val = 3;
        System.out.println(Arrays.toString(sort(nums, val)));
    }

    public static int[] sort(int[] mas, int val) {
        int countRev = 0;
        int[] masSorted = new int[mas.length];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != val) {
                masSorted[countRev] = mas[i];
                countRev++;
            }
        }

        for (int i = 0; i < masSorted.length - countRev; i++) {
            masSorted[i + countRev] = val;
        }

        return masSorted;
    }
}
*/
public class seminar3zadacha {
    public static void main(String[] args) 
    {
        int [] nums= {3,2,5,3};
        int val=3;
        System.out.println(Arrays.toString(sort(nums,val)));
    }
    //no usages 
    public static int[] sort (int[] mas, int val){
    int temp=0, count=0, countRev=1;
    int [] masSorted=new int [mas.length];

    for (int i=0; i<mas.length;i++){
            if (mas[i]!=val)
            {
                //masSorted[mas.length-countRev]=val;
                masSorted[countRev]=mas[i];
                countRev++;
            } 
            else {
                masSorted[count]=mas[i];
                count ++;
            }
        }
        return masSorted;
        
    }
}
