package session2;

public class Student {
     
	private int stuId;
	private String stuName;
	private String mobileNo;
	private String email;
	
	public Student(int stuId, String stuName, String mobileNo, String email) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
}
