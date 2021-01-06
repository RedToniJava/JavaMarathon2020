package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private int count;
    Warehouse warehouse = new Warehouse();

    public int getCount() {
        return count;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString() {
        return getSalary() + " " + getIsPayed();
    }

    @Override
    public void doWork() {
        salary += 100;
        count++;
        warehouse.sumCountDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (count >= 10000 && isPayed == true) {
            System.out.println("бонус уже был выплачен");
        }
        if (count >= 10000 && isPayed == false) {
            isPayed = true;
            salary += 50000;
        }
        if (count < 10000) {
            System.out.println("Бонус пока не доступен");
        }
    }
}
