package main;

import config.ArgsParser;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArgsParser ag = new ArgsParser(args);
        System.out.println(ag.Bool());
        System.out.println(Arrays.toString(ag.Origin()));
    }
}