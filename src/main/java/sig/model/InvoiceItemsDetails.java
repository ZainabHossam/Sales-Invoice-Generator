/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sig.model;

/**
 *
 * @author Zainab
 */
//Child of InvoiceTableElements
public class InvoiceItemsDetails {

    public InvoiceItemsDetails(InvoiceTableElements InvoiceNo, string ItemName, double ItemPrice, int ItemCount) {
        this.InvoiceNo = InvoiceNo;
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemCount = ItemCount;
    }
   private InvoiceTableElements InvoiceNo;
   private string ItemName;
   private double ItemPrice;
   private int ItemCount;

    public InvoiceTableElements getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(InvoiceTableElements InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    public string getItemName() {
        return ItemName;
    }

    public void setItemName(string ItemName) {
        this.ItemName = ItemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int ItemCount) {
        this.ItemCount = ItemCount;
    }
   
    
    
}
