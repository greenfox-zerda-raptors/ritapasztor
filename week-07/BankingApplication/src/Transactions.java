/**
 * Created by Rita on 2016.12.12..
 */
public interface Transactions {

    void deposit(int depositAmount);

    double getBalance();

    void transfer(int transferredAmount, Account accountTo);

    void audit();

}
