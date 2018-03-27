package com.lei;

import java.io.*;

public class Output2File {
	
	
	public static boolean createFile(String filename) {
		int index =filename.lastIndexOf("/");
		String path = filename.substring(0, index);
		boolean res = false;
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		
		File file = new File(filename);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		res = file.exists();
		return res;
	}
	
	public static boolean writeFile(String file, String data){
		boolean res = false;
		BufferedWriter bw = null;
		File f = new File(file);
		try {
			bw = new BufferedWriter(new FileWriter(f.getAbsoluteFile(), Config.isAppendable));
			bw.write(data);
			bw.close();
			res = true;
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		String filename="d:/abc/efg/aaa.txt";
		String data = "aaaaaaaaaaa\r\n";
		Output2File of = new Output2File();
		if(of.createFile(filename)) {
			
			boolean writeSuccess = of.writeFile(filename, data);
			System.out.println(writeSuccess);
		}
	}

}














