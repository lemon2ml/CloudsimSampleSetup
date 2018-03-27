package com.lei;

public class Poisson {

	/**
	 * Implement of Poisson mass function 
	 * @param args
	 */
	public static double PMF(double lambda, double t, int k) {
		double pmf = 1;
		for(int i=1;i<=k;i++) {
			pmf*=lambda*t/i;
		}
		return pmf*Math.exp(-1.0*lambda*t);
	}
	
	public static int randP(double lambda, double t) {
		int k = 0;
		double u = Math.random();
		double cdf = Math.exp(-1.0*lambda*t);
		while(u>=cdf) {
			k++;
			cdf += PMF(lambda, t, k);
		}
		return k;
	}
	
	public static void main(String[] args) {

//		int N = 10000, randnum = 0;
//		double lambda = 30.0, t = 1.0, sum = 0.0, sum2 = 0.0;
//		double mean = 0.0, variance = 0.0;
//		for(int i=0;i<N;i++) {
//			randnum = randP(lambda, t);
//			System.out.println("randnum=" + randnum);
//			
//			sum+=randnum;
//			sum2+=Math.pow(randnum, 2.0);
//			
//		}
//		
//		mean = sum/N;
//		variance = sum2/N - Math.pow(mean, 2.0);
//		
//		System.out.println("The mean: " + mean);
//		System.out.println("The variance: " + variance);
//		
//		System.out.println("pmf(mean): " + PMF(lambda, t, (int)mean));
		
		
		double lambda = 3, t = 10.0;
		double sum = 0.0;
		for(int k=0;k<100;k++) {
			double pmf = PMF(lambda, t, k);
			if(k/10<1) {
				System.out.println("k: " + k + "  & pmf: " + String.format("%.5f", pmf)); 
			}else {
				System.out.println("k: " + k + " & pmf: " + String.format("%.5f", pmf));
				
			}
			
			sum += pmf;				
		}
		System.out.println("**********\nsum=" + sum);		
	}

}













