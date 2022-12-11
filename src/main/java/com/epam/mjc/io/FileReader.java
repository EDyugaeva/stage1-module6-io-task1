package com.epam.mjc.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileReader {

    public Profile getDataFromFile(File file) {
        List<String> list = new ArrayList<>();

        try (
                BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(file.getAbsolutePath()))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                list.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String name = list.get(0).substring(6);
        int age = Integer.parseInt(list.get(1).substring(5));
        String email = list.get(2).substring(7);
        long phone = Long.parseLong(list.get(3).substring(7));

        Profile profile = new Profile(name, age, email, phone);

        System.out.println(profile.toString());
        return profile;
    }


}
