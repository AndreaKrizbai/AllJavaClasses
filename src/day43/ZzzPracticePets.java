package day43;

public class ZzzPracticePets {
    private String type;
    private String name;

    public ZzzPracticePets() {
        type = "unknown";
        name = "no-name";
    }

    public ZzzPracticePets(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ZzzPracticePets{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void speak (){
       if(type.equals("cat")){
           System.out.println("Meow");
       } else if(type.equals("dog")){
           System.out.println("woof");
       } else if(type.equals("cow")){
           System.out.println("moo");
       } else if(type.equals("horse")){
           System.out.println("neinei");
       } else {
           System.out.println("unknown animal");
       }

    }

}
