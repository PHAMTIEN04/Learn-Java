package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XeBean {
	private Date tgv;
	private Date tgr;
	
	public XeBean(Date tgv, Date tgr) {
		super();
		this.tgv = tgv;
		this.tgr = tgr;
	}
	public Date getTgv() {
		return tgv;
	}
	public void setTgv(Date tgv) {
		this.tgv = tgv;
	}
	public Date getTgr() {
		return tgr;
	}
	public void setTgr(Date tgr) {
		this.tgr = tgr;
	}
	@Override
	public String toString() {
		String s = null;
		String sr = null;
		try {
			SimpleDateFormat dd = new SimpleDateFormat("HH:mm dd/MM/yyyy");
			s = dd.format(tgv);
			sr = dd.format(tgr);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ", tgv=" + s + ", tgr=" + sr;
	}
	
	

	
}
