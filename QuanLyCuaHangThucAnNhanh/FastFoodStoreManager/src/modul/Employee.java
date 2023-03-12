package modul;

public abstract class Employee implements Observer {
	protected Person person;
	protected String academicLevel;

	public String getAcademicLevel() {
		return academicLevel;
	}

	public void setAcademicLevel(String academicLevel) {
		this.academicLevel = academicLevel;
	}

}
