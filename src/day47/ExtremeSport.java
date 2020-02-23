package day47;

public class ExtremeSport extends Sport {
    // cannot override it because it's final
   // @Override
//    public void doSomething() {
//       super.doSomething();
//       System.out.println("doing extreme sport");
//   }

    public void doSomething(int x) {
        super.doSomething();
        System.out.println("doing extreme sport");
    }

    @Override
    //this final keyword is blocking sub class of
    // ExtremeSport to override this method
    public final void doSomethingElse(){
        System.out.println(("doing something else in extreme sport"));
    }




}
