import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C://DOC//ip.txt");
            int i;
            String resultIp = "";
            while ((i = fis.read()) != -1) {// Читаем из файла, до тех пор, пока не получим -1. В конце файла всегда -1
                if (i == 13) continue;//Символ возврата каретки
                if (i == 10) {//Символ переноса строки
                    String[] resultIpArray = resultIp.split(":");//Разделяем ip и port по символу двоеточие :
                    String ip = resultIpArray[0];//Сохраняем ip
                    int port = Integer.parseInt(resultIpArray[1]);//Сохраняем порт как число
                    Thread proxyChecker = new Thread(new ProxyChecker(ip, port));
                    proxyChecker.start();
                    resultIp = "";
                } else if (i == 9) {//Символ табуляции
                    resultIp += ":";//Заменяем символ табуляции на двоеточие :
                } else {
                    resultIp += (char) i;//Сохраняем в строку любые другие смволы прочитанные из файла
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//это второй способ многопоточности
class ProxyChecker implements Runnable {
    private String ip;
    private int port;

    ProxyChecker(String ip, int port) {//создаём конструктор
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        System.out.println("Пробуем подключиться через Прокси: " + ip + ":" + port);
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection(proxy);
            //Get Response
            InputStream is = urlConnection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
            System.out.println("Получен ответ, наш ip: " + response);
//Сохраняем рабочий IP-адрес в файл
            FileOutputStream fos = new FileOutputStream("C://DOC//good_ip.txt", true);//добавляет в файл. Я проверил, если файла такого не существует, то он будет создан
            byte[] buffer = (ip + ":" + port + "\n").getBytes();//добавим символ переноса строки, чтобы было удобно читать IP-адреса в файле
            fos.write(buffer);
            rd.close();
            fos.close();//закрываем файл
        } catch (IOException e) {
            System.out.println("Не рабочий ip " + ip + ":" + port);
        }
    }
}
