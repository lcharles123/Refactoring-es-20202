import java.util.Enumeration;

public abstract class Statement {
    abstract String nameResult(Customer aCustomer);
    abstract String chargeResult(Rental each);
    abstract String getFooterLine1(Customer aCustomer);
    abstract String getFooterLine2(Customer aCustomer);
    
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
