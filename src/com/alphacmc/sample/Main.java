package com.alphacmc.sample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String dispName = "world";

        if (args.length > 0 ) {
            dispName = args[0];
        }

        System.out.println("Hello" + " " + dispName + "!");
    }

}
