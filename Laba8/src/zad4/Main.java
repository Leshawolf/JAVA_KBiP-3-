package zad4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String dir = "E:\\Колледж\\Архив 3-ий курс\\Java\\Лабы\\Готовые\\Laba8\\src\\zad4\\temp.dat";

        System.out.println("Вывод с файла: \n" + readFile(dir));

        String strArr[] = readFile(dir).split(" ");
        double numArr[] = new double [15];
        int sum = 0;
        for (int i = 0; i < strArr.length-1; i++) {
            if(strArr[i] != null)
                numArr[i] = Double.parseDouble(strArr[i]);
            sum += numArr[i];
        }
        System.out.println("Среднее: " + (double)sum/15);
    }

    public static String readFile(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        try {
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }



}

