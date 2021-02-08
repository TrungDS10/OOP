public class Employee implements Comparable<Employee> {
    private String employeeId;
    private String employeeName;
    private int salaryPerhour;
    private int noOfLeavingDay;
    private int noOfTravelDay;
    public Employee(String employeeId, String employeeName, int salaryPerhour, int noOfLeavingDay, int noOfTravelDay){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerhour = salaryPerhour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setSalary(int salaryPerhour){
        this.salaryPerhour = salaryPerhour;
    }
    public int getSalary(){
        return salaryPerhour;
    }
    public void setDayLeaving(int noOfLeavingDay){
        this.noOfLeavingDay = noOfLeavingDay;
    }
    public int getDayLeaving(){
        return noOfLeavingDay;
    }
    public void setDayTravel(int noOfTravelDay){
        this.noOfTravelDay = noOfTravelDay;
    }
    public int getDayTravel(){
        return noOfTravelDay;
    }
    public int calculateWeekySalary(){
        return salaryPerhour*8*(5 - noOfLeavingDay + noOfTravelDay/2);
    }
    @Override
    public String toString(){
        return "Name: " + employeeName + "- Salary Per Hour: " + salaryPerhour + "- Weekly Salary: " + calculateWeekySalary();
    }
    @Override
    public int compareTo(Employee e){
        if (this.noOfTravelDay > e.noOfTravelDay) {
            return 1;
        }
        if (this.noOfTravelDay < e.noOfTravelDay) {
            return 0;
        }
        if(this.noOfLeavingDay > e.noOfLeavingDay){
            return -1;
        }
        return 0;
    }
}
