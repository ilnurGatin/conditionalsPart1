public class Main {
    public static void main(String[] args) {
        // Задача №1
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Совершеннолетие еще не наступило, нужно еще немного подождать.");
        }

        // Задача №2
        age = 7;
        if (age >= 24) {
            System.out.println("Вы окончили университете. Пора искать первую работу!");
        } else if (age >= 18) {
            System.out.println("Вы уже окончили школу и можете поступать в университет!");
        } else if (age >= 7) {
            System.out.println("Ребенок ходит в школу!");
        }

        //Задача №3
        int sitPlace = 50;
        int stayPlace = 42;
        int carriageCapacity = sitPlace + stayPlace;
        if (carriageCapacity >= 102) {
            System.out.println("Вагон полностью забит!");
        } else {
            System.out.println("В вагоне есть места!");
        }
        if (sitPlace < 60) {
            System.out.println("Есть сидячие места!");
        }
        if (stayPlace < 42) {
            System.out.println("Есть стоячие места!");
        }

        // ДЗ-3. Задание 1
        age = 2;
        if (age >=2 && age <= 6) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить в детский сад");
        } else if (age >=7 && age < 18) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить в школу");
        } else if (age >=18 && age < 24) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить в университет");
        } else if (age >=24) {
            System.out.println("Если возраст человека " + age + ", то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека " + age + ", то ему нужно сперва научиться ходить");
        }

        //ДЗ-3. Задание 2
        age = 4;
        if (age >= 5 && age < 14) {
            System.out.println("Можно катаься только в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Можно кататься без сопровождения взрослого");
        } else {
            System.out.println("Кататься нельзя");
        }

        //ДЗ-3. Задание 3
        int one = 5;
        int two = 7;
        int free = 1;
        if (one > two && one > free) {
            System.out.println("Число " + one + " большее");
        } else if (two > one && two > free) {
            System.out.println("Число " + two + " большее");
        } else {
            System.out.println("Число " + free + " большее");
        }

    }
}