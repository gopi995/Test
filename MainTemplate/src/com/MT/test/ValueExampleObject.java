package com.MT.test;

public class ValueExampleObject {
	
	private String Sidemenuname;
    public String getSidemenuname() {
		return Sidemenuname;
	}

	public void setSidemenuname(String sidemenuname) {
		this.Sidemenuname = sidemenuname;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		this.URL = uRL;
	}

	private String URL;
    
    public ValueExampleObject(String Sidemenuname, String URL) {
        this.Sidemenuname = Sidemenuname;
        this.URL = URL;
    }

	
   
}