package com.wbl.helper;

import org.apache.http.Header;

public class RestResponce1 {
private int statuscode;
private String statusmessages;
private String payload;
private Header [] headers;
public int getStatuscode() {
	return statuscode;
}
public void setStatuscode(int statuscode) {
	this.statuscode = statuscode;
}
public String getStatusmessages() {
	return statusmessages;
}
public void setStatusmessages(String statusmessages) {
	this.statusmessages = statusmessages;
}
public String getPayload() {
	return payload;
}
public void setPayload(String payload) {
	this.payload = payload;
}
public Header[] getHeaders() {
	return headers;
}
public void setHeaders(Header[] headers) {
	this.headers = headers;
}

}
