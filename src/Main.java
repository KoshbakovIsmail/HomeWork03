import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public static void test1() {
        System.out.println("                Задание №1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая у вас операционная система? Напишите iOS или Android:");
        String clientOper = scanner.nextLine();
        String iosOper = "iOS";
        String androidOper = "Android";

        if (clientOper.equals(iosOper)) {
            System.out.println("Установите версию приложения для iOS по ссылке: https://iOS.com");
        } else if (clientOper.equals(androidOper)) {
            System.out.println("Установите версию приложения для Android по ссылке: https://Android.com");
        } else {
            System.out.println("Ошибка! Введите значение операционного системы как на примере ");
        }
    }

    public static void test2() {
        System.out.println("                Задание №2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год и вашу операционную систему (на примере 2016+iOS или Android : ");
        String clientString = scanner.nextLine();
        String iosOper = "iOS";
        String androidOper = "Android";
        String message = "";
        int splitIndex = 0;

        for (int i = 0; i < clientString.length(); i++) {
            if (!Character.isDigit(clientString.charAt(i))) {
                splitIndex = i;
                break;
            }
        }

        String operApparatus = clientString.substring(splitIndex);
        int yaerApparatus = Integer.parseInt(clientString.substring(0, splitIndex));

        if (operApparatus.equals(iosOper)) {
            if (yaerApparatus <= 2015) {
                message = "Установите облегченную версию для iOS по ссылке:  https://iOSmini.com";
            } else if (yaerApparatus >= 2016) {
                message = "Установите версию для iOS по ссылке:  https://iOS.com";
            }
        } else if (operApparatus.equals(androidOper)) {
            if (yaerApparatus <= 2015) {
                message = "Установите облегченную версию для Android по ссылке: https://miniAndroid.com";
            } else if (yaerApparatus >= 2016) {
                message = "Установите  версию для Android по ссылке: https://Android.com";
            }
        }
        if (!message.isEmpty()) {
            System.out.println(message);
        } else {
            System.out.println("Ошибка! Введите в правельном формате и слитно как в примере");
        }
    }

    public static void test3() {
        System.out.println("                Задание №3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой год начиная с 1582 года: ");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void test4() {
        System.out.println("                Задание №4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние от нас до точки доставки в км: ");
        int deliveryDistance = scanner.nextInt();
        int day = 1;

        if (deliveryDistance <= 20) {
            System.out.println("На расстояние - " + deliveryDistance + "км Доставка займет " + day + " день");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            System.out.println("На расстояние - " + deliveryDistance + "км Доставка займет " + (++day) + " деня");
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            System.out.println("На расстояние - " + deliveryDistance + "км Доставка займет " + (day += 2) + " деня");
        } else {
            System.out.println("На расстояние с выше 100 км доставки нет");
        }
    }

    public static void test5() {
        System.out.println("                Задание №5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца из 12 месяцов ( на примере 1 или 5 ): ");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц 1-й Январь относится к зиммнему сезону");
                break;
            case 2:
                System.out.println("Месяц 2-й Февраль относится к зиммнему сезону");
                break;
            case 3:
                System.out.println("Месяц 3-й Март относится к весеннему сезону");
                break;
            case 4:
                System.out.println("Месяц 4-й Апрель относится к весеннему сезону");
                break;
            case 5:
                System.out.println("Месяц 5-й Май относится к весеннему сезону ");
            case 6:
                System.out.println("Месяц 6-й Июнь относится к летниму сезону");
                break;
            case 7:
                System.out.println("Месяц 7-й Июль относится к летниму сезону");
                break;
            case 8:
                System.out.println("Месяц 8-й Август относится к летниму сезону");
                break;
            case 9:
                System.out.println("Месяц 9-й Сентябрь относится к осеннему сезону");
                break;
            case 10:
                System.out.println("Месяц 10-й Октябрь относится к осеннему сезону");
                break;
            case 11:
                System.out.println("Месяц 11-й Ноябрь относится к осеннему сезону");
                break;
            case 12:
                System.out.println("Месяц 12-й Декабрь относится к зиммнему сезону");
                break;
            default:
                System.out.println("Ошибка! Введите только цыфры от 1 до 12 ");
        }
    }
}