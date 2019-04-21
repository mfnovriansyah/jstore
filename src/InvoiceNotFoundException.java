public class InvoiceNotFoundException extends Exception{
    private static int invoice_error;
    public InvoiceNotFoundException(int invoice_input){
        super();
        this.invoice_error= invoice_input;
    }
    public  String getExMessage()
    {
        return super.getMessage() + invoice_error + " not found.";

    }
}
