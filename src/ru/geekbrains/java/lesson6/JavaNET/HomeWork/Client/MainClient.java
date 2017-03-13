package ru.geekbrains.java.lesson6.JavaNET.HomeWork.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Евгений on 12.03.2017.
 */
public class MainClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8189)) {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
                String message = sc.nextLine();
                out.writeUTF(message);
                if (message.equals("end")) break;
                String messageServer = in.readUTF();
                System.out.println(messageServer);
                if (messageServer.equals("end")) break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
