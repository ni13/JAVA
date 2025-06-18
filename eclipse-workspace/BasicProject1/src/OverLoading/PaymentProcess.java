package OverLoading;

public class PaymentProcess {
//Credit card
	public void makePayment(String cardNumber,String CVV,String expiryDate) {
		System.out.println("Paid by Creditcard: "+cardNumber);
	}
	//upi
	public void makePayment(String upiId) {
		System.out.println("Paid by upiId :"+upiId);
	}
	//wallet
	public void makePayment(String walletId,int amount) {
		System.out.println("Paid by walletId:"+walletId+ " Amount:"+amount);
	}
		public static void main(String[] args){
		PaymentProcess obj=new PaymentProcess();
		obj.makePayment("67944368988","123","02/3/25");
		obj.makePayment("upiid 12333");
		obj.makePayment("fhgg",2500);
	}

}
