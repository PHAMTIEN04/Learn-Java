package bean;

import java.util.Date;

public class XeMayBean extends XeBean {
	private String bsx;
	
	public XeMayBean(String bsx,Date tgv, Date tgr ) {
		super(tgv, tgr);
		this.bsx = bsx;
	}

	public String getBsx() {
		return bsx;
	}

	public void setBsx(String bsx) {
		this.bsx = bsx;
	}

	@Override
	public String toString() {
		return "bsx=" + bsx + super.toString() ;
	}


	
}
