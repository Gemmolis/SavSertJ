public class Сertification {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+7(915)3251120", "Собакевич");
        phoneBook.add("+7(985)7251189", "Чичиков  ");
        phoneBook.add("+7(985)1258123", "Коробочка");
        phoneBook.add("+7(495)2510064", "Собакевич");
        phoneBook.add("+7(913)0246128", "Коробочка");
        phoneBook.add("+7(917)1259127", "Собакевич");
        phoneBook.add("+7(987)3251215", "Ноздрев  ");
        phoneBook.add("+7(916)5249127", "Ноздрев  ");
        phoneBook.add("+7(495)5259889", "Манилов  ");

        phoneBook.printByDecreasingNumberOfPersonalPhones();
    }

}
