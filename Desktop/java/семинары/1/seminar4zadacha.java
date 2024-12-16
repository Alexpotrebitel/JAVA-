public class seminar4zadacha {  
    public static void main(String[] args) {
        /*Во фразе "добро пожаловать на курс по java" переставить слова в обратной последовательности*/
        String s="добро пожаловать на курс по java";
        String [] words=s.split(" ");
            for (int i=words.length-1; i>=0;i--){
                System.out.print(words[i]+" ");

            }

    }    
}
