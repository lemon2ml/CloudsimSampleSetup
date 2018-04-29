package org.cloudbus.cloudsim.examples.power.planetlab;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class All {

	/**
	 * 
	 */
	
	static void fillPara(String file) {
		
	}
	
	public static void main(String[] args)throws IOException {
		long start_time = new Date().getTime();
		
		Dvfs.main(args);
		
		IqrMc.main(args);
		IqrMmt.main(args);
		IqrMu.main(args);
		IqrRs.main(args);
		
		LrMc.main(args);
		LrMmt.main(args);
		LrMu.main(args);
		LrRs.main(args);
		
		LrrMc.main(args);
		LrrMmt.main(args);
		LrrMu.main(args);
		LrrRs.main(args);
		
		MadMc.main(args);
		MadMmt.main(args);
		MadMu.main(args);
		MadRs.main(args);
		
		long end_time = new Date().getTime();
		long time = (end_time - start_time)/1000;
		System.out.println("---");
		System.out.println("Total time:" + time + "√Î");
	}
	
	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	
/*
	public static void main(String[] args) throws IOException {
		
		String folder = "C:\\Users\\Administrator\\Desktop\\CloudSimSampleSetup\\examples\\org\\cloudbus\\cloudsim\\examples\\power\\planetlab";
		
		File dir = new File(folder);
		File[] files = dir.listFiles();
		for(File f : files) {
			if(f.isFile()) {
				String fstr = f.toString();
				System.out.println("file:"+fstr.substring(fstr.lastIndexOf("\\")+1,fstr.lastIndexOf(".")).toLowerCase());
				String file = fstr.substring(fstr.lastIndexOf("\\")+1,fstr.lastIndexOf(".")).toLowerCase();
				switch(file) {
					case "dvfs":
						String vmAllocationPolicy = file;
						String vmSelectionPolicy = "";
						String parameter = "";
						
						
					case "iqrmc":
					case "iqrmmt":
					case "iqrmu":
					case "iqrrs":
						
					case "lrmc":
					case "lrmmt":
					case "lrmu":
					case "lrrs":
						
					case "lrrmc":
					case "lrrmmt":
					case "lrrmu":
					case "lrrrs":
						
					case "madmc":
					case "madmmt":
					case "madmu":
					case "madrs":
			}
				
			}else {
				System.out.println("dir: "+f.toString());
			}
		}
		
		boolean enableOutput = true;
		boolean outputToFile = true;
		String inputFolder = All.class.getClassLoader().getResource("workload/planetlab").getPath();
		String outputFolder = "output";
		String workload = "20110303"; // PlanetLab workload
//		String vmAllocationPolicy = "dvfs"; // DVFS policy without VM migrations
//		String vmSelectionPolicy = "";
//		String parameter = "";
//
//		new PlanetLabRunner(
//				enableOutput,
//				outputToFile,
//				inputFolder,
//				outputFolder,
//				workload,
//				vmAllocationPolicy,
//				vmSelectionPolicy,
//				parameter);
	}
	*/
}
