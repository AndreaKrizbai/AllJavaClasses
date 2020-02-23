package day51;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo (Person otherPerson){
//        if(this.name.charAt(this.name.length()-1) > otherPerson.name.charAt(otherPerson.name.length()-1)){
//           return 1;
//        } else if(this.name.charAt(this.name.length()-1) < otherPerson.name.charAt(otherPerson.name.length()-1)){
//            return -1;
//        } else {
//            return 0;
//        }
        return this.name.compareTo(otherPerson.name);
    }

//    public int compareTo(Person otherPerson) {
//        if (this.age > otherPerson.age) {
//            return 1;
//        } else if (this.age < otherPerson.age) {
//            return -1;
//        } else {
//            return 0;
//        }
        // modify this method to make your natural order , comparing by name

}
