package models;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass
public class BaseModel {
	
	private Long id;
	private Date createdAt;
	private Date modifiedAt;
	

}
