import java.util.Calendar;

public class Estadia {
	

	private static int meses[];
	private static int quantHospedes;
	private static int quantHospMes;
	public static void somaHospede(){
	
		quantHospedes++;
		quantHospMes++;		
	}
	
	public static void subHospede(){
		quantHospedes--;
	}
	public static void fecharMes(){
		Calendar c = Calendar.getInstance();
		meses[c.get(Calendar.MONTH)]=quantHospMes;
		quantHospMes=0;
	}
}
