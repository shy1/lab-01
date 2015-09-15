package io.zipcoder.lab01;

/**
 * Created by syoung on 9/15/15.
 */
public class Message {
    private String[] pastMessages;



    public void sendMessage (String msg) {
        if (pastMessages == null) {
            pastMessages = new String[1];
            pastMessages[0] = msg;
        } else {
            String[] tempArray = new String[pastMessages.length + 1];
            for (int i = 0; i < pastMessages.length; i++) {
                tempArray[i] = pastMessages[i];
            }
            tempArray[pastMessages.length] = msg;
            pastMessages = tempArray;
        }

    }

    public String[] getMessages() {
        return pastMessages;
    }

}
