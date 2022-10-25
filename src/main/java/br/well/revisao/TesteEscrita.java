package br.well.revisao;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {


        FileOutputStream fos = new FileOutputStream("lorem-escrita.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");


        bw.close();
    }

}
