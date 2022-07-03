package zad6;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String dir = "E:\\Колледж\\Архив 3-ий курс\\Java\\Лабы\\Готовые\\Laba8\\src\\zad6\\f3.txt";
        String str = "";
        System.out.println("Введите 10 цифр: ");
        for(int i = 0; i<10;i++)
        {
            System.out.print("Число[" + i + "] : " );
            str+=in.nextLine() + " ";
        }
        writeFile(dir,str);

        System.out.println("Вывод с файла: \n" + readFile(dir));

        String strArr[] = readFile(dir).split(" ");
        int count = 0;
        for (int i = 0; i < strArr.length-1; i++) {
            if(strArr[i] != null)
                if(Integer.parseInt(strArr[i])>0)
                    count++;
        }
        System.out.println("Кол-во положительных чисел: " + count);
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
