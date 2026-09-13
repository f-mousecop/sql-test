# Java JDBC with HSQLDB 

---

Implementing a lightweight database in Java mocking an `Invoice` database

Connection and table `invoice` table implemented in [InvoiceDatabase](/src/main/java/org/charles/sql/InvoiceDatabase.java)

Invoice data access object (DAO) implemented in [InvoiceDao](src/main/java/org/charles/sql/InvoiceDao.java)

- Method to list all records:
```java
public List<Invoice> all() {}
```

- Method to retrieve records containing at least a specified `value`:
```java
public List<Invoice> allWithAtLeast(int value) {}
```

- Method to save/insert a new record with customer `name` and `value`:
```java
public void save(Invoice inv) {}
```

- Method to delete a record based on the given `name` and `value`:
```java
public void remove(Invoice inv) {}
```

---

[Invoice](src/main/java/org/charles/sql/Invoice.java) implements `customer` and `value`
- **TODO**: add id field to tell identical invoices apart