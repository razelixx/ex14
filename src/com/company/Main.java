package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

// Необходимо написать программу, которая будет реализовывать следующие действия:
//1. Ввод числа с клавиатуры и запись его в строковую переменную S
//2. Конвертация строковой переменной S в числовую переменную X типа int
//3. Конвертация числа X типа int в число Y типа double
//Все три числа разных типов необходимо в столбик вывести на экран

    public static void main(String[] args) throws Exception{
        BufferedReader inString = new BufferedReader(new InputStreamReader(System.in));
        String S = inString.readLine();
        int X = Integer.parseInt(S);
        double Y = (double) X;

        System.out.println("Strting S = " + S);
        System.out.println("int X = " + X);
        System.out.println("double Y = " + Y);

    }
}
