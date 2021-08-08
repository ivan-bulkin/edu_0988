import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(new Room[]{
                new Room(true, 2, true, true, 11),
                new Room(true, 3, true, true, 12),
                new Room(true, 2, false, false, 13),
                new Room(false, 1, false, false, 14),
                new Room(true, 4, true, true, 21),
                new Room(true, 3, false, false, 22),
                new Room(false, 3, false, false, 23),
                new Room(true, 3, true, false, 24),
                new Room(true, 4, true, true, 31),
                new Room(true, 3, false, false, 32),
                new Room(false, 3, false, false, 33),
                new Room(true, 3, false, false, 34),
        });
        String commands = "*----*\n" +
                "getFreeRooms - показать все свободные номера\n" +
//                "getFreeRooms (wc:[true|false]) (sleepingPlace:[кол-во мест]) (conditioner:[true|false]) (wifi:[true|false]) - показать свободные комнаты с заданными параметрами\n" +
                "getFreeRooms wc sleepingPlace:[кол-во мест] conditioner wifi - показать свободные номера с заданными критериями\n" +
                "reserve [номер комнаты] забронировать номер\n" +
                "getReservedRooms - показать зарезервированные номера\n" +
                "exit - выход из программы\n" +
                "*----*";
        System.out.print(commands);
        System.out.print("\nВведите команду: ");
        String command = scanner.nextLine();
        while (!command.equals("exit")) {
            if (command.indexOf("getFreeRooms") == 0) {
                String splitted[] = command.split(" ");
                if (splitted.length == 1) hotel.getFreeRooms();//если длина массива равно единица, значит показываем все свободные номера, без всяких критериев
                else {
                    boolean wc = false;
                    int sleepingPlace = 0;
                    boolean conditioner = false;
                    boolean wifi = false;
                    for (int i = 1; i < splitted.length; i++) {
                        String[] service = splitted[i].split(":");
//                        if (service[0].equals("wc")) wc = service[1].equals("true");
                        if (service[0].equals("wc")) wc = true;
                        else if (service[0].equals("sleepingPlace")) sleepingPlace = Integer.parseInt(service[1]);
//                        else if (service[0].equals("conditioner")) conditioner = service[1].equals("true");
                        else if (service[0].equals("conditioner")) conditioner = true;
//                        else if (service[0].equals("wifi")) wifi = service[1].equals("true");
                        else if (service[0].equals("wifi")) wifi = true;
                    }

                    hotel.getFreeRooms(wc, sleepingPlace, conditioner, wifi, splitted.length - 1);
                }
                ;
            } else if (command.indexOf("reserve") == 0) {
                String splitted[] = command.split(" ");
                int roomNumber = Integer.parseInt(splitted[1]);
                hotel.reserve(roomNumber);
            } else if (command.equals("getReservedRooms")) {
                hotel.getReservedRooms();
            } else {
                System.out.println("Ошибка: неизвестная команда.\nСписок доступных команд:\n" + commands);
            }
            System.out.print("\nВведите команду: ");
            command = scanner.nextLine();
        }
    }
}
