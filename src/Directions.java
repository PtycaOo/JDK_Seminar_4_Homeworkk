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

    public List<Employee> searchEmpToEx(int ex){
        List<Employee> newList = new ArrayList<>();
        for (Employee employee: list){
            if(employee.ex() >= ex){
                newList.add(employee);
            }
        }
        System.out.printf("Сотрудники со стажем более %d: \n",ex);
        return newList;
    }

    public List<String> searchNumberByName(String name){
        List<String> newList = new ArrayList<>();
        for (Employee employee: list){
            if(employee.name().equals(name)){
                newList.add(employee.secondName());
                newList.add(employee.phoneNumber());
            }
        }
        System.out.printf("Номера телефона :");
        return newList;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee:  list){
            sb.append(employee.toString());
        }
        return sb.toString();
    }
}
