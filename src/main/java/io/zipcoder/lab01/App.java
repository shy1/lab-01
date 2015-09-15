package io.zipcoder.lab01;

/**
 * Created by syoung on 9/15/15.
 */
public class App {
    Message message = new Message();

    public static void main (String args[]) {
        App application = new App();
        application.message.sendMessage("first");
        application.message.sendMessage("second");
        application.message.sendMessage("third");

        String[] pMessages = application.message.getMessages();
        for (String iValue : pMessages) {
            System.out.println(iValue);
        }
    }
}
