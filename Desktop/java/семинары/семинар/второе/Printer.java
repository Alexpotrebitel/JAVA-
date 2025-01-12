public class vtoraya {
    class CSVGenerator 
    {
        public static String generateCSV(String[] headers, String[][] data)
        {
            StringBuilder csv = new StringBuilder();
            // Добавление заголовков
            csv.append(String.join(",", headers)).append("\n");
            // Добавление данных
            for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
            }
            return csv.toString().trim(); // Удалить последнюю новую строку
            }
            }
            
        }
        
        // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
        public class Printer {
        public static void main(String[] args) {
        String[] headers = {};
        String[][] data = {};
        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        headers = new String[]{"Name", "Age", "City"};
        data = new String[][] {
        {"John", "30", "New York"},
        {"Alice", "25", "Los Angeles"},
        {"Bob", "35", "Chicago"}
        };
        } else {
        // Преобразование строковых параметров в массивы
        // Пример обработки данных можно дополнить в зависимости от формата args
        }
        CSVGenerator ans = new CSVGenerator();
        System.out.println(ans.generateCSV(headers, data));
        }
    }
        
           

