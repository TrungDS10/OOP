import java.time.LocalDate;

public class TestEmployee {
    private static final int SIZE = 5;
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[SIZE];
        employeeList[0] = new SalariedEmployee("Trung", "CCCD-01", LocalDate.of(1997,10,5),LocalDate.of(2020,2,1),500);
        employeeList[1] = new CommissionEmployee("Ben Solo", "CCCD-02", LocalDate.of(1985,3,1),LocalDate.of(2017,12,1),3,100);
        employeeList[2] = new BasePlusCommissionEmployee("Cloney", "CCCD-03", LocalDate.of(1982,3,1),LocalDate.of(2017,2,1),2,100,200);
        employeeList[3] = new HourlyEmployee("Ace", "CCCD-04", LocalDate.of(1989,1,1),LocalDate.of(2020, 12, 24),3,180);
        employeeList[4] = new BasePlusCommissionEmployee("Itachi", "CCCD-05",LocalDate.of(2000, 1, 12), LocalDate.of(2019, 12, 25), 4, 100, 300);
        for(Employee e: employeeList){
            System.out.println(e + "\n");
        }
    }    
}
