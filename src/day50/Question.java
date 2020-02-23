package day50;

public abstract class Question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown"; //setting default value to unknown directly here to avoid null

    public abstract void calculate();

    public Question(String operator, String questionType) {
        this.operator = operator;
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return "The question type is " + questionType + " : ";
    }
}
