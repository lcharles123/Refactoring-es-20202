import java.util.Enumeration;

public class TextStatement extends Statement {
    
    public String nameResult(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() + "\n";
    }
    
    public String chargeResult(Rental each){
        return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
    }
     
    public String getFooterLine1(Customer aCustomer){
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }
    
    public String getFooterLine2(Customer aCustomer){
        return "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
    
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = nameResult(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += chargeResult(each);
        }
        //add footer lines
        result += getFooterLine1(aCustomer);
        result += getFooterLine2(aCustomer);
        return result;
    }
}
