package collectionsPkg.list;

public class Department {

    private Integer deptId;
    private String  departmentName;

    public Department(Integer deptId, String department) {
        this.deptId = deptId;
        this.departmentName = department;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
