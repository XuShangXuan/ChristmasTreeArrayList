package com.gjun.homework;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTreeArrayList {

	public static void main(String[] args) {
		
		/*
		 XXXXO
		 XXXOOO
		 XXOOOOO
		 XOOOOOOO
		 OOOOOOOOO
		 */
		
		List<List<String>> tree = createChristmasTree(5);

		for (List<String> s1 : tree) {
			for (String s2 : s1) {
				System.out.print(s2);
			}
			System.out.println();
		}

	}
	
	public static List<List<String>> createChristmasTree(int numbers){
		
		List<List<String>> tree = new ArrayList();
		List<String>[] ary = new ArrayList[numbers];

		for (int i = 0, countX = numbers - 1; i < numbers; i++, countX--) {

			ary[i] = new ArrayList();

			for (int j = 0; j < countX; j++) {
				ary[i].add("X");
			}

			for (int j = 0; j < numbers + i - countX; j++) {
				ary[i].add("O");
			}

			tree.add(ary[i]);
			
		}

		return tree;

	}

}
