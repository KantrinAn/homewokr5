import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вкажіть назву першої команди");
        String nameTeamOne = scanner.nextLine();
        System.out.println("Вкажіть назву другої команди");
        String nameTeamTwo = scanner.nextLine();
        System.out.println("Вкажіть кількість фрагів першого гравця першої команди");
        int playerOneO = scanner.nextInt();
        System.out.println("Вкажіть кількість фрагів другого гравця першої команди");
        int playerTwoO = scanner.nextInt();
        System.out.println("Вкажіть кількість фрагів третього гравця першої команди");
        int playerThreeO = scanner.nextInt();
        System.out.println("Вкажіть кількість фрагів четвертого гравця першої команди");
        int playerFourO = scanner.nextInt();
        System.out.println("Вкажіть кількість фрагів п'ятого гравця першої команди");
        int playerFiveO = scanner.nextInt();
        System.out.println("Вкажіть кількість фрагів першого гравця другої команди");
        int playerOneT = scanner.nextInt();
        System.out.println("Вкажіть кількість фрагів другого гравця другої команди");
        int playerTwoT = scanner.nextInt();
        System.out.println("Вкажіть кількість фрагів третього гравця другої команди");
        int playerThreeT = scanner.nextInt();
        System.out.println("Вкажіть кількість фрагів четвертого гравця другої команди");
        int playerFourT = scanner.nextInt();
        System.out.println("Вкажіть кількість фрагів п'ятого гравця другої команди");
        int playerFiveT = scanner.nextInt();
        int resultTeamOne = (playerOneO + playerTwoO + playerThreeO + playerFourO + playerFiveO) / 5;
        int resultTeamTwo = (playerOneT + playerTwoT + playerThreeT + playerFourT + playerFiveT) / 5;
        if (resultTeamOne > resultTeamTwo) {
            System.out.println("Перемогла команда " + nameTeamOne + " набрала " + resultTeamOne + " очків");
        }  else if (resultTeamOne < resultTeamTwo) {
            System.out.println("Перемогла команда " + nameTeamTwo + " набрала " + resultTeamTwo + " очків");
        }
    }
}