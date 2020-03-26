public class ReTime {
    public static void main(String[] args) {

        //данный код пререводит заданные параметры к виду недели/дни/часы/минуты/секунды
        //так же прикручено условие проверки отрицательного заначения

        //задаем параметры
        int seconds = 3600;
        int minutes = 20555;
        int hours = 2354;
        int days = 1000;
        int weeks = 5;

        // проверяем отсутствие отрицательных int
        if (seconds >= 0 && minutes >= 0 && hours >=0 && days >= 0 && weeks >=0) {
            String out = "В " +weeks + " неделях " + days + " днях " + hours + " часах " + minutes + " минутах " + seconds + " секундах";
            //вычисляем кол-во минут
            minutes += seconds / 60;
            //запоминаем остаток секунд
            int lastSeconds = seconds % 60;
            //вычисляем кол-во часов
            hours += minutes / 60;
            //запоминаем остаток минут
            int lastMinutes = minutes % 60;
            //вычисляем кол-во часов
            days += hours / 24;
            //запоминаем остаток часок
            int lastHours = hours % 24;
            //вычисляем кол-во недель
            weeks += days / 7;
            //запоминаем остаток дней
            int lastDays = days % 7;
            //вывод на экран
            System.out.println(out);
            System.out.println(weeks + " недель");
            System.out.println(lastDays + " дней");
            System.out.println(lastHours + " часов");
            System.out.println(lastMinutes + " минут");
            System.out.println(lastSeconds + " секунд");
        } else System.out.println("Есть отрицательный параметр! Замените!");
    }
}
