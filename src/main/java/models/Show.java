package models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Show extends BaseModel{
	private Movie movie;
	private Date startTime;
	private Date endTime;
	private List<Feature> features;

}
