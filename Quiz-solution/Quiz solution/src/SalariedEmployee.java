import java.time.LocalDate;
public class SalariedEmployee extends Employee{
    private int salary;

    public SalariedEmployee(String name, String SSN, LocalDate DoB, LocalDate StartDay, int salary){
        super(name, SSN, StartDay, DoB);
        this.salary = salary;
    }

    @Override
    public int getPayment(){
        double payment = this.salary*Math.pow(1.1, getWorkingYear()/3);
        this.salary = (int)payment;
        return super.getPayment() + this.salary;
    }
    
}
