package day62;

import day61.Job;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {

        SortedSet<Job>sortedJobs = new TreeSet<>();

        sortedJobs.add(new Job("Hawaii",116000,"Surfers"));
        sortedJobs.add(new Job("Barbados",180000,"R&B"));
        sortedJobs.add(new Job("Cuba",135000,"Salsa"));
        sortedJobs.add(new Job("Tibet",120000,"Monks"));
        sortedJobs.add(new Job("Costa Rica",105000,"Nature"));

       // sortedJobs.addAll(Arrays.asList(j1,j2,j3,j4,j5));
        //System.out.println("sortedJobs = " + sortedJobs);
        for(Job each: sortedJobs){
            System.out.println("each = " + each);
        }
    }
}
