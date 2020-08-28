package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Class1 {

    public static void main(String[] args) {
        //Block of  code goes here.
        Scanner input = new Scanner(System.in);
        System.out.print("Hi, how was your day yesterday? ");
        String n = input.nextLine();

        System.out.print("Well I'm glad to hear your day went " + n +" !");
    }
}

