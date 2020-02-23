package day44;

public class SlackUser {
    protected String name;
    protected String status;

    public void sendMessage(){
        System.out.println("Here is your message, " + name);
    }

    public void callSomeone(){
        System.out.println(name + " is dialing the number...");
    }

    public void addEmoji(){
        System.out.println(name + " is adding emoji :)");
    }


    //Create a class called SlackUser
    //attributes :
    //	 name  ,  status (make it protected)
    //behaviours :
    //	 sendMessage
    //	 callSomeone
    //	 addEmoji
    //Creare 1 subClass SlackAdminUser
    //attribute :
    //	adminId
    //behaviour :
    //	 sendAtChannelMessage
    //	 deleteMessage
    //	 addChannel
    //	 toString method
    //constructor :
    //	 3 argument constructor to set all fields value
}
