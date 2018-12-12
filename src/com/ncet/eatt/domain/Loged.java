package com.ncet.eatt.domain;

public class Loged {
private String un;
private int id;
private float att;
public Loged(String un, int id, float att) {
	super();
	this.un = un;
	this.id = id;
	this.att = att;
}

public String getUn() {
	return un;
}
public void setUn(String un) {
	this.un = un;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getAtt() {
	return att;
}
public void setAtt(float att) {
	this.att = att;
}


}
