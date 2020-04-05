public class EmployeeTest {
    public static void main(String [] args) {
        Date hire = new Date(6, 21, 2019);
        Date birth = new Date(10, 14, 2000);

        Employee employee = new Employee("Ali", "Khan", hire, birth);
        System.out.println(employee);


    }
}
