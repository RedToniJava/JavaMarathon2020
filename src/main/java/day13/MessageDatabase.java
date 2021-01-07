package day13;

import java.util.Date;
import java.util.List;

public class MessageDatabase {
  private static List<Message> messages;

  public static void addNewMessage(User u1,User u2, String text){
    Date date= new Date();
         messages.add(new Message(u1,u2,text,date));

  }
  public static void showDialog(User u1,User u2){
    System.out.println(u1.toString());

  }
}
