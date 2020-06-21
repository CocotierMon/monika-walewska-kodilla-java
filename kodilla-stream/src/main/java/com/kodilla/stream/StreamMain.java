package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

            PoemBeautifier poemBeautifier = new PoemBeautifier();
            String text = "aaa";
            poemBeautifier.beautify(text,() -> "ABC"+text+"ABC");
            poemBeautifier.beautify(text, text::toUpperCase);
            poemBeautifier.beautify(text,()->"?!"+text+"!?");
            poemBeautifier.beautify(text,()->"..^-^.."+text+"..^*^..");
            poemBeautifier.beautify(text,()->"..U.U.."+text+"..O.O..");
            poemBeautifier.beautify(text,()->".. u .."+text+".. U ..");
        }
    }


