import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "student_group")
@NamedQueries({
		@NamedQuery(name = "get_students_by_name",
				query = "select s from StudentGroup s where name = :name")})

public class StudentGroup {



}
