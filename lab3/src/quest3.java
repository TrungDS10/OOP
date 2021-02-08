// import java.util.*;
// import java.util.stream.Collectors;
// class Person{
//     protected String name;
//     protected String address;
//     public Person(String name, String address){
//         this.name = name;
//         this.address = address;
//     }
//     public Person(){

//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setAddress(String address){
//         this.address = address;
//     }
//     public String getAddress(){
//         return address;
//     }
//     public String toString(){
//         return "Person{" + "name: " + name + '\'' + ",address: " + address + '}';
//     }
// }
// class Student extends Person{
//     private String program;
//     private int year;
//     private double fee;
//     public Student(String name, String address, String program, int year, double fee){
//         super(name, address);
//         this.program = program;
//         this.fee = fee;
//         this.year = year;
//     }
//     public void setProgram(String program){
//         this.program = program;
//     }
//     public String getProgram(){
//         return program;
//     }
//     public void setYear(int year){
//         this.year = year;
//     }
//     public int getYear(){
//         return year;
//     }
//     public void setFee(double fee){
//         this.fee = fee;
//     }
//     public double getFee(){
//         return fee;
//     }
//     @Override
//     public String toString(){
//         return "Student{" + "name: " + name + '\'' + ",address: " + address + '\'' + ",program: " 
//         + program + '\'' + ",fee: " + fee + '\'' +  ",year: " + year + '}';
//     }
// }
// class Staff extends Person{
//     private String school;
//     private double pay;
//     public Staff(String name, String address, String school, double pay){
//         super(name, address);
//         this.school = school;
//         this.pay = pay;
//     }
//     public void setSchool(String school){
//         this.school = school;
//     }
//     public String getSchool(){
//         return school;
//     }
//     public void setPay(double pay){
//         this.pay = pay;
//     }
//     public double getPay(){
//         return pay;
//     }
//     @Override
//     public String toString(){
//         return "Staff{" + "name: " + name + '\'' + ",address: " + address + '\'' + ",school: " + school
//         + '\'' + ",pay: " + pay + '}';
//     }
// }
// class managePerson{
//     private List<Person> persons;
//     public managePerson(){
//         this.persons = new ArrayList<>();
//     }
//     public void addPerson(Person person){
//         this.persons.add(person);
//     }
//     public List<Person> searchPersonByName(String name){
//         return this.persons.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
//     }
//     public void showListInForPerson(){
//         this.persons.forEach(o -> System.out.println(o.toString()));
//     }
// }
// public class quest3 {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         managePerson mp = new managePerson();
//         while (true) {
//             System.out.println("Manage person application");
//             System.out.println("Enter 1 to insert person");
//             System.out.println("Enter 2 to search person");
//             System.out.println("Enter 3 to show list of person");
//             System.out.println("Enter 4 to exit");
//             String choose = sc.nextLine();
//             switch (choose) {
//                 case "1":
//                     System.out.println("Enter a to insert student or b to insert staff: ");
//                     String ch = sc.nextLine();
//                     switch (ch) {
//                         case "a":{
//                             System.out.println("Enter student name: ");
//                             String name = sc.nextLine();
//                             System.out.println("Enter student address: ");
//                             String address = sc.nextLine();
//                             System.out.println("Enter student program: ");
//                             String program = sc.nextLine();
//                             System.out.println("Enter student learning year: ");
//                             int year = sc.nextInt();
//                             System.out.println("Enter student fee: ");
//                             double fee = sc.nextDouble();
//                             Person student = new Student(name, address, program, year, fee);
//                             mp.addPerson(student);
//                             System.out.println(student.toString());
//                             break;
//                         }
//                         case "b":{
//                             System.out.println("Enter staff name: ");
//                             String name = sc.nextLine();
//                             System.out.println("Enter staff address: ");
//                             String address = sc.nextLine();
//                             System.out.println("Enter staff school: ");
//                             String school = sc.nextLine();
//                             System.out.println("Enter staff pay: ");
//                             double pay = sc.nextDouble();
//                             Person staff = new Staff(name, address, school, pay);
//                             mp.addPerson(staff);
//                             System.out.println(staff.toString());
//                             break;
//                         }
//                         default:
//                             System.out.println("Invalid");
//                             break;
//                     }
//                     break;
//                 case "2":{
//                     System.out.println("Enter name to search: ");
//                     String name = sc.nextLine();
//                     mp.searchPersonByName(name).forEach(person -> {System.out.println(person.toString());});
//                     break;
//                 }
//                 case "3":{
//                     mp.showListInForPerson();
//                     break;
//                 }
//                 case "4":{
//                     return;
//                 }
//                 default:
//                     continue;
//             }
//         }
//     }
// }
