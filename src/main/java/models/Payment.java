package models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Payment extends BaseModel{
	
	private int amount;
	
	@Enumerated(EnumType.ORDINAL)
	private PaymentStatus paymentStatus;
	
	private Long referenceId;
	
	@Enumerated(EnumType.ORDINAL)
	private PaymentProvider paymentProvider;
	
}
