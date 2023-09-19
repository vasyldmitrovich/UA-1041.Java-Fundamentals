package com.softserve.edu16.hw.hw02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Hw02 {
    public static void main(String[] args) throws IOException {
        var text1 = Path.of("./src./com./softserve./edu16./hw./hw02./code.txt");
        var text2 = Path.of("./src./com./softserve./edu16./hw./hw02./changeCode.txt");

        List<String> list = Files.lines(text1).toList();

        var replace = list.stream().map(l -> l.replace("public", "private")).toList();
        Files.write(Path.of(text2.toUri()), replace);
    }
}
