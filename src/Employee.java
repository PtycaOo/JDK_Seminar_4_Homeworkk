import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final int id;
    private final String name;
    private final String secondName;
    private final String phoneNumber;
    private final int ex;

    public Employee(int id, String name, String secondName, String phoneNumber, int ex) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.ex = ex;
    }

    public String secondName() {
        return secondName;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public int id() {
        return id;
    }


    public String name() {
        return name;
    }

    public int ex() {
        return ex;
    }

    @Override
    public String toString() {
        return id + " " + name + " " +
                " " + secondName +
                " " + phoneNumber + " " + ex + "\n";
    }
}
