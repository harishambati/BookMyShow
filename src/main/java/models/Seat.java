package models;

import jakarta.persistence.Entity;
import lombok.*;


@Setter
@Getter
@Entity
public class Seat extends BaseModel{
	private String name;
	private SeatType seatType;
	private int row;
	private int col;
}
