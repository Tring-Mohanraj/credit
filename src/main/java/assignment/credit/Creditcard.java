package assignment.credit;
import java.util.logging.*;

public class Creditcard implements cloneable{
    String cardholder;
    Long cardnumber;
    String expirydate;
    Logger log=Logger.getLogger("hi");

    Creditcard(String cardholder, Long cardnumber, String expirydate) {
        this.cardholder = cardholder;
        this.cardnumber = cardnumber;
        this.expirydate = expirydate;
    }

    boolean equals(Long validcardno) {
        return cardnumber.equals(validcardno);
    }

    void display() {
        if( cardnumber == validcardno)
        {
                log.fine("Cardholder nsme id {} and card Number id {} And expiry date {}",cardholder,cardnumber,expirydate);
        }
        else
        {
            log.info("It is invalid");
        }
    }

    Creditcard co() {
    	try{
    		return (Creditcard)super.clone();
    		
    	}
    	catch(CloneNotSupportedException e)
    	{
    		System.out.println("Clowning error");
    		return this;
    	}
}
}
