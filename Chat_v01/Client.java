package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8188);
            System.out.println("Клиент успешно подключён");
            DataInputStream in = new DataInputStream(socket.getInputStream());//это поток ввода
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());//это поток вывода
            String response = in.readUTF();//принимаем и читаем ответ от Сервера
            System.out.println(response);
            Scanner scanner = new Scanner(System.in);//Это нужно, чтобы можно было вводить значения с клавиатуры
            while (true) {
                System.out.print("Введите сообщение: ");
                String consoleText = scanner.nextLine();//Ждём сообщение от пользователя
                out.writeUTF(consoleText);//Отправялем сообщение на сервер
                response = in.readUTF();//Читаем ответ от сервера
                System.out.println("Ответ от Сервера: " + response);//Выводим сообщение от Сервера на экран
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
