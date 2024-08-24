package com.collection.examples;

import java.util.Arrays;
import java.util.List;

public class SteamEg {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,14,16,30);
		
		//list.stream().filter((e)->e>10).forEach((e)->{System.out.println(e);});
		list.stream().filter((e)->e>10).reduce((e1,e2)->{ return e1>e2? e1:e2;});
	}
	

}
