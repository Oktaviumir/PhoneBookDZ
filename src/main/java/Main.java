public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        // Test records
        phoneBook.addRecord("Petrov", 9186565654L);
        phoneBook.addRecord("Sidorov", 9535169541L);
        phoneBook.addRecord("Sidorov", 9625696312L);
        phoneBook.addRecord("Petrov", 9002588526L);
        phoneBook.addRecord("Sidorov", 9649873521L);
        phoneBook.addRecord("Petrov", 9631593455L);
        phoneBook.addRecord("Popov", 9289994466L);
        phoneBook.addRecord("Sidorov", 9256969444L);
        phoneBook.addRecord("Petrov", 9185554466L);
        phoneBook.addRecord("Popov", 9003212121L);
        phoneBook.addRecord("Petrov", 9642586341L);
        // выводим отсортированный справочник
        System.out.println("Телефонная книга\n");
        phoneBook.PrintSortedPhoneBook();
        // Тестируем поиск по имени
        System.out.println("\nТестирование поиска\n");
        phoneBook.getNumber("Petrov");
        phoneBook.addRecord("Sidorov", 9539998885L);
        phoneBook.addRecord("Popov", 9184554422L);
        // После добавления записей, как новых, так и по существующим позициям, выводим справочник
        System.out.println("\nТестирование телефонной книги после добавления элементов");
        phoneBook.PrintSortedPhoneBook();
    }
}