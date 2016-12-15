/**
 * Created by Rita on 2016.12.15..
 */
public interface Transactions {

    void deposit(int depositAmount);

    double getBalance();

    void transfer(int transferredAmount, Account accountTo);

    void withdraw(int withdrawnAmount);

    void audit();

}
