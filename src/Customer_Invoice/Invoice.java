package Customer_Invoice;

public class Invoice {
    private Customer customers;
    private int idInvoice;
    private double amount;

    public Invoice(Customer customers, int idInvoice, double amount) {
        this.customers = customers;
        this.idInvoice = idInvoice;
        this.amount = amount;
    }

    public Customer getCustomers() {
        return customers;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public void setAmount() {
        this.amount = this.amount - this.amount * customers.getDiscount() / 100;
    }

    public String toString() {
        return customers.toString() + "\nAmount : " + String.format("%.2f", this.amount) + " $" + "\n------------------\n";
    }
}
