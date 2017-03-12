package ru.geekbrains.java.lesson6.JavaNET.HomeWork.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Евгений on 12.03.2017.
 */
public class MainServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            Socket socket = null;
            System.out.println("Сервер ожидает подключения");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while (true) {
                String messageClient = in.readUTF();
                System.out.println(messageClient);
                if (messageClient.equals("end")) break;
                String messageServer = sc.nextLine();
                out.writeUTF(messageServer);
                if (messageServer.equals("end")) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
