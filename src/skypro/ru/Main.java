package skypro.ru;

public class Main {

    public static void main(String[] args) {

        System.out.println("Homework:");
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Download program on IOS by link:....");
        } else if (clientOS == 1) {
            System.out.println("Download program on Android by link:...");
        }
        System.out.println("Task 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Download program on IOS by link:....");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Download program on Android by link:...");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Download simplified program on IOS by link:...");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Download simplified program on Android by link:...");
        }
        System.out.println("Task 3:");
        int year = 2022;
        if (year % 4 != 0 || year % 100 == 0) {
            System.out.println("This year is not leap");
        } else {
            System.out.println("This is a leap year");
        }
        System.out.println("Task 4:");
        int deliveryDistance = 70;
        int daysOfDelivery = 1;
        int daysOfDelivery2 = 2;
        if (deliveryDistance < 20) {
            System.out.println("Days of delivery: " + daysOfDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            daysOfDelivery2 = daysOfDelivery + 1;
            System.out.println("Days of delivery: " + daysOfDelivery2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            int daysOfDelivery3 = daysOfDelivery2 + 1;
            System.out.println("Days of delivery: " + daysOfDelivery3);
        }
        System.out.println("Task 5:");

    }
}
