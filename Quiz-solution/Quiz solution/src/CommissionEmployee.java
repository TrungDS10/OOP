import java.time.LocalDate;
public class CommissionEmployee extends Employee{
    private int commission;
    private int totalSale;

    public CommissionEmployee(String name, String SSN, LocalDate DoB, LocalDate StartDay, int commission, int totalSale){
        super(name, SSN, StartDay, DoB);
        this.commission = commission;
        this.totalSale = totalSale;
    }
    @Override
    public int getPayment(){
        return super.getPayment() + this.commission*totalSale;
    }
}
