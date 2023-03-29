/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruff;

/**
 *
 * @author U6032545
 */
abstract class centralGovernment {

    abstract public void Rules();

    public int loanInterest() {
        return 10;
    }

}

interface RBI {

    int i = 0;

    int MaxHomeLoan();
  

}

interface stateGovernment extends RBI {

    void RULES();

}

public class SBI extends centralGovernment implements RBI {

    @Override
    public void Rules() {
        System.out.println("state bank  Rules");
    }

    @Override
    public int MaxHomeLoan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
 class HDFC extends centralGovernment implements RBI {

    @Override
    public void Rules() {
        System.out.println("HDFC bank  Rules");
    }

    @Override
    public int MaxHomeLoan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void privacyMethod(){
    
    System.out.println("HDFC privacy");
    }

}

class mainClass {

    public static void main(String args[]) {
        SBI sbi = new SBI();
        sbi.loanInterest();
        centralGovernment cg = new SBI();
        cg.Rules();
        centralGovernment cgHDFC = new HDFC();
        cgHDFC.Rules();
                
        
        

    }

}
