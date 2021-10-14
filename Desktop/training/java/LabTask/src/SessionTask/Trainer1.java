package SessionTask;

import java.io.Serializable;
import java.util.Date;

public class Trainer1 implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private int eid;
	private String name;
	private float esalary;
	private int dno;
	
	public Trainer1() {}

	public Trainer1(int eid, String name, float esalary, int dno) {
		super();
		this.eid = eid;
		this.name = name;
		this.esalary = esalary;
		this.dno = dno;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
