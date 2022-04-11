package collectionsPkg.list;

public class Employee implements Comparable<Employee>{

    private Integer empId;
    private String empName;

    private Department department;

    public Employee(Integer empId) {
        this.empId = empId;
    }

    public Employee(Integer empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Employee(Integer empId, String empName, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

/*

    @Override
    public int compareTo(Employee emp) {

        if(empId<emp.getEmpId()){
            return -1;
        }else if(empId>emp.getEmpId()){
            return 1;
        }

        return 0;
    }
*/



    @Override
    public int compareTo(Employee emp) {

       /* if(empId<emp.getEmpId()){
            return 1;
        }else if(empId>emp.getEmpId()){
            return -1;
        }

        return 0;*/

        return empId.compareTo(emp.getEmpId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department=" + department +
                '}';
    }
}
