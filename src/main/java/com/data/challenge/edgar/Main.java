package com.data.challenge.edgar;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Contents of input file: ");
        Files.lines(Paths.get(args[0])).forEach(System.out::println);
        IntStream intStream = Files.lines(Paths.get(args[1])).mapToInt(Integer::parseInt);
        OptionalInt first = intStream.findFirst();
        System.out.println("Inactivity period = " + first.orElse(-1));
    }
}
