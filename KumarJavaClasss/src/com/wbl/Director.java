package com.wbl;

public class Director extends Manager {
public String organization;
public String getDetals() {
	return id+""+name+" "+department+" "+organization;
}
}
