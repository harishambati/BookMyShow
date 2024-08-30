package models;


import java.util.List;

import jakarta.persistence.Entity;
import lombok.*;


@Setter
@Getter
@Entity
public class Screen extends BaseModel{
	private String name;
	private List<Seat> seats;
	private List<Feature> features;
}
