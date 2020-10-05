package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse + " " + picker + " " + courier);

        picker.doWork();
        courier.doWork();
        System.out.println(warehouse + " " + picker + " " + courier);

        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + " " + picker + " " + courier);

        System.out.println();
        for (int i = 1; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        picker.bonus();
        System.out.println("Зарплата и бонус после 1500 заказов: " + warehouse + " " + picker + " " + courier);

        System.out.println();
        for (int i = 1; i <= 1_000_000; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println("Зарплата и бонус после 1_000_000 заказов: " + warehouse + " " + picker + " " + courier);
    }
}

