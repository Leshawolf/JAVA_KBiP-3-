package zad1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String dir = "E:\\�������\\����� 3-�� ����\\Java\\����\\�������\\Laba8\\src\\zad1\\file.txt";
        File file1 = new File(dir);
        System.out.println(
                        "��� �����: "+ file1.getName()+
                        "\n������������ �������: " + file1.getParent() +
                        "\n����: " + file1.getPath() +
                        "\n������: " +file1.length() +
                        "\n��������� ��������������: " + file1.lastModified()
        );

        System.out.println("������ �� �����:");
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
