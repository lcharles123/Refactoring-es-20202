import java.util.Enumeration;

public class HtmlStatement extends Statement {
    
    public String nameResult(Customer aCustomer){
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }
    
    public String chargeResult(Rental each){
        return each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }    
    
    public String getFooterLine1(Customer aCustomer){
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }
    
    public String getFooterLine2(Customer aCustomer){
        return "On this rental you earned <EM>" +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +  "</EM> frequent renter points<P>";
    }
    
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = nameResult(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += chargeResult(each);
        }
        //add footer lines
        result += getFooterLine1(aCustomer);
        result += getFooterLine2(aCustomer);
        return result;
    }
}
