package models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Theatre extends BaseModel{
	
	private String name;
	
	@OneToMany
	private List<Screen> screens;
	
	@ManyToOne
	private Region region;
	
}
