package day40;
/*Create Offer class with instance fields :
location, company, salary , isFullTime
instance methods :
displayOfferDetails -- print all info about offers
Create 5 offer objects with your ideal offers with all details ,
call displayOfferDetails method on each of them
Optionally :
Store them into List<Offer> then call the method.
Optionally :
Add 5000 to each offers less than 100K
 */

public class Offer {
    String company;
    String location;
    long salary;
    boolean isFullTime;

    public void displayOfferDetails(){
        System.out.println("Location = " + location + " | " +
                            "Company = " + company + " | " +
                            "Salary = $" + salary + " | " +
                            "isFullTime = " + isFullTime);
    }

    //write a method called turnToFullTime
    public void turnToFullTime() {
        if (isFullTime == false) {
            isFullTime = true;
       } else {
            System.out.println("Already fulltime!!!");
        }
    }

    //write a method to change the location of the Offer to the location passed
    public void changeLocation(String newLocation){
        location = newLocation;
    }

    //write a method to accept 4 parameters to change all info about offers
    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFullTime){
        company=newCompany;
        location=newLocation;
        salary=newSalary;
        isFullTime=newIsFullTime;
        displayOfferDetails();
    }

    //write a method to check the offer belong to 100K club and return the result as true or false
    public boolean is100KOffer(){
        return salary>=100000;
    }

    public String toString(){
        return "[Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = $" + salary + " | " +
                "isFullTime = " + isFullTime + "]";
    }


}