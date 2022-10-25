package br.well.revisao;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException {



//        BufferedWriter bw = new BufferedWriter(new FileWriter("lupos.txt"));

        PrintStream printStream = new PrintStream("lupos2.txt");
        PrintWriter printWriter = new PrintWriter("lupos3.txt");



        printStream.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \n");
        printStream.println("=> Tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");


        printWriter.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \n");
        printWriter.println("=> Tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");


        printStream.close();
        printWriter.close();

    }

}
