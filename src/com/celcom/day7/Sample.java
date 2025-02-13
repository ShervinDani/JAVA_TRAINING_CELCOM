package com.celcom.day7;

import java.util.HashMap;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        HashMap<Integer, String> list = new HashMap<>();

        for (int i = 0; i < num1; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ", 2); 
            
            if (parts.length == 2) {
                int key = Integer.parseInt(parts[0]);
                String name = parts[1];
                list.put(key, name);
            }
        }

        int key = Integer.parseInt(sc.nextLine());
        System.out.println(list.getOrDefault(key, "-1"));  
    }
}
