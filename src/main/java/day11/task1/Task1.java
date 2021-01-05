package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();

        Picker picker1 = new Picker(warehouse1, 0, false);
        Courier courier1 = new Courier(warehouse1, 0, false);
        Picker picker2 = new Picker(warehouse2, 0, false);
        Courier courier2 = new Courier(warehouse2, 0, false);

        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println("было собрано " + picker1.getCount() + " зарплата при этом составила " + picker1.getSalary());
        System.out.println("было доставлено " + courier1.getCount() + " зарплата при этом составила " + courier1.getSalary());

        picker2.doWork();
        courier2.doWork();
        System.out.println("было собрано " + picker2.getCount() + " зарплата при этом составила " + picker2.getSalary());
        System.out.println("было доставлено " + courier2.getCount() + " зарплата при этом составила " + courier2.getSalary());


    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
