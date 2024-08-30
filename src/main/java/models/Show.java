package models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Show extends BaseModel{
	
	@ManyToOne 
	private Movie movie;
	
	private Date startTime;
	
	private Date endTime;
	
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection
	private List<Feature> features;

}
