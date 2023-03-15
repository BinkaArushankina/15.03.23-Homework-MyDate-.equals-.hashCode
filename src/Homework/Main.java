package Homework;

public class Main {
    public static void main(String[] args) {
        //Создать класс MyDate с полями day,month,year, конструктором,геттерами и сеттерами.
        //Создать несколько одинаковых обьектов этого класса и проверить их на равенство.
        //Затем переопределить методы equals и hashCode и вновь проверить обьекты на равенство.

        MyDate laptop = new MyDate("Monday","Mai",2023);
        MyDate tablet = new MyDate("Monday","Mai",2023);
        System.out.println(laptop.equals(tablet));  //false
        System.out.println("with method .equals and .hashCode "+laptop.equals(tablet));  //true



    }
}
