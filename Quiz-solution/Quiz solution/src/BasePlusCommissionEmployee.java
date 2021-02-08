import java.time.LocalDate;
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private int baseSalary;

    public BasePlusCommissionEmployee(String name, String SSN, LocalDate DoB, LocalDate StartDay, int commission, int totalSale, int baseSalary){
        super(name, SSN, DoB, StartDay, commission, totalSale);
        this.baseSalary = baseSalary;
    }
    @Override
    public int getPayment(){
        double payment = this.baseSalary*Math.pow(1.1, getWorkingYear()/3);
        this.baseSalary = (int)payment;
        return super.getPayment() + this.baseSalary;
    }
}
