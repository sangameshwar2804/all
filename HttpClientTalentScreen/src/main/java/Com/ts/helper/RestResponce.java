package Com.ts.helper;

import org.apache.http.Header;

public class RestResponce {
private int statuscode;
private String statusmessage;
private String payload;
private Header[] header;
public int getStatuscode() {
	return statuscode;
}
public void setStatuscode(int statuscode) {
	this.statuscode = statuscode;
}
public String getStatusmessage() {
	return statusmessage;
}
public void setStatusmessage(String statusmessage) {
	this.statusmessage = statusmessage;
}
public String getPayload() {
	return payload;
}
public void setPayload(String payload) {
	this.payload = payload;
}
public Header[] getHeader() {
	return header;
}
public void setHeader(Header[] header) {
	this.header = header;
}	
}
