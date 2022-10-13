package package1;
public class Teacher extends Person {
    private int salary;
    private int salaryEarned=0;

    public Teacher(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return  salary;
    }

    public void receiveSalary(int salary){
        salaryEarned=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far :  $"
                + salaryEarned;
    }
}