// дано четное число N (>0) и символы с1 и с2
// написать метод который вернет метод длинной N с чередующимися с1 и с2 начиная с с1
// присмер С1с2с1

public class pervaya {
    public static void main(String[] args) {
        System.out.println(nCount( 7,  'a', 'b'));
    }
    static String nCount(int n, char c1, char c2)
    {
        StringBuilder sb= new StringBuilder();
        for (int i=0;i<n/2;i++){
            sb.append(c1);
            sb.append(c2);

        }
        return sb.toString();
    } 
    
}
