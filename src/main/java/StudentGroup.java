import javax.persistence.*;

@Entity
@Table(name = "student_group")
@NamedQueries({
		@NamedQuery(name = "get_studentGroup_by_id",
				query = "select sg from StudentGroup sg where studentId = :student_id")})

public class StudentGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "student_id")
	private int studentId;

	@Column(name = "group_id")
	private int groupId;

	public StudentGroup() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "StudentGroup{" +
				"id=" + id +
				", studentId=" + studentId +
				", groupId=" + groupId +
				'}';
	}
}
