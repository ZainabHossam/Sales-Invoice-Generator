
package sig.model;
import java.util.ArrayList;
import java.util.Date;

/*@author Zainab*/
//Parent of InvoiceItemsDetails
public class InvoiceTableElements {
    /*Invoice No., Invoice Date, Customer Name, and the Total
    amount of the invoice in the table that shows a preview of every 
    invoice (See Screenshot 1, left-side panel) */
    private int InvoiceNo;
    private Date InvoiceDate;
    private String CustomerName;
    private ArrayList<InvoiceItemsDetails>ItemDetails;

    public InvoiceTableElements(int InvoiceNo, Date InvoiceDate, String CustomerName) {
        this.InvoiceNo = InvoiceNo;
        this.InvoiceDate = InvoiceDate;
        this.CustomerName = CustomerName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(int InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    public ArrayList<InvoiceItemsDetails> getItemDetails() {
        return ItemDetails;
    }

    public void setItemDetails(ArrayList<InvoiceItemsDetails> ItemDetails) {
        this.ItemDetails = ItemDetails;
    }
     
    
    
}
