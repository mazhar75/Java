public class BankAccount {
    // Required fields
    private final String bankName;
    private final String accountNumber;
    private final String idNumber;
    
    // Optional fields
    private String fullName;
    private String email;
    private String address;

    private BankAccount(BankAccountBuilder builder) {
        this.bankName = builder.bankName;
        this.accountNumber = builder.accountNumber;
        this.idNumber = builder.idNumber;
        this.fullName = builder.fullName;
        this.email = builder.email;
        this.address = builder.address;
    }
    
    // Getters (and possibly toString())

    public static class BankAccountBuilder {
        // Required fields
        private final String bankName;
        private final String accountNumber;
        private final String idNumber;
        
        // Optional fields initialized with default values
        private String fullName = "";
        private String email = "";
        private String address = "";

        public BankAccountBuilder(String bankName, String accountNumber, String idNumber) {
            this.bankName = bankName;
            this.accountNumber = accountNumber;
            this.idNumber = idNumber;
        }

        public BankAccountBuilder withFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public BankAccount build() {
            // You can add validations here if needed.
            return new BankAccount(this);
        }
    }
    
    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
