package models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
public class Region extends BaseModel{

	private String name;
	
	//Delete later
	@OneToMany
	private List<Theatre> theatres;
		
}
