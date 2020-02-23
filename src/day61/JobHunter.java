package day61;

import java.util.*;

public class JobHunter {
    public static void main(String[] args) {

        Job j1 = new Job("Hawaii",116000,"Surfers");
        Job j2 = new Job("Barbados",180000,"R&B");
        Job j3 = new Job("Cuba",135000,"Salsa");
        Job j4 = new Job("Tibet",120000,"Monks");
        Job j5 = new Job("Costa Rica",105000,"Nature");

        List<Job> jobList = new LinkedList<>();
        jobList.addAll(Arrays.asList(j1,j2,j3,j4,j5));
        System.out.println(j1.compareTo(j2));

        System.out.println("Before sort " + jobList);

        Collections.sort(jobList);
        System.out.println("After sort " + jobList);
        Collections.sort(jobList, Comparator.reverseOrder()
        );
        System.out.println("jobList = " + jobList);
        Collections.sort(jobList,Collections.reverseOrder());
        System.out.println("jobList = " + jobList);

    }
}
