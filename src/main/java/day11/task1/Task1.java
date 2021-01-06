package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();

        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        Picker picker3 = new Picker(warehouse2);
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println("было собрано " + picker1.getCount() + " зарплата при этом составила " + picker1.getSalary());
        System.out.println("было доставлено " + courier1.getCount() + " зарплата при этом составила " + courier1.getSalary());

        picker2.doWork();
        courier2.doWork();
        System.out.println("было собрано " + picker2.getCount() + " зарплата при этом составила " + picker2.getSalary());
        System.out.println("было доставлено " + courier2.getCount() + " зарплата при этом составила " + courier2.getSalary());
        picker1.doWork();
        picker3.doWork();
        picker3.doWork();
        picker1.doWork();

        System.out.println("было собрано " + picker1.getCount() + " зарплата при этом составила " + picker1.getSalary());
        System.out.println("было доставлено " + courier1.getCount() + " зарплата при этом составила " + courier1.getSalary());

        System.out.println(warehouse1.toString());
        System.out.println(warehouse2.toString());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
