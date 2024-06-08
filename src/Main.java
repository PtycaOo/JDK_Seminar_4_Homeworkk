public class Main {
    public static void main(String[] args) {
        Directions directions = new Directions();

        directions.addEmployee("Никита","Чайка","89992476856",10);
        directions.addEmployee("Иван","Иванов","89995554444",8);
        directions.addEmployee("Никита","Васечкин","89993335431",15);
        directions.addEmployee("Петр","Петров","89993322543",2);
        directions.addEmployee("Гоша","Друзь","89215557891",5);

        System.out.println(directions.getAllEmployee());
        System.out.println(directions.searchEmpToEx(8));
        System.out.println(directions.searchNumberByName("Никита"));
        System.out.println(directions.searchEmpToID(4));



    }
}
