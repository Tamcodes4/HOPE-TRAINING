package DAY_12.task.model;
public class Customer {
    private String customerName;
    private String phoneNo;

    public Customer(String customerName, String phoneNo) {
        this.customerName = customerName;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return customerName;
    }

    public String getPhone() {
        return phoneNo;
    }

    public void isValid() {
        try {
            if (customerName.equals("") || phoneNo.length() != 10) {
                throw new Exception("invalid customer details");
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
