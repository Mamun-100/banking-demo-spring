/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cogent;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author J2EE
 */
public class Controller {

    AccountInterface acInter;

    @Autowired
    public void setAcInter(AccountInterface acInter) {
        this.acInter = acInter;
    }

    private SessionFactory sessionfactory;

    ArrayList<Account> accounts;
    int account_id;
    String name;
    double balance;
    DataSource datasource;

    @Autowired
    public void setSessionfactory(SessionFactory sessionfactory) {
        this.sessionfactory = sessionfactory;
    }

    @Autowired
    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
    }

    @PostConstruct
    public void init() {

        load();
        
      
        
      

    }
    
    public  String deposite(@RequestParam("account_id") int account_id, @RequestParam("name") String name,@RequestParam("balance") double  balance, Model m){
        m.addAttribute("accounts", accounts);
        m.addAttribute("size", accounts.size());
        return "index";
 
        
    }

    void load() {
        accounts = acInter.getAllAccount();
    }

    

}
