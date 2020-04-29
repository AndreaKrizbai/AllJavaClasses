package Practice.Repls;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl189 {
        //create your method below
        public static ArrayList<String> combineAl (ArrayList<String>wordList1, ArrayList<String>wordList2){
            ArrayList<String>wordList=new ArrayList<String>();
            for(String each1 : wordList1){
                wordList.add(each1);
            }
            for(String each2 : wordList2){
                wordList.add(each2);
            }
            return wordList;
        }
    public static void removeAll(ArrayList<String>wordList,String targetWord){
        while(wordList.contains(targetWord)){
            wordList.remove(targetWord);
        }
    }
    public static ArrayList<Integer>appendPosSum(ArrayList<Integer>numbers){
        ArrayList<Integer>posNumbers = new ArrayList<>();
        Integer sum = 0;
        for(Integer each : numbers){
            if(each>0){
                posNumbers.add(each);
                sum += each;
            }
        }
        posNumbers.add(sum);
        return posNumbers;
    }
    public static void timesTwo (ArrayList<Integer>nums){
        for(int i=0; i<nums.size(); i++){
            nums.set(i,nums.get(i)*2);
        }
    }
    public static boolean isPalindrome(String check) {
        check = check.replace(" ","");
        String checkBackwards = "";
        for(int i=check.length()-1;i>=0;i--){
            checkBackwards += check.charAt(i);
        }
        return check.equalsIgnoreCase(checkBackwards);
    }

    public static boolean isAnagram(String word1, String word2) {
        word1=word1.replace(" ","").toLowerCase();
        word2=word2.replace(" ","").toLowerCase();
        char[]word1ToChars = word1.toCharArray();
        char[]word2ToChars = word2.toCharArray();
        Arrays.sort(word1ToChars);
        Arrays.sort(word2ToChars);

        if(word1.length()!=word2.length()){
            return false;
        } else {
            return Arrays.equals(word1ToChars,word2ToChars);
        }
    }
    public static int[] addElements(int[] ints1, int[] ints2) {
        int[]nums = new int[5];
        for(int i=0;i<5;i++){
            nums[i]= ints1[i]+ints2[i];
        }
        return nums;

    }

    public static void main(String[] args) {
      ArrayList<String>words = new ArrayList<>();
      words.add("hello");
      words.add("szia");
      words.add("hello");
      ArrayList<String>second = new ArrayList<>();
      second.add("mizu");
        System.out.println(combineAl(words,second));
        removeAll(words,"hello");
        System.out.println(words);
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(9);
        nums.add(0);
        nums.add(25);
        nums.add(-9);
        System.out.println(appendPosSum(nums));
        timesTwo(nums);
        System.out.println(nums);
        System.out.println(isPalindrome("Noon"));
        System.out.println(isPalindrome("nurses run"));
        System.out.println(isAnagram("listen","Silent"));
        int[]nums1 = {1,2,3,4,5};
        int[]nums2 = new int[5];
        nums2[0]=1;
        nums2[4]=5;
        System.out.println(Arrays.toString(addElements(nums1,nums2)));
    }
}


