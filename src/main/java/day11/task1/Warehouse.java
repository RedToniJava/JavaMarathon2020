package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void sumCountPickedOrders() {
        countPickedOrders++;
    }

    public void sumCountDeliveredOrders() {
        countDeliveredOrders++;
    }

    public String toString() {
        return getCountPickedOrders() + " " + getCountDeliveredOrders();
    }
}
