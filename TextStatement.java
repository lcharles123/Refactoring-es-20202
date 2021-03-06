
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

}
