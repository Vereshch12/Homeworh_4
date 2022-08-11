public class Main {
    public static void main(String[] args) {

        // Задание №1
        short i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        i--;
        for (; i >= 1; i--){
            System.out.print(i + " ");
        }


        //Задание №2
        System.out.println("\n");
        int dayOfMonth = 5;
        for (; dayOfMonth <= 31; dayOfMonth++){
            if ((dayOfMonth - 5) % 7 == 0)
                System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет.");
        }

        //Задание №3
        System.out.println("\n");
        int year = 0;
        int todaysYear = 2022;
        for (;year <= todaysYear + 100; year++){
            if (year % 79 == 0){
                if (todaysYear - year <= 200)
                    System.out.println(year);
            }
        }
    }
}