package bean;

import java.util.Date;

public class XeDapBean extends XeBean {
	private String sovx;

	public XeDapBean( String sovx,Date tgv, Date tgr) {
		super(tgv, tgr);
		this.sovx = sovx;
	}

	public String getSovx() {
		return sovx;
	}

	public void setSovx(String sovx) {
		this.sovx = sovx;
	}

	@Override
	public String toString() {
		return "sovx=" + sovx + super.toString();
	}



	
}
