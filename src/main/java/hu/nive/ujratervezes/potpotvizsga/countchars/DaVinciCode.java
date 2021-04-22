package hu.nive.ujratervezes.potpotvizsga.countchars;

import java.io.*;

public class DaVinciCode {

    public int encode(String fileName, char find) {
        if (find != '0' && find != '1' && find != 'x') {
            throw new IllegalArgumentException("Non valid character");
        }
        int result = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                result = processLine(find, result, line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File error", ioe);
        }
        return result;
    }

    private int processLine(char find, int result, String line) {
        for (char c : line.toCharArray()) {
            if (c == find) {
                result++;
            }
        }
        return result;
    }

}
