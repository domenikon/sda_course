import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "student_id")
	private int studentId;

	@Column(name = "course_id")
	private int coursetId;

	@Column(name = "invoice_value")
	private float invoiceValue;

	public Payments() {
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

	public int getCoursetId() {
		return coursetId;
	}

	public void setCoursetId(int coursetId) {
		this.coursetId = coursetId;
	}

	public float getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(float invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	@Override
	public String toString() {
		return "Payments{" +
				"id=" + id +
				", studentId=" + studentId +
				", coursetId=" + coursetId +
				", invoiceValue=" + invoiceValue +
				'}';
	}
}
