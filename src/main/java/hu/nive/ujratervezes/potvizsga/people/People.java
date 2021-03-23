package hu.nive.ujratervezes.potvizsga.people;

import java.io.*;

public class People {
    public int getNumberOfMales(String s) {
        int men = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(s)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                if (row[4].equals("Male")) {
                    men++;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("No file", ioe);
        }
        return men;
    }
}
