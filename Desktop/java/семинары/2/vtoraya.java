/*напишите код который сжимает строку
Пример: вход aaaabbbcd.
Результат: а4b3cd2*/
public class vtoraya {
    public static void main(String[] args) {
        
    
    String s="aaaabbbcdd";
    System.out.println(work(s));
    } 

    static String work(String s){
        StringBuilder stringBuilder= new StringBuilder();
        int count =0;
        char cur=0;
        for (int i=0; i<s.length(); i++){
            char item=s.charAt(i);
            if (item==cur){
                count ++;
            } else {
                stringBuilder.append(cur);
                if (count>1){
                    stringBuilder.append(count);
                    count=1;
                }
                cur=item;
            }
        }
        stringBuilder.append(cur);
        if (count>1){
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }   
} 