/*реализовать функцию возведения числа a в степень b. a,b из Z. Сводя количество выполняемых действий к минимуму пример а=3,b=2 ответ9*/
public class seminar5zadacha {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        System.out.println(pow(a,b));
    }
    static double pow(double a, int b){
        if (b==0 || a==1){
            return 1;
        }
        double res=a;
        if (b<0){
            res=1.0/a;
            a=res;
            b=-b;
        }
        for (int i=1; i<b; i++){
            res*=a;
        }
        return res;
    }
}
