public class Main {
    public static void main(String[] args) {

        // Задание №1
        short i = 1;
        while (i <= 10){
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        for (i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }


        //Задание №2
        System.out.println("\n");
        for (int dayOfMonth = 5; dayOfMonth <= 31; dayOfMonth++){
            if ((dayOfMonth - 5) % 7 == 0)
                System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет.");
        }

        //Задание №3
        System.out.println();
        int todaysYear = 2022;
        for (int year = 0; year <= todaysYear + 100; year++){
            if (year % 79 == 0){
                if (todaysYear - year <= 200)
                    System.out.println(year);
            }
        }

        // Задание №4
        System.out.println();
        for (i = 1; i <= 30; i++){
            System.out.print(i + ":");
            if (i % 3 == 0){
                System.out.print(" ping");
            }
            if (i % 5 == 0){
                System.out.print(" pong");
            }
            System.out.println();
        }

        //Задание №5
        int i1 = 0;
        int i2 = 1;
        int k;
        System.out.print("\n" + i1 + " " + i2);
        for (i = 0; i < 8; i++){
            k = i2;
            i1 += i2;
            System.out.print(" " + i1);
            i2 = i1;
            i1 = k;
        }

    }
}