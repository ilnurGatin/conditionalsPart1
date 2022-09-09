public class Main {
    public static void main(String[] args) {
        // Задача №1
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Совершеннолетие еще не наступило, нужно еще немного подождать.");
        }
        // Задача №2
        age = 65;
        if (age >= 24) {
            System.out.println("Вы окончили университете. Пора искать первую работу!");
        }
        age = 18;
        if (age >= 18) {
            System.out.println("Вы уже окончили школу и можете поступать в университет");
        }
        age = 6;
        if (age >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        //Задание №3

        int sitPlace = 60;
        int stayPlace = 42;
        int carriageCapacity = sitPlace + stayPlace;
        if (sitPlace < 60) {
            System.out.println("Есть сидячие места!");
        }
        if (stayPlace < 42) {
            System.out.println("Есть стоячие места!");
        }
        if (carriageCapacity >= 102) {
            System.out.println("Вагон полностью забит!");
        }
        // ДЗ2. Задание 1







    }
}