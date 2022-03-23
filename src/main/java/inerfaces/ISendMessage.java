package main.java.inerfaces;

import main.java.Client;
import main.java.Message;

public interface ISendMessage {
    void sendMessage(Message message, Client firstClient, Client secondClient) throws Exception;
}
