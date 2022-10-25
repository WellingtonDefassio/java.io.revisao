package br.well.revisao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNext()){

            String linha = scanner.nextLine();

            Scanner scannerLine = new Scanner(linha);
            scannerLine.useDelimiter(",");
            String a1 = scannerLine.next();
            String a2 = scannerLine.next();
            String a3 = scannerLine.next();
            String a4 = scannerLine.next();

            System.out.println(a1 + a2  + a3 + a4);


        }

        scanner.close();

    }
}
