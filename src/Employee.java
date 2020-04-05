public class Employee {
    private String f_Name;
    private String l_Name;
    private Date hire_Date;
    private Date birth_Date;

    public Employee(String first, String last, Date hire, Date birth)
    {
        f_Name = first;
        l_Name = last;
        hire_Date = hire;
        birth_Date = birth;
    }

    public String toString()
    {
        return String.format("%s %s, Hired: %s Birthday: %s", f_Name, l_Name, hire_Date, birth_Date);
    }
}
