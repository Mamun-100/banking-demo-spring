/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cogent;

import java.util.ArrayList;

/**
 *
 * @author J2EE
 */
public interface AccountInterface {

    ArrayList<Account> getAllAccount();

    Account getAccountById(int account_id);

    void deposite(Account a);

}
