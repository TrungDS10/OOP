import java.time.LocalDate;
public class HourlyEmployee extends Employee {
    private int hourlyRate;
    private int monthlyHour;

    public HourlyEmployee(String name, String SSN, LocalDate DoB, LocalDate StartDay, int hourlyRate, int monthlyHour){
        super(name, SSN, StartDay, DoB);
        this.hourlyRate = hourlyRate;
        this.monthlyHour = monthlyHour;
    }

    @Override
    public int getPayment(){
        double payment = this.hourlyRate*Math.pow(1.1, getWorkingYear()/3);
        this.hourlyRate = (int)payment;
        return super.getPayment() + this.hourlyRate*this.monthlyHour;
    }
}
