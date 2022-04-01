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
        int year = 100;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This year is leap");
        } else {
            System.out.println("This is not leap year");
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
        byte monthNumber = 9;

        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Zima");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Vesna");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Leto");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Osen");
                break;
            case 12:
                System.out.println("Zima");
                break;
            default:
                System.out.println("Takogo mesyaza net");
        }


    }
}
