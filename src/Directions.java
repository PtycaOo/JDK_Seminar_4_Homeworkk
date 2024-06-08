import java.util.ArrayList;
import java.util.List;

public class Directions {
    List<Employee> list;
    private int numberID = 1;


    public Directions(List<Employee> list) {
        this.list = list;
    }

    public Directions(){
        list = new ArrayList<>();
    }

    public void addEmployee(String name,String secondName, String phoneNumber, int ex){
        Employee employee = new Employee(numberID++,name,secondName,phoneNumber,ex);
        list.add(employee);
    }

    public String getAllEmployee(){
        StringBuilder sb = new StringBuilder();
        for (Employee employee: list) {
            sb.append(employee.toString());
        }
        return sb.toString();
    }

    public String searchEmpToEx(int ex){
        StringBuilder sb = new StringBuilder();
        for (Employee employee: list){
            if(employee.ex() >= ex){
                sb.append(employee);
            }
        }
        return sb.toString();
    }

    public String searchNumberByName(String name){
        StringBuilder sb = new StringBuilder();
        for (Employee employee: list){
            if(employee.name().equals(name)){
                sb.append(employee);
            }
        }
        return sb.toString();
    }

    public Employee searchEmpToID(int id){
        StringBuilder sb = new StringBuilder();
        for (Employee employee: list){
            if(employee.id() == id){
                return employee;
            }
        }
        return null;
    }
}
