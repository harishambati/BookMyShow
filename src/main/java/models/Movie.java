package models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie extends BaseModel{
	private String name;
	private Date releaseDate;
}
