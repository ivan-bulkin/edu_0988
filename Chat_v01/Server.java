package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        {
            try {
                ServerSocket serverSocket = new ServerSocket(8188);//Создаём серверный сокет
                System.out.println("Сервер запущен");
                while (true) {//Бесконечный цикл для ожидания подключения Клиентов
                    Socket socket = serverSocket.accept();//Ожидаем подключения клиента
                    System.out.println("Клиент подключился");
                    DataInputStream in = new DataInputStream(socket.getInputStream());//это поток ввода
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());//это поток вывода
                    out.writeUTF("Добро пожаловать на Сервер");
//это третий способ многопоточности
                    Thread thread1 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while (true) {
                                String request = null;//читаем сообщения от Клиента
                                try {
                                    request = in.readUTF();
                                    out.writeUTF(request.toUpperCase());//отправляем сообщение Клиента назад БОЛЬШИМИ БУКВАМИ
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    });
                    thread1.start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
