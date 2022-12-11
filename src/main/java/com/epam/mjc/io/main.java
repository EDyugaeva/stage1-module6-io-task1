package com.epam.mjc.io;

import java.io.File;

public class main {

    public static void main(String args[]) {
        FileReader fr = new FileReader();
        File file = new File("C:\\Users\\ekate\\IdeaProjects\\stage1-module6-io-task1\\src\\main\\resources\\Profile.txt");
        fr.getDataFromFile(file);


    }
}
