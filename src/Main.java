public class Main {
    public static void main(String[] args) {
        //Задание 1.1
        System.out.println("Задание 1.1");
        int age = 19;
        if (age >= 18)
            System.out.println("Поздравляю с совершеннолетием");
        if (age < 18)
            System.out.println("Надо подождать");
        //Задание 1.2
        System.out.println("Задание 1.2");
        int person = 26;
          if (person >= 7)
          if (person < 18)
            System.out.println("Школа");
          if (person >= 18)
          if (person < 24)
            System.out.println("Университет");
          if (person >= 24)
            System.out.println("Пора работать");
        //Задание 1.3
        System.out.println("Задание 1.3");
        int position = 105;
        int capacity = 102;
        int sittingCapacity = 60;
        if (position <= sittingCapacity)
            System.out.println("Сидячие места");
        if (position > sittingCapacity)
        if (position <= capacity)
            System.out.println("Стоячие места");
        if (position > capacity)
            System.out.println("Мест нет");
        //Задание 2.1
        System.out.println("Задание 2.1");
        int man = 15;
        if (man >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Надо подрасти"); }
        //Задание 2.2
        System.out.println("Задание 2.2");
        int person1 = 30;
        if (person1 >= 7)
            if (person1 < 18) {
                System.out.println("Школа");}
        if (person1 >= 18)
            if (person1 < 24) {
                System.out.println("Университет");
            } else {
            System.out.println("Пора работать");}
        //Задание 2.3
        System.out.println("Задание 2.3");
        int position2 = 105;
        int capacity1 = 102;
        int sittingCapacity1 = 60;
        if (position2 <= sittingCapacity1) {
            System.out.println("Сидячие места"); }
        if (position2 > sittingCapacity1)
            if (position2 <= capacity1) {
                System.out.println("Стоячие места");
            } else {
                System.out.println("Мест нет"); }
        //Задание 3.1
        System.out.println("Задание 3.1");
        int agePerson = 28;
        boolean goToSchool = agePerson >= 7 && agePerson <= 18;
        boolean goToTheUniversity = agePerson > 18 && agePerson < 24;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + " ,то ему надо" +
                    "ходить в детский сад");
        }
        if ( goToSchool) {
            System.out.println("Если возраст человека равен " + agePerson + " ,то ему надо" +
                                        "ходить в школу");
        }
        if ( goToTheUniversity) {
            System.out.println("Если возраст человека равен " + agePerson + " ,то ему надо" +
                    "ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + " ,то ему надо" +
                    " работать");
        }
        //Задание 3.2
        System.out.println("Задание 3.2");
        int child = 15;
        boolean childNotCan = child < 5;
        boolean childCan = child >= 5 && child <= 14;
         if (childNotCan) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        if (childCan) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        }
        if ( child > 14) {
            System.out.println("Ребенок может кататься на аттракционе самостоятельно");
        }
        //Задание 3.3
        System.out.println("Задание 3.3");
        int one = 3;
        int two = 5;
        int three = 8;
        if ( one > two && one > three) {
            System.out.println("one = " + one);
        } else {
        if ( two > one && two > three) {
            System.out.println("two = " + two);
        } else {
            System.out.println("three = " + three);
        }}






        

    }
}