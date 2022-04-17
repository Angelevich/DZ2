import java.util.Random;
import java.util.Scanner;

public class GUESS {

        public static void main(String[] args) {
            int compNumber = random();
            while (true){
                int humNumber = scan();
                if (humNumber == compNumber) {
                    System.out.println("Ты просто снайпер, обыграл машинку:(");
                    System.out.println("Будет желание заходи если, что...");
                    break;
                } else if (humNumber > compNumber) {
                    System.out.println("О-о-о, мое число меньше");
                    System.out.println("может еще разок?");
                } else {
                    System.out.println("М-м-м, мое чило больше");
                    System.out.println("неповезло,может еще разок");
                }

            }
        }
        public static int random() {
            Random newRandom = new Random();
            return newRandom.nextInt(10 ) +1;
        }
        public static int scan(){
            System.out.println("Приветствую земеля, хочеш попытать удачу? Введи число от 1 до 10" );
            System.out.println("Введи число сюда:" );
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
    }

