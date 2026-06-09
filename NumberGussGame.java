package CODSOFT;

import java.util.Random;
import java.util.Scanner;

public class NumberGussGame {
    int startNum = 0;
    int rangeNum = 10;
    Random r = new Random();
    Scanner s = new Scanner(System.in);

    public int getRandomumberGenerator() {
        return randomNumberGenerator(startNum, rangeNum);
    }

    public int getStartNum() {
        return startNum;
    }

    public int getRangeNum() {
        return rangeNum;
    }

    public void setStartNumber(int startNumber) {
        startNum = startNumber;
    }

    public void setRangeNumber(int rangeNumbre) {
        rangeNum = rangeNumbre;
    }

    private int randomNumberGenerator(int start, int range) {
        int num;
        if (range == 0 || start == 0) {
            num = r.nextInt(start, 10);
        } else {
            num = r.nextInt(range);
        }
        return num;
    }

    boolean start = true;

    public void display() {
        while (start) {
            System.out.println("===================");
            System.out.println("Number Gussing game");
            System.out.println("====================");
            System.out.println("Enter 'f' to start the game ");
            String f = s.next();
            if (f.equals("f")) {
                System.out.println("Options");
                System.err.println("========");
                System.out.println(" 1 . Start");
                System.out.println(" 2 . Settings");
                System.out.println(" 3 . Exit");
                int opp = s.nextInt();
                switch (opp) {
                    case 1 -> gameStart();
                    case 2 -> setSetting();
                    case 3 -> exit();
                }
            } else {
                exit();
            }
        }
    }

    void gameStart() {
        boolean run = true;
        System.out.println("=====================");
        System.out.println("    Number Guss Game");
        System.out.println("======================");
        int userNum = 0;
        int i = 1;
        int ineScore = 0;
        int degScore = 0;
        int genNum;
        while (run) {
            System.out.println("Game level");
            System.out.println("Number starts from " + getStartNum() + "  to  " + getRangeNum());
            System.out.println("Enter the number ( you have " + i + "/3) : ");
            userNum = s.nextInt();
            if (userNum >= getStartNum() && userNum <= getRangeNum()) {
                genNum = getRandomumberGenerator();
            } else {
                System.out.println("Enter the correct numbers");
                break;
            }
            // int genNum = getRandomumberGenerator();
            if (userNum == genNum) {
                System.out.println("Correct");
                ineScore++;
            } else {
                System.out.println("Your guss is wrong");
                degScore--;
                if (userNum < genNum) {
                    System.out.println("your guss is too high .....");
                }
                if (userNum > genNum) {
                    System.out.println("your guss is too low .....");
                }
            }
            if (i >= 3) {
                run = false;
                System.out.println("Your Score.....");
                System.out.println("Correct Answer : " + ineScore);
                System.out.println("Wrong Answer : " + degScore);

                System.out.println("Total Score : " + (ineScore - degScore));
                if (ineScore - degScore > 0) {
                    System.out.println("Status Good .....");
                } else {
                    System.out.println("Status Bad..........");
                }
            }
            i++;
        }
    }

    void setSetting() {
        System.out.println("Setting");
        System.out.println("Start Number " + getStartNum());
        System.out.println("Range Number : " + getRangeNum());
        System.out.println("Enter the starting number : ");
        int start = s.nextInt();
        System.out.println("Enter the range number : ");
        int range = s.nextInt();
        setStartNumber(start);
        setRangeNumber(range);
        System.out.println("updated Settings");
        System.out.println("Start Number " + getStartNum());
        System.out.println("Range Number : " + getRangeNum());
        display();
    }

    void exit() {
        start = false;
    }

    public static void main(String[] args) {
        NumberGussGame i = new NumberGussGame();
        i.display();
    }
}
