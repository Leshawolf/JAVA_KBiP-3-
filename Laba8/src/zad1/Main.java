package zad1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String dir = "E:\\Колледж\\Архив 3-ий курс\\Java\\Лабы\\Готовые\\Laba8\\src\\zad1\\file.txt";
        File file1 = new File(dir);
        System.out.println(
                        "Имя файла: "+ file1.getName()+
                        "\nРодительский каталог: " + file1.getParent() +
                        "\nПуть: " + file1.getPath() +
                        "\nРазмер: " +file1.length() +
                        "\nПоследнее редактирование: " + file1.lastModified()
        );

        System.out.println("Данеые из файла:");
        if(file1.canRead())
            System.out.println(readFile(dir));
        else
            System.out.println("Error");


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
