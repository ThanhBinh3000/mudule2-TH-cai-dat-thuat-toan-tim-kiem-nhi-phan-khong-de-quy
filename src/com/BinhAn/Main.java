package com.BinhAn;

import java.awt.*;

import static com.BinhAn.BinarySearch.binarySearch;
import static com.BinhAn.BinarySearch.list;

public class Main {

    public static void main(String[] args) {
	// write your code here
            System.out.println(binarySearch(list, 2));  
            System.out.println(binarySearch(list, 11));
            System.out.println(binarySearch(list, 79));
            System.out.println(binarySearch(list, 1));
            System.out.println(binarySearch(list, 5));
            System.out.println(binarySearch(list, 80));
    }
}
