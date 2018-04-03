package com.data.challenge.edgar;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Contents of input file: ");

        Files.lines(Paths.get(args[0])).forEach(System.out::println);
        List<String> lines = Files.readAllLines(Paths.get(args[0]));

        System.out.println("Inactivity period : " + Files.lines(Paths.get(args[1]))
                .mapToInt(Integer::parseInt)
                .findFirst()
                .orElse(-1));

        Files.createFile(Paths.get(args[2]));

        Files.write(Paths.get(args[2]), lines);
    }
}
