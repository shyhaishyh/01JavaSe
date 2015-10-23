package cn.wd.day02;

import java.util.Arrays;

public class index02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] word = {"a","c","u","b","e","p","f","z"};
		System.out.print("原字符序列：");
		for (int i = 0; i < word.length; i++) {
			System.out.print(" " + word[i]);
		}
		System.out.println();
		Arrays.sort(word);
		System.out.print("升序排列后：");
		for (int i = 0; i < word.length; i++) {
			System.out.print(" " + word[i]);
		}
		System.out.println();
		System.out.print("降序排列后：");
		for (int i = word.length-1; i >= 0; i--) {
			System.out.print(" " + word[i]);
		}
	}
}
