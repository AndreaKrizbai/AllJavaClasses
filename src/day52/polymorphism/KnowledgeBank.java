package day52.polymorphism;

public interface KnowledgeBank {
    public abstract void takeNote();
    public default void showTableOfContent(){
        System.out.println("Chapter 1 until Chapter 10 : you do the rest");
    }
}
