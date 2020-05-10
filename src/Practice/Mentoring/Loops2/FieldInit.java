package Practice.Mentoring.Loops2;

public class FieldInit {
    public static void main(String[] args) {
        int data[]= {2010, 2013, 2014, 2015, 2014};
        int key = 2014;
        int count = 0;

        for (int each : data) {
            if(each != key){
//                continue;
                count++;
            }
        }
        System.out.println(count + " found");
    }
}
