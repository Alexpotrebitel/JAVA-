//дан массив двоичных чисел
// вывести макаимальное число подряд идущих 1
public class seminarprodolgenie
{
    public static void main(String[] args) {
        int [] mas={1,1,0,1,1,1};
        int maxCount=0;
        int count=0;
        for (int i=0; i<mas.length;i++){
            if (mas[i]==1){
                count++;
                if (maxCount<count){
                    maxCount=count;
                
                }

                         
            } else{
                count=0;
            }
        }    
        
        System.out.println("количество максимальных 1: " + maxCount);
    }
}
