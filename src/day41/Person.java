package day41;

public class Person {
    private String name;
    private int age;
    private long ssn;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public long getSsn(){
        return ssn;
    }

    public void setSsn(long newSsn){
        ssn = newSsn;
    }

    //write a method to give value to the field
    public void setAll(String newName, int newAge, long newSsn){
        //you can put whatever check here to make
        //sure the data is correct or any other logic
        name = newName;
        age = newAge;
        ssn = newSsn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
