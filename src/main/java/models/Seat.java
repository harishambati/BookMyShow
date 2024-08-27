package models;

import lombok.*;


@Setter
@Getter
public class Seat extends BaseModel{
	private String name;
	private SeatType seatType;
	private int row;
	private int col;
}
