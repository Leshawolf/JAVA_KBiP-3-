package zad5;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String dirG = "E:\\Колледж\\Архив 3-ий курс\\Java\\Лабы\\Готовые\\Laba8\\src\\zad5\\g.txt";
        String dirF = "E:\\Колледж\\Архив 3-ий курс\\Java\\Лабы\\Готовые\\Laba8\\src\\zad5\\f2.txt";
        String strG = "";
        String strF = "";


        String strArr[] = readFile(dirG).split(" ");
        for (int i = 0; i < strArr.length-1; i++) {
            if(strArr[i] != null)
                strG += Integer.parseInt(strArr[i]) + " ";
        }

        String strArr2[] = readFile(dirF).split(" ");
        for (int i = 0; i < strArr2.length-1; i++) {
            if(strArr2[i] != null)
                strF += Integer.parseInt(strArr2[i]) + " ";
        }
        writeFile("E:\\Колледж\\Архив 3-ий курс\\Java\\Лабы\\Готовые\\Laba8\\src\\zad5\\h2.txt",strF+strG);
        System.out.println("Скопиравано!");
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

    public static void writeFile(String fileName, String text) {
        File file = new File(fileName);

        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

}

