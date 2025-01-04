public class tretya {
    class Answer { 
            public int sumDigits(int n) 
            { 
                // Введите свое решение ниже 
                int sum = 0; 
                while (n != 0) {  // Исправлено с n=!0 на n!=0
                    sum = n % 10 + sum;  // Суммируем цифры числа
                    n = n / 10;  // Убираем последнюю цифру
                } 
                return sum;  // Возвращаем сумму цифр
            } 
        } 
    
        // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки 
        public class Printer { 
            public static void main(String[] args) { 
                int n = 12; 
                if (args.length > 0) { 
                    n = Integer.parseInt(args[0]); 
                } 
                // Создаем объект для вычисления суммы цифр
                tretya tretya = new tretya();
                Answer answer = tretya.new Answer();
                
                // Выводим результат на экран
                System.out.println("Сумма цифр числа " + n + " равна: " + answer.sumDigits(n)); 
            } 
        } 
    }
    