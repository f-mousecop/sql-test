package org.charles;

import org.charles.sql.Invoice;
import org.charles.sql.InvoiceDao;
import org.charles.sql.InvoiceDatabase;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        try (Connection connection = InvoiceDatabase.connect()) {
            InvoiceDatabase.createTable(connection);

            InvoiceDao dao = new InvoiceDao(connection);

            dao.save(new Invoice("Charles", 100));
            dao.save(new Invoice("John", 250));
            dao.save(new Invoice("Sarah", 75));

            IO.println("All invoices:");
            dao.all().forEach(IO::println);

            IO.println("\nInvoices worth at least 100:");
            dao.allWithAtLeast(100).forEach(IO::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
