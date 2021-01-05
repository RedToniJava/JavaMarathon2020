package day11.task1;

public class Picker implements Worker {
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

    public Picker(Warehouse warehouse, int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;


    }

    public String toString() {
        return getSalary() + " " + getIsPayed();
    }

    public void doWork() {
        salary += 80;
        count++;
        warehouse.setCountPickedOrders(count);

    }

    @Override
    public void bonus() {
        if (count >= 10000 && isPayed == true) {
            System.out.println("бонус уже был выплачен");
        }
        if (count >= 10000 && isPayed == false) {
            isPayed = true;
            salary += 70000;
        }
        if (count < 10000) {
            System.out.println("Бонус пока не доступен");
        }


    }
}
