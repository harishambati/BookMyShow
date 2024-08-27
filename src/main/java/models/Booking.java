package models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Booking extends BaseModel{
	private User user;
	private Long referenceId;
	private ShowSeat showSeat;
	private int amount;
	private List<Payment> payments;
	private BookingStatus bookingStatus;
}
