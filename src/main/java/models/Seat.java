package models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;


@Setter
@Getter
@Entity
public class Seat extends BaseModel{
	
	private String name;
	
	@Enumerated(EnumType.ORDINAL)
	private SeatType seatType;
	
	private int row;
	
	private int col;
}
