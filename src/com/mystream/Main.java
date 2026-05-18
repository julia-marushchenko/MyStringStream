/**
 *  Java program to create a stream of String and characters.
 */

package com.mystream;

import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a stream with characters.
        IntStream streamOfChars = "abcdef".chars();

        // Printing characters from streamOfChars to console.
        streamOfChars.forEach(System.out::println);

        // Creating a stream of strings.
        Stream<String>  newStream = Pattern.compile(" ").splitAsStream("a b c d e f");

        // Printing elements from newStream to console.
        newStream.forEach(System.out::println);

    }
}