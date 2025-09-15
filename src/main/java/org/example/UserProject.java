package org.example;

public class UserProject {
    String project_name;

    String background = "1";
    String purpose = "2";
    String goal = "3";

    UserProject (String set_project_name){
        this.project_name = set_project_name;
    }

    public void ProjectContent(){
        System.out.println("Background: " + background);
        System.out.println("Purpose: " + purpose);
        System.out.println("Goal: " + goal);
    }
}