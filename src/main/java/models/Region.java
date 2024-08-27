package models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Region extends BaseModel{

	private String name;
	private List<Theatre> theatres;
		
}
