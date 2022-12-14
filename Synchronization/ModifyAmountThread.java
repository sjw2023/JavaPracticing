package Synchronization;

public class ModifyAmountThread extends Thread{
    private CommonCalculate calc;
    private boolean addFlag;
    public ModifyAmountThread(CommonCalculate calc, boolean addFlag){
        this.calc = calc;
        this.addFlag = addFlag;
    }
    //1000을 더하도록하는 부분
    public void run(){
        for(int loop=0;loop<1000;loop++){
            if(addFlag){
                calc.plus(1);
            } else {
                calc.minus(1);
            }
        }
    }
}
