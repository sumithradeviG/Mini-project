package Commend;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("$");
        Scanner sc = new Scanner(System.in);
        System.out.print(folder.folderName+"> ");
        while (true) {
            String command = sc.nextLine();
            String commandSplited[] = command.split(" ");

            switch (commandSplited[0]) {
                case "mkdir":
                    folder.mkdir(commandSplited[1]);
                    System.out.print(folder.folderName+"> ");
                    continue;
                case "touch":
                    folder.touch(commandSplited[1]);
                    System.out.print(folder.folderName+"> ");
                    continue;
                case "ls":
                    folder.ls();
                    System.out.print(folder.folderName+"> ");
                    continue;
                case "cd":
                    folder = folder.cd(commandSplited[1]);
                    System.out.print(folder.folderName+"> ");
                    continue;
                default:
                    continue;
            }
        }

    }
}
