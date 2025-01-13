package challange53;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Pasta", 12.99);
        MenuItem item2 = new MenuItem("Pizza", 15.49);

        // Create tables
        Table table1 = new Table(1);
        Table table2 = new Table(2);

        // Create staff
        Manager manager = new Manager("Alice", 101);
        Waiter waiter = new Waiter("Bob", 102);

        // Manager assigns a table
        System.out.println("\nManager Assigning Tables:");
        manager.assignTable(table1);
        manager.assignTable(table2);

        // Waiter takes an order
        System.out.println("\nWaiter Taking Orders:");
        waiter.takeOrder(table1, item1);
        waiter.takeOrder(table2, item2);

        // Manager frees a table
        System.out.println("\nManager Freeing Tables:");
        manager.freeTable(table1);
        manager.freeTable(table2);

        // Display final table status
        System.out.println("\nFinal Table Status:");
        System.out.println(table1.isOccupied());
        System.out.println(table2.isOccupied());

    }
}
