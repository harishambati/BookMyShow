package models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment extends BaseModel{
	private int amount;
	private PaymentStatus paymentStatus;
	private Long referenceId;
	private PaymentProvider paymentProvider;
	
}
