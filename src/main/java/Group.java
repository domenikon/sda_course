import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "group")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "schedule_id")
	private int scheduleId;

	@Column(name = "room_id")
	private int roomtId;

	@Column(name = "date_start")
	private Date dateStart;

	@Column(name = "date_finish")
	private Date dateFinish;

	@Column(name = "course_id")
	private int courseId;

	public Group() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public int getRoomtId() {
		return roomtId;
	}

	public void setRoomtId(int roomtId) {
		this.roomtId = roomtId;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateFinish() {
		return dateFinish;
	}

	public void setDateFinish(Date dateFinish) {
		this.dateFinish = dateFinish;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Group{" +
				"id=" + id +
				", scheduleId=" + scheduleId +
				", roomtId=" + roomtId +
				", dateStart=" + dateStart +
				", dateFinish=" + dateFinish +
				", courseId=" + courseId +
				'}';
	}
}
