package models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Payment extends BaseModel{
	private int amount;
	private PaymentStatus paymentStatus;
	private Long referenceId;
	private PaymentProvider paymentProvider;
	
}
