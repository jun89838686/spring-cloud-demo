package com.java.test;

import java.util.Vector;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Vector<App> v = new Vector<>(10);
		for (int i = 1; i < 100; i++) {
			App o = new App();
			v.add(o);
			o = null;
		}
	}
}
