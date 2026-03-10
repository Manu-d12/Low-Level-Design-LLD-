package OpenClosePrinciple.Problem;

import SingleResponsibilityPrinciple.Problem.Invoice;
import SingleResponsibilityPrinciple.Solution.Marker;

// Usage example - showing the problem
public class ViolationDemo {
    public static void main(String[] args) {
        Marker marker = new Marker("name", "color", 10, 2020);
        Invoice invoice = new Invoice(marker, 5);
        invoice.calculateTotal();

        InvoiceDao databaseFileSave = new InvoiceDao(invoice);
        databaseFileSave.saveToDB(); // Save to DB
        databaseFileSave.saveToFile(); // Save to File

        // Problem: If we want to add a new function like saveToMongoDB(),
        // we need to modify InvoiceDao and all its derived classes(if exists)
        // This violates the "closed for modification" part of OCP
    }
}
