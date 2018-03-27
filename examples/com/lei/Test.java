package com.lei;
import java.io.File;
public class Test {

	public static void main(String[] args) {
		String dirs = "d:/b/c/d/e";
		File f = new File(dirs);
		boolean res = f.mkdirs();
		boolean existed = f.exists();
		System.out.println("Status:" + res + " Existed:" + existed);
		
	}

}
