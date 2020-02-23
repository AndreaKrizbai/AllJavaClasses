package day50;

public class Subtraction extends Question {


    public Subtraction(int num1, int num2) {
        super("-", "Subtraction question");

        if(num1<num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        //after making sure num1 is more than num2
        // then we can set the field value
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate() {
        answer = num1 - num2;
        this.calculated = true;
    }
    @Override
    public String toString() {
        if (this.calculated == false) {
            return super.toString() + num1 + operator + num2 + "=";
        } else {
            return super.toString()+ num1 + operator + num2 + "=" + answer;
        }
    }
}
