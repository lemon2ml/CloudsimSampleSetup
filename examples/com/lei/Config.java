package com.lei;

public final class Config {

	static java.util.Date d = new java.util.Date();
	
	public static String path="D:/CloudSimLog1/";
	public static String filename = "log_host_"+d.getTime()+".csv";
	public static double lambda = 3.0; 
	public static double randnum = 0.8;
	public static double vmrand = 0.9;
	
	public static String filename_vm = "log_vm_"+d.getTime()+".csv";
	public static double lambda_vm = 3.0; 
	
	public static String comma = ",";
	public static String LineSep = "\r\n";
	
	public static boolean isAppendable = true;
	
	public static int hostCount = 0;
	public static int vmCount = 0;
	
	public static double SIMULATION_LIMIT_MIPS = 100000.0;
	public static boolean isLimitMips = false;
	
	
	//data inconsistency simulation
	public static double probOfIC = 0.5;
	public static boolean isDataICHappen = true; 
	
	//timeout simulation
	public static double timeoutThreshold = 3000;
	public static boolean isTimeoutHappen = true;
	public static double timeoutCpuUtilization = 0.01;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}























