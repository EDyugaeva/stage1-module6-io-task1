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
            throw new MyRuntimeException("file not found exception");
        } catch (IOException e) {
            throw new MyRuntimeException("Other IO exception");
        }

        return parseList(list);
    }

    private Profile parseList(List<String> list) {
        String name = list.get(0).substring(6);
        int age = Integer.parseInt(list.get(1).substring(5));
        String email = list.get(2).substring(7);
        long phone = Long.parseLong(list.get(3).substring(7));

        return new Profile(name, age, email, phone);

    }


}
