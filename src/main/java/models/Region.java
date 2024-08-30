package models;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Entity
public class Region extends BaseModel{

	private String name;
	private List<Theatre> theatres;
		
}
