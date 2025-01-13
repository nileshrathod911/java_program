package challenge45;

public class company {
    private String name;
    private int age;
    private int salary;

    @Override
    public String toString() {
      return "Name : "+name+
              "\nAge : "+age+
              "\nSalary : "+salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }

}
