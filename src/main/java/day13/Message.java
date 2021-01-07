package day13;

import java.util.Date;

public class Message {
    User  sender;
    User receiver;
    String text;
    Date date= new Date();


    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
    public Message(User sender, User receiver, String text,Date date ){
        this.sender=sender;
        this.receiver=receiver;
        this.text=text;
        this.date=date;

    }
    public  String toString(){
        return "FROM"+sender.toString()+
                "TO"+receiver.toString()+
                "ON"+date.toString()+
                getText();
    }
}
