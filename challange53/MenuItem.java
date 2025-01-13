package challange53;

public class MenuItem {
    private final String name;
    private final double prize;
    public MenuItem(String name,double prize){
        this.name=name;
        this.prize=prize;
    }
    public String getName(){
        return name;
    }
    public double getPrize(){
        return prize;
    }

    public void DisplayMenuItem() {
        System.out.println("Item : "+name);
        System.out.println("Prize : "+prize);
    }
}

 class Table {
    private int tableNo;
    private boolean isOccupied;
    public Table(int tableNo){
        this.tableNo=tableNo;
        this.isOccupied=false;
    }

    public int getTableNo() {
        return tableNo;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean setOccupied(boolean isOccupied){
        return this.isOccupied=isOccupied;
    }

   public void displayTableDetails(){
       System.out.println("Table No : "+tableNo);
       System.out.println("is Occupied : "+isOccupied);
   }
}
abstract class Staff{
    private String name;
    private  int id;
    Staff(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public  int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Name : "+name+"\nid : "+id;
    }
    abstract void performDuty();
}
class Waiter extends Staff{
    public Waiter(String name,int id){
        super(name,id);
    }
    @Override
    void performDuty() {
        System.out.println(getName()+"is taking order and servingFood");
    }
    public void takeOrder(Table table,MenuItem menuItem){
        if (table.isOccupied()){
            System.out.println("Order Taken "+menuItem.getName()+" For table "+table.getTableNo());
        }else {
            System.out.println("Table "+table.getTableNo()+" is not occupied.");
        }
    }
}
class Manager extends Staff{
    Manager(String name,int id){
        super(name,id);
    }

    @Override
    void performDuty() {
        System.out.println("Managing Staff and ensuring smooth operation.");
    }
    public void assignTable(Table table){
        if (!table.isOccupied()){
            table.setOccupied(true);
            System.out.println("Table " + table.getTableNo() + " assigned successfully.");
        }else {
            System.out.println("Table " + table.getTableNo() + " is already occupied.");
        }
    }
    public void freeTable(Table table){
        if (table.isOccupied()){
            table.setOccupied(false);
            System.out.println("Table " + table.getTableNo()+ " is now free.");
        }else {
            System.out.println("Table " + table.getTableNo() + " is already free.");
        }
    }
}

