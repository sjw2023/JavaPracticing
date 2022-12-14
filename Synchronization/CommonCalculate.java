package Synchronization;

public class CommonCalculate {
    private int amount;
    private int interest;
    private Object interestLock=new Object();
    private Object amountLock=new Object();
    public CommonCalculate(){
        amount=0;
    }
    //Synchronized Method
//    public synchronized void plus(int value){
//        amount+=value;
//    }
//    public synchronized void minus(int value){
//        amount-=value;
//    }
    //Synchronized Block
    public void plus(int value){
        synchronized (amountLock){
            amount+=value;
        }

    }
    public void minus(int value){
        synchronized (amountLock){
            amount-=value;
        }
    }
    public void addInterest(int value){
        synchronized (interestLock){
            interest+=value;
        }
    }

    public int getAmount(){
        return amount;
    }
}
