package entities;

import java.util.Objects;

public class Course {
	private String nameCourse;
	private Integer idStudent;
	
	public Course(String nameCourse, Integer idStudent) {
		this.nameCourse = nameCourse;
		this.idStudent = idStudent;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idStudent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(idStudent, other.idStudent);
	}
	
	
}
