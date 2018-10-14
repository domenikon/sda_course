import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "address_id")
	private int addressId;

	@Column(name = "max_size")
	private int maxSize;

	public Room() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	public String toString() {
		return "Room{" +
				"id=" + id +
				", addressId=" + addressId +
				", maxSize=" + maxSize +
				'}';
	}
}
