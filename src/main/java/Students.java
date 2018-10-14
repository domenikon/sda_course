import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "students")
@NamedQueries({
		@NamedQuery(name = "get_students_by_name",
				query = "select s from Students s where name = :name")})
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "surename")
	private String surename;

	@Column(name = "dob")
	private Date dateOfBirth;

	@Column(name = "nationality")
	private String nationality;

	public Students() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Students{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surename='" + surename + '\'' +
				", dateOfBirth=" + dateOfBirth +
				", nationality='" + nationality + '\'' +
				'}';
	}
}
