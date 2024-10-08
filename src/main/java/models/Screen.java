package models;


import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;


@Setter
@Getter
@Entity
public class Screen extends BaseModel{
	
	private String name;
	
	@OneToMany
	private List<Seat> seats;
	
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection
	private List<Feature> features;
}
