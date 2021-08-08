public class Hotel {
    Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms() {
        String result = "Свободные номера:";
        for (int i = 0; i < this.rooms.length; i++) {
            if (!this.rooms[i].isReserved()) {
                //Номер свободен
                System.out.print(this.rooms[i].getRoomNumber() + " ");
            }
        }
    }

    public void getFreeRooms(boolean wc, int sleepingPlace, boolean conditioner, boolean wifi, int serviceCount) {
        String result = "С заданными критериями найдены свободные номера: ";
        for (int i = 0; i < this.rooms.length; i++) {
            int mark = 0;
            Room room = rooms[i];
            if (wc && room.isWc()) mark++;
            if (sleepingPlace != 0 && room.getSleepingPlace() == sleepingPlace) mark++;
            if (conditioner && room.isConditioner()) mark++;
            if (wifi && room.isWifi()) mark++;
            if (serviceCount == mark && !room.isReserved()) {
                result += this.rooms[i].getRoomNumber() + " ";
            }
        }
        if (result == "С заданными критериями найдены свободные номера: ")
            System.out.println("С заданными критериями свободных номеров НЕТ");
        else System.out.println(result);
    }

    public void reserve(int roomNumber) {
        String result = "Ошибка: " + roomNumber + " номер не существует";
        for (int i = 0; i < this.rooms.length; i++) {
            if (this.rooms[i].getRoomNumber() == roomNumber && !this.rooms[i].isReserved()) {
                result = "Номер " + roomNumber + " успешно забронирован";
                this.rooms[i].setReserved(true);
                break;
            } else if (this.rooms[i].getRoomNumber() == roomNumber && this.rooms[i].isReserved()) {
                result = "Номер " + roomNumber + " занят";
                break;
            }
        }
        System.out.println(result);
    }

    public void getReservedRooms() {
        String result = "Зарезервированные комнаты:";
        for (int i = 0; i < this.rooms.length; i++) {
            if (this.rooms[i].isReserved()) {
                System.out.print(this.rooms[i].getRoomNumber() + " ");
            }
        }
    }
}
