import java.util.*;
public class Project {
    private String projectId;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployee = new ArrayList<>();
    public Project(String projectId, Date startDate, Date endDate, ArrayList<Employee> listOfEmployees){
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployee = listOfEmployees;
    }
    public void setProjectId(String projectId){
        this.projectId = projectId;
    }
    public String getProjectId(){
        return projectId;
    }
    public void setStartDay(Date startDate){
        this.startDate = startDate;
    }
    public Date getStartDate(){
        return startDate;
    }
    public void setEndDay(Date endDate){
        this.endDate = endDate;
    }
    public Date getEndDate(){
        return endDate;
    }
    public void setListOfEmployee(ArrayList<Employee> listOfEmployees){
        this.listOfEmployee = listOfEmployees;
    }
    public ArrayList<Employee> getListOfEmployee(){
        return listOfEmployee;
    }
    @Override
    public String toString(){
        listOfEmployee.sort(null);
        String listOfEmployees = "";
        for(Employee e: listOfEmployee){
            listOfEmployees += e.getEmployeeName() + "\n";
        }
        return listOfEmployees;
    }
    public int estimateBudget(){
        int budget = 0;
        for(Employee e: listOfEmployee){
            budget += (startDate.getTime() - endDate.getTime())*e.getSalary()/(24*60*60*1000);
        }
        return budget;
    }
}
