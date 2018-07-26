package info.inetsolv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Employee {
	@Id
	@Column(name="eno")
	private Integer eid;
	@Column(name="ename")
	private String ename;
	@Column(name="salary")
	private Double salary;
	
	public Employee(Integer eid, String ename, Double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}