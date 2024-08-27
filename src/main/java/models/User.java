package models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseModel{
	private String email;
	private String name;
	private List<Booking> bookings;
	
}
