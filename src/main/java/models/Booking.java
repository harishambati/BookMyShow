package models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
	
	@ManyToOne
	private User user;
	
	//private Long referenceId;
	
	@OneToMany
	private List<ShowSeat> showSeat;
	
	private int amount;
	
	@OneToMany
	private List<Payment> payments;
	
	@Enumerated(EnumType.ORDINAL)
	private BookingStatus bookingStatus;
}
