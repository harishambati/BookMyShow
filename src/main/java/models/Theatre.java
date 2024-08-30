package models;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Theatre extends BaseModel{
	private String name;
	private List<Screen> screens;
	private Region region;
	
}
