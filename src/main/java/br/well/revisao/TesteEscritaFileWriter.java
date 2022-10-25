package br.well.revisao;

import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {




        BufferedWriter bw = new BufferedWriter(new FileWriter("lupos.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \n");
        bw.write("=> Tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");


        bw.close();
    }

}
