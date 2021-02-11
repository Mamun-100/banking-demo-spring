/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cogent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author J2EE
 */
@Entity
@Table(name = "transaction")
public class Transaction {
    int transation_id;
    int account_id;
    double amount;
    String amount_type;

    public Transaction() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "transaction_id")
    public int getTransation_id() {
        return transation_id;
    }

    public void setTransation_id(int transation_id) {
        this.transation_id = transation_id;
    }

    @Column(name = "account_id")
    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    @Column(name = "amount")
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Column(name ="amount_type")
    public String getAmount_type() {
        return amount_type;
    }

    public void setAmount_type(String amount_type) {
        this.amount_type = amount_type;
    }
    
    
    
}
