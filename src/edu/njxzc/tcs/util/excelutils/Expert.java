package edu.njxzc.tcs.util.excelutils;

public class Expert {

	private Integer id;
	private String year;
	private String name;
	private String company;
	private String work;
	private String method;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	@Override
	public String toString() {
		return "Expert [id=" + id + ", year=" + year + ", name=" + name
				+ ", company=" + company + ", work=" + work + ", method="
				+ method + "]";
	}
	
	
}

