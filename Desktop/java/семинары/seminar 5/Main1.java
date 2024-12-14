public class Main1 {
    /*
    Создать структуру для хранения номеров паспортов сотрудников организации.
    123456 Иванов
    321456 Васильев
    234561 Петров
    234432 Иванов
    654321 Петрова
    345678 Иванов
    Вывести данные по сотрудникам с фамилией Иванов.
     */
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петров");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");

        
        System.out.println(passports.findByName("Иванов"));
        //System.out.println(passports.getFullInfo());
        System.out.println(passports.remove("123456"));
    }
}