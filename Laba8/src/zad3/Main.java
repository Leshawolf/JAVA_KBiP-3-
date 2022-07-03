package zad3;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String dir = "E:\\Колледж\\Архив 3-ий курс\\Java\\Лабы\\Готовые\\Laba8\\src\\zad3\\f2.txt";
        String str = "";
        String strChet = "";
        String strNeChet = "";

        for(int i = 0; i<10;i++)
        {
            str+= (0 + (int)(Math.random() * ((50 - 0) + 1))) + " ";
        }

        writeFile(dir,str);

        System.out.println("Вывод с файла: \n" + readFile(dir));

        String strArr[] = readFile(dir).split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length-1; i++) {
            if(strArr[i] != null)
                numArr[i] = Integer.parseInt(strArr[i]);
            if(numArr[i]%2 == 0)
                strChet+= numArr[i] + " ";
            else
                strNeChet+= numArr[i] + " ";
        }
        writeFile("E:\\Колледж\\Архив 3-ий курс\\Java\\Лабы\\Готовые\\Laba8\\src\\zad3\\g.txt",strChet);
        writeFile("E:\\Колледж\\Архив 3-ий курс\\Java\\Лабы\\Готовые\\Laba8\\src\\zad3\\h.txt",strNeChet);
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

