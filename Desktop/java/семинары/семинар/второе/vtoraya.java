public class vtoraya { 
    
    // Статический класс CSVGenerator
    static class CSVGenerator { 
        public static String generateCSV(String[] headers, String[][] data) { 
            StringBuilder csv = new StringBuilder(); 
            // Добавление заголовков
            csv.append(String.join(",", headers)).append("\n"); 
            // Добавление данных
            for (String[] row : data) { 
                csv.append(String.join(",", row)).append("\n"); 
            }
            return csv.toString().trim(); // Удаляем последнюю новую строку
        } 
    }

    // Класс Printer для вывода результата
    public static class Printer { 
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
                // Для примера предположим, что args содержат CSV-строки
                headers = args[0].split(",");
                data = new String[args.length - 1][headers.length];
                for (int i = 1; i < args.length; i++) {
                    data[i - 1] = args[i].split(",");
                }
            }

            // Генерация CSV строки с использованием класса CSVGenerator
            String csvOutput = CSVGenerator.generateCSV(headers, data);
            // Вывод результата
            System.out.println(csvOutput);
        } 
    }
}