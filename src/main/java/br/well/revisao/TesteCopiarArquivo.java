package br.well.revisao;

import java.io.*;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {



        FileOutputStream fos = new FileOutputStream("lorem-escrita2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        InputStream fis = System.in;
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null && !linha.contains("exit")) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }


        br.close();
        bw.close();

    }

}
