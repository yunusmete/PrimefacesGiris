package com.mete.yunus.bean;



import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

//JSF Managed Bean
@ManagedBean
public class SayiBean {

	private double sayi;
	private Date tarih, bTarih;
	
	public String yonlendir(){
		FacesContext context = FacesContext.getCurrentInstance();
		if (!tarih.before(bTarih)) {
			bTarih = null;
			FacesMessage hataMesaj = new FacesMessage("Bitiþ tarihi baþlangýçtan sonra olmalý");
			context.addMessage(null, hataMesaj);
			return null;
		}else {
			return "sonuc";
		}
		
	}
	
	public double getSayi() {
		return sayi;
	}
	public void setSayi(double sayi) {
		this.sayi = sayi;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public Date getbTarih() {
		return bTarih;
	}

	public void setbTarih(Date bTarih) {
		this.bTarih = bTarih;
	}
	
	
	
	
}
