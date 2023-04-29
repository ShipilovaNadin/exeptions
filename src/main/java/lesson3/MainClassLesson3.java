package lesson3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class MainClassLesson3 {

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//Создайте метод doSomething(), который может быть источником одного из типов checked exceptions (тело самого метода
//прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().
    private static void doSomething() throws IOException {

    }

    private static void rwLine(Path pathRead, Path pathWrite) {

        try ( BufferedReader in = Files.newBufferedReader(pathRead);
              BufferedWriter out = Files.newBufferedWriter(pathWrite)){
            out.write(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
