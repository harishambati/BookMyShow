package models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Theatre extends BaseModel{
	private String name;
	private List<Screen> screens;
	private Region region;
	
}
