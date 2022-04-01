public class Department {

    private int deptId;
    private String departmentName;

    public Department(int deptId, String departmentName) {
        this.deptId = deptId;
        this.departmentName = departmentName;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
