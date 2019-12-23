package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        long [] salaries = {130000,132000,125000,150000,200000};

        for(long s : salaries) {
            System.out.println(s);
        }
        for(long s : salaries){
            if(s>130000){
                System.out.println("More than 130K: " + s);
            }
        }
//        same as above, just with skipping:
        for (long salary : salaries) {
            if(salary<=130000){
                continue;
            }
            System.out.println("salary = " + salary);
        }
            
        long max = salaries[0];
        for(long salary : salaries){
            if(salary>max){
                max = salary;
            }
        }
        System.out.println("max = " + max);
        
        long min = salaries[4];
        for (long i : salaries) {
            if (i<min){
                min = i;
            }
        }
        System.out.println("min = " + min);

        long sum = 0;
        for (long x : salaries) {
           sum = sum + x;
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + sum/salaries.length);
        for (long average : salaries) {
            if(average > sum/salaries.length){
                System.out.println("More than average:" + average);
        }

        }
    }
}
