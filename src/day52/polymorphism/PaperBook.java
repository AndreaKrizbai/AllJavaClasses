package day52.polymorphism;

public class PaperBook extends Book implements Readable {
    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Book's name is: "+name+", the author is: "+author
                +" and the weight is " + weight);
    }

    public void read(){
            System.out.println("Reading the "+name+" written by "+author);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("Bookmark and taking note from "+name);
    }

//    @Override
//    public void showTableOfContent() {
//        System.out.println("Chapter 1 until Chapter 10 : you do the rest");
//    }
}
