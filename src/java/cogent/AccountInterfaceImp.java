/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cogent;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author J2EE
 */
public class AccountInterfaceImp implements AccountInterface{
    SessionFactory sf;

    public void setSf(SessionFactory sf) {
        this.sf = sf;
    }
    

    @Override
    public ArrayList<Account> getAllAccount() {
        return (ArrayList<Account>) sf.openSession().createCriteria(Account.class).list();
    }

    @Override
    public Account getAccountById(int account_id) {
        
       return  (Account) sf.openSession().createCriteria(Account.class).add(Restrictions.eq("account-id", account_id));
       
        
    }

    @Override
    public void deposite(Account a) {
        sf.openSession().saveOrUpdate(a);
    }
    
}
