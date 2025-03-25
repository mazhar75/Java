public class AccountDirector {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.BankAccountBuilder("SaigonTechnologyBank", "STS7777777", "7777777")
                .withFullName("Wind Hero")
                .withAddress("MID")
                .build();
        System.out.println(account);
    }
}
