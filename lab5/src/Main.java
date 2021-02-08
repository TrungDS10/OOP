import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Employee A = new Employee("1", "A", 20, 0, 0);
        Employee B = new Employee("2", "B", 20, 10, 10);
        Employee C = new Employee("3", "C", 10, 20, 20);
        Employee D = new Employee("4", "D", 100, 0, 0);

        ArrayList<Employee> employee1 = new ArrayList<>(Arrays.asList(A, B, C));
        ArrayList<Employee> employee2 = new ArrayList<>(Arrays.asList(A, C, D));

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2000, Calendar.JANUARY, 1);
        Date date1 = calendar1.getTime();

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2000, Calendar.FEBRUARY, 28);
        Date date2 = calendar2.getTime();

        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(2000, Calendar.NOVEMBER, 1);
        Date date3 = calendar3.getTime();

        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(2000, Calendar.DECEMBER, 31);
        Date date4 = calendar4.getTime();

        Project project1 = new Project("1", date1, date2, employee1);
        Project project2 = new Project("2", date3, date4, employee2);

        new ProjectPrinter(project1).run();
        new ProjectPrinter(project2).run();
    }
}
