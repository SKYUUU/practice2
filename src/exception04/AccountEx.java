package exception04;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(500000);
        System.out.println("현재 잔액 : " + account.getBalance());

        try {
            // 예외처리코드가 반드시 들어가야함
            // withdraw() 에서 예외를 throw
            account.withdraw(10000);
            System.out.println("현재 잔액 : " + account.getBalance());
            account.withdraw(500000);
            System.out.println("현재 잔액 : " + account.getBalance());
        } catch (BalanceException e) {
            System.out.println("예외 원인 : " + e.getMessage());
//            e.printStackTrace();
        } finally {
            System.out.println("정상 종료 됩니다.");
        }
    }
}
