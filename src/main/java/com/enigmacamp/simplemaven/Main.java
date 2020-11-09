package com.enigmacamp.simplemaven;

import com.enigmacamp.simplemaven.utils.ConsolePrinter;
import org.apache.commons.lang3.StringUtils;


public class Main {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        String word = "Hello World";
        String result = StringUtils.substring(word, 3);
        consolePrinter.print(result);
    }
}
