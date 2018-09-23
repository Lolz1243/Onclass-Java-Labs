package P312;

public class Invoice {
private String number;
private String description;
private int quantity;
private double price;
public Invoice(String number, String description, int quantity, double price)
{
	this.number = number;
	this.description = description;
	this.quantity = quantity;
	this.price = price;
}

public double getInvoiceAmount()
{
	double InvoiceAmount;
	InvoiceAmount = quantity * price;
	return InvoiceAmount;
}


public void setNumber(String number)
{
   this.number = number; 
} 


public String getNumber()
{
   return number; 
} 

public void setDescription(String description)
{
   this.description = description; 
} 


public String getDescription()
{
   return description; 
} 

public void setQuantity(int quantity)
{
   this.quantity = quantity; 
} 


public int getQuantity()
{
   return quantity; 
} 

public void setPrice(double price)
{
   this.price = price; 
} 


public double getPrice()
{
   return price; 
} 

}
