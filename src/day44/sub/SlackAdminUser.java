package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {
    int adminId;

    public void sendAtChannelMessage(){
        System.out.println(name + " is sending message to all in channel");
    }

    public void deleteMessage(){
        System.out.println(name + " is deleting messages");
    }

    public void addChannel(){
        System.out.println(name + " is adding new channel");
    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public SlackAdminUser(int adminId, String status, String name) {
        this.adminId = adminId;
        this.status = status;
        this.name = name;
    }

    public static void main(String[] args) {
        SlackAdminUser a1 = new SlackAdminUser(56,"busy","Bianka");
        //inherited methods we are calling
        a1.addEmoji();
        a1.sendMessage();
        a1.callSomeone();
        //our own methods we are calling:
        a1.addChannel();
        a1.deleteMessage();
        a1.sendAtChannelMessage();
    }


}
