package edu16;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main2 {


        public static void main(String[] args) throws IOException {
            var code = Files.lines(Path.of("exampleCode.java")).toList();
            var changeCode = code.stream()
                    .map(s -> s.replaceAll("public", "private"))
                    .toList();
            Files.write(Path.of("changeCode.java"), changeCode);
        }
    }
