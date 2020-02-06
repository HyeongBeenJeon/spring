package springMybatis0204.Dto;

public class Department {
	private int id;
	private String deptName;
	private String deptLoc;
	
	public Department() {
	}

	public Department(int id, String deptName, String deptLoc) {
		this.id = id;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}
}