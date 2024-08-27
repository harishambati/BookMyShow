package models;


import java.util.List;
import lombok.*;


@Setter
@Getter
public class Screen extends BaseModel{
	private String name;
	private List<Seat> seats;
	private List<Feature> features;
}
