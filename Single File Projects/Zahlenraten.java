import java.util.Scanner;

public class Zahlenraten {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean game_ended = true;
        int count = 0;

        while (true) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Raten Sie eine Zahl zwischen 1 und 100");
            while (true) {
                boolean correctInput = false;
                String number;
                int guess = 0;
                do {
                    number = scanner.nextLine();
                    try {
                        guess = Integer.parseInt(number);
                        if (guess >= 1 && guess <= 100) {
                            correctInput = true;
                        } else {
                            System.out.println("Falsche Eingabe. Bitte gib eine Zahl zwischen 1 und 100 ein.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Falsche Eingabe. Eingabe sollte eine Zahl sein.");
                    }
                } while (!correctInput);

                count++;
                if (count == 10) {
                    game_ended = false;
                    break;
                }
                if (guess == randomNumber) {
                    break;
                } else {
                    if (guess > randomNumber) {
                        System.out.println("Die gesuchte Zahl ist kleiner");
                    } else {
                        System.out.println("Die gesuchte Zahl ist grosser");
                    }
                }
            }

            if (game_ended) {
                System.out.println("\nSie haben gewonnen");
            }
            else {
                System.out.println("\nSie haben verloren");
            }

            boolean replay = true;
            System.out.println("Soll das Spiel erneut gestartet werden? (j/n)");
            while (true) {
                String restart = scanner.next();
                if (restart.equals("n") || restart.equals("N")) {
                    replay = false;
                    break;
                } else if (restart.equals("j") || restart.equals("J")) {
                    break;
                }else {
                    System.out.println("Falsche Eingabe");
                }
            }

            if (!replay) {
                System.out.println("Das Spiel wurde beendet");
                scanner.close();
                System.exit(0);
            }
        }
    }
}
