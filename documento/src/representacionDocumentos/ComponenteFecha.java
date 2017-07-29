package representacionDocumentos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ComponenteFecha extends Componente {
	private Date date;
	private Calendar calendar;

	public ComponenteFecha(Date date) {
		this.date = date;
		calendar = new GregorianCalendar();
		calendar.setTime(date);
	}
	
	@Override
	public String toString(){
		return calendar.get(Calendar.DAY_OF_MONTH) +"/"+ (calendar.get(Calendar.MONTH)+1) +"/"+ calendar.get(Calendar.YEAR);
	}
	
	public int nCaracteres(){
		String text = toString();
		return text.length();
	}
	
	public int nPalabras(){
		return 1;
	}
	
	public Componente copia(){
		ComponenteFecha cf = new ComponenteFecha(date);
		return cf;
	}
	
	
	

}
