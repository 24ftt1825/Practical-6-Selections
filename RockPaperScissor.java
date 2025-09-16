import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int)(Math.random() * 100) % 3; 
        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int user = input.nextInt();

        String[] names = {"rock", "paper", "scissor"};

        if (computer == 0 && user == 0)
            System.out.println("The computer is rock. You are rock. It is a draw.");
        if (computer == 0 && user == 1)
            System.out.println("The computer is rock. You are paper. You Win.");
        if (computer == 0 && user == 2)
            System.out.println("The computer is rock. You are scissor. You Lose.");

        if (computer == 1 && user == 0)
            System.out.println("The computer is paper. You are rock. You Lose.");
        if (computer == 1 && user == 1)
            System.out.println("The computer is paper. You are paper. It is a draw.");
        if (computer == 1 && user == 2)
            System.out.println("The computer is paper. You are scissor. You Win.");

        if (computer == 2 && user == 0)
            System.out.println("The computer is scissor. You are rock. You Win.");
        if (computer == 2 && user == 1)
            System.out.println("The computer is scissor. You are paper. You Lose.");
        if (computer == 2 && user == 2)
            System.out.println("The computer is scissor. You are scissor. It is a draw.");

        input.close();
    }
}