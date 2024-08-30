package models;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
	private User user;
	private Long referenceId;
	private ShowSeat showSeat;
	private int amount;
	private List<Payment> payments;
	private BookingStatus bookingStatus;
}
