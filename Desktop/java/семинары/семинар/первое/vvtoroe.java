public class vvtoroe {
    // Класс Answer теперь также статический
    static class Answer {
        // Статический метод
        public static void printEvenNums() {
            int n = 100; // Ограничение на 100
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) { // Проверка на четность
                    System.out.println(i);
                }
            }
        }
    }

    // Класс Printer для запуска программы
    public static void main(String[] args) {
        Answer.printEvenNums(); // Прямой вызов статического метода
    }
}