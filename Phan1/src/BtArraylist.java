import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BtArraylist {
	public ArrayList<String> DsHoten= new ArrayList<String>(); 
	public ArrayList<Double> DsDtb= new ArrayList<Double>(); 
	public void TaoDanhSach() {
	try{
	FileInputStream f= new FileInputStream ("sv.txt"); 
	InputStreamReader ir= new InputStreamReader(f); 
	BufferedReader r= new BufferedReader(ir);
	while(true){
		String st=r.readLine();
		if(st==""||st==null) break;
		String[] ds=st.split("[;]");
		DsHoten.add(ds[1]);
		DsDtb.add(Double.parseDouble(ds[3]));
	}
	r.close();
	}catch(Exception tt){
		System.out.println("Loi o ham XuatDanh sach: "+ tt.getMessage());
	}
	}
	public void XuatDanhSach()
	{
		int ss=DsHoten.size();
		for(int i=0;i<ss;i++)
		{
			System.out.println(DsHoten.get(i)+":"+DsDtb.get(i));
		}
	}
	public void TimKiem(String target) {
		try {
			int ss=DsHoten.size();
			for(int i=0;i<ss;i++)
			{
				if(DsHoten.get(i).toLowerCase().contains(target.toLowerCase())) {
					System.out.println(DsHoten.get(i)+":"+DsDtb.get(i));
				}
				
			}
		} catch (Exception e) {
			System.out.println("Loi o ham Tim Kiem" + e.getMessage());
			e.printStackTrace();
		}
	}
	public void ThongKeDauRot() {
		try {
			int ss=DsDtb.size();
			int cntd = 0;
			int cntr = 0;
			for(int i=0;i<ss;i++)
			{
				if(DsDtb.get(i) >= 5) {
					cntd++;
				}
				else {
					cntr++;
				}
				
			}
			System.out.println("**Sinh Vien**");
			System.out.println("Dau: "+ cntd);
			System.out.println("Rot: "+ cntr);
		} catch (Exception e) {
			System.out.println("Loi o ham Thong Ke" + e.getMessage());
			e.printStackTrace();
		}
	}
	public void TBC() {
		try {
			int ss=DsDtb.size();
			double tbc = 0.0;
			for(int i=0;i<ss;i++)
			{
				tbc+= DsDtb.get(i);
				
			}
			System.out.println("Trung Binh Cong: "+ (double)Math.round((tbc/10)*10)/10);

		} catch (Exception e) {
			System.out.println("Loi o ham Trung Binh Cong" + e.getMessage());
			e.printStackTrace();
		}
	}	
		
	
}
	