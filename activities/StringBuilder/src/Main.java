public class Main {
    public static void main(String[] args) {
        CustomerRecord customerRecord = new CustomerRecord();
        customerRecord.add(new Customer(
                "Ben",
                "Keys",
                "555-5555",
                "user@domain.com",
                "1234567",
                21
        ));
        customerRecord.add(new Customer(
                "Ava",
                "Wettrick",
                "555-5555",
                "user@domain.com",
                "1234567",
                22
        ));
        System.out.println(customerRecord.getRecords());
    }
}
