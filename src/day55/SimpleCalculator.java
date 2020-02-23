package day55;

public class SimpleCalculator {
    private int result;

    public SimpleCalculator addNum(int num){
        this.result += num;
//        Calculator c = new Calculator();
//        return c;
        return this;
    }
    public SimpleCalculator minusNum(int num){
            this.result -= num;
            return this;
    }

    public void displayFinalResult(){
        System.out.println("final result = " + result);
    }

}
