/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiclient.chat.system;

import java.io.IOException;
import java.net.ServerSocket;
/**
 *
 * @author user
 */
public class ServerSide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try(ServerSocket serverSocket = new ServerSocket(5000)) {
            while(true) {
                new Echoer(serverSocket.accept()).start();
            }


        } catch(IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
    
}
