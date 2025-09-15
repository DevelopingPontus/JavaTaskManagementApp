package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        List<User> user = new ArrayList<>();
        user.add(new User("Pontus", "1234"));

        User active_user = null;
        boolean logging_in = true;
        while (logging_in) {
            System.out.println("Username: ");
            String username = scannerString.nextLine();
            System.out.println("Password: ");
            String password = scannerString.nextLine();

            for (User u : user) {
                if (username.equals(u.name)) {
                    if (u.login(password)) {
                        System.out.println("Access granted");
                        active_user = u;
                        logging_in = false;
                    }
                }
            }
        }

        boolean in_main_menu = true;
        while (in_main_menu) {
            System.out.println("Menu: 1.Projects, 0.Logout");
            int menu_input = scanner.nextInt();
            switch (menu_input) {
                case 0:
                    active_user = null;
                    in_main_menu = false;
                    break;
                case 1:
                    System.out.println("You have " + active_user.user_projects.toArray().length + " Projects");
                    System.out.println("ProjectsMenu: 1.Create Project, 2.Open Project, 0.Logout");
                    int projects_menu_input = scanner.nextInt();
                    switch (projects_menu_input) {
                        case 1:
                            System.out.println("Name the Project: ");
                            String name_the_project = scannerString.nextLine();
                            System.out.println(name_the_project);
                            active_user.UserCreateProject(name_the_project);
                            break;
                        case 2:
                            active_user.PrintUserProjects();
                            System.out.println("Project to open: ");
                            int user_projects_index = scanner.nextInt() - 1;
                            active_user.user_projects.get(user_projects_index).ProjectContent();
                            break;
                        case 0:
                            active_user = null;
                            in_main_menu = false;
                            break;

                    }
                    break;
            }
        }
    }
}


