import java.time.*;
public abstract class Employee implements Payable {
    private String name;
    private String SSN;
    private LocalDate DoB;
    private LocalDate StartDay;
    private static final int bonus = 100;

    public Employee(String name, String SSN, LocalDate StartDay, LocalDate DoB){
        this.DoB = DoB;
        this.SSN = SSN;
        this.name = name;
        this.StartDay = StartDay;
    }

    @Override
    public int getPayment(){
        if (LocalDate.now().getMonth() == DoB.getMonth()) {
            return bonus;
        }
        else{
            return 0;
        }
    }

    public int getWorkingYear() {
        return Period.between(this.StartDay, LocalDate.now()).getYears();
    }

    @Override
    public String toString(){
        return "Employee{ " + "EmployeeName: " + name + '\'' + ",\nEmployeeSSN: " + SSN + '\'' + ",\nEmployee DoB: "
        + DoB + '\'' + ",\nEmployee StartDay: " + StartDay + '\'' + ",\nWorking year: " + this.getWorkingYear() + '\'' + ",\nPayment: " + getPayment() + "}";
    }
}
