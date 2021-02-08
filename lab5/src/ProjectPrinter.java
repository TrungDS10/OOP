import java.text.*;
import java.util.*;
public class ProjectPrinter implements Runnable{
    private Project project;
    public ProjectPrinter(Project project){
        this.project = project;
    }
    @Override
    public void run(){
        ArrayList<Employee> employees = project.getListOfEmployee();
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
        for(Employee e: employees){
            System.out.println(String.format("[Project ID: %s - Project Duration: %s to %s][Name: %s - Salary Per Hour: %s]",project.getProjectId(),
            simpleDate.format(project.getStartDate()), simpleDate.format(project.getEndDate()), e.getEmployeeName(), e.getSalary()));
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e1){
                e1.fillInStackTrace();
            }
        }
        System.out.println();
    }
}
