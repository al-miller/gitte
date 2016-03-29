import java.util.List;

/**
 * Created by almiller on 3/17/2016.
 */
public class Employee extends Person {


    private Double salary = 0.0;

    Employee(String name, Integer age, Double salary){
        super(name,age);
        this.salary = salary;
    }

    public double printAllEmployeesInfo() throws Exception {
        List<Employee> people = getServiceDL().getCoWorkers(name);
        Double sum = 0D;
        for (Employee p: people){
            sum += p.getSalary();
            p.showInfo();
        }

        if (sum > 20) {
            throw new Exception("Expensive");
        }
        return sum;

    }


    public void showInfo(){
        System.out.println("Employee: \n" + getName() + " " + getAge() + " " + getSalary()+"\n");
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
