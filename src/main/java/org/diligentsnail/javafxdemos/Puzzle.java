package org.diligentsnail.javafxdemos;

/**
 * Из книги Java Puzzlers: Traps, Pitfalls, and Corner Cases by Joshua Bloch Neal Gafter
 * <p>
 * Puzzle 20: What's My Class?
 * https://www.amazon.com/Java-Puzzlers-Pitfalls-Corner-2005-07-04/dp/B00G09RU26
 */
public class Puzzle {
	public static void main(String[] args) {
		String name = Puzzle.class.getName();
		String source = ".";
		String replacement = "/";
		System.out.println(name.replaceAll(source, replacement) + ".class");
	}
}
