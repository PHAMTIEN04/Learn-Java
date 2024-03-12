package bean;

import java.util.Date;

public class XeOtoBean extends XeBean {
	private String bsx;
	private String ttv;
	private String ttr;
	public XeOtoBean(String bsx,Date tgv, Date tgr,  String ttv, String ttr) {
		super(tgv, tgr);
		this.bsx = bsx;
		this.ttv = ttv;
		this.ttr = ttr;
	}
	public String getBsx() {
		return bsx;
	}
	public void setBsx(String bsx) {
		this.bsx = bsx;
	}
	public String getTtv() {
		return ttv;
	}
	public void setTtv(String ttv) {
		this.ttv = ttv;
	}
	public String getTtr() {
		return ttr;
	}
	public void setTtr(String ttr) {
		this.ttr = ttr;
	}
	@Override
	public String toString() {
		return "bsx=" + bsx + super.toString() +", ttv=" + ttv + ", ttr=" + ttr;
	}
	
	
	
}
