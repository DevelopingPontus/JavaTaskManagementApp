package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    String name;
    String password;

    User(String set_name, String set_password) {
        this.name = set_name;
        this.password = set_password;
    }

    public boolean login(String logg_in_password) {
        return logg_in_password.equals(password);
    }

    List<UserProject> user_projects = new ArrayList<>();

    public void UserCreateProject(String naming_project) {
        user_projects.add(new UserProject(naming_project));
    }

    public void PrintUserProjects() {
        int i = 1;

        for (UserProject u_p : user_projects) {
            System.out.println(i + "." + u_p.project_name);
            i += 1;
        }
    }
}

