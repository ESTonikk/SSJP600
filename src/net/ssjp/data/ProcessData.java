package net.ssjp.data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;

public class ProcessData extends Data implements Serializable, Comparable<ProcessData>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9041221102726555600L;
	private String Datum;
	private String Uhrzeit;
	
	private String Zyklus;
	private String Zykluszeit;
	
	private String Einspritzzeit;
	private String Plastifizierzeit;
	
	private String TemperaturHeizzone1;
	private String TemperaturHeizzone2;
	private String TemperaturHeizzone3;
	private String TemperaturHeizzone4;
	private String TemperaturHeizzone5;
	private String TemperaturHeizzone6;
	private String TemperaturHeizzone7;
	private String TemperaturHeizzone8;
	private String TemperaturHeizzone9;
	private String TemperaturHeizzone10;
	
	private String Schmelzepolster;
	private String Plastifizierende;
	private String Werkzeugoffenposition;
	
	private String GeschwEinspritzenp0;
	private String GeschwEinspritzenp1;
	private String GeschwEinspritzenp2;
	private String GeschwEinspritzenp3;
	private String GeschwEinspritzenp4;
	private String GeschwEinspritzenp5;
	private String GeschwEinspritzenp6;
	private String GeschwEinspritzenp7;
	
	private String GeschwNachdruckBeginn;
	private String GeschwNachdruckEnde;
	
	private String DrehzahlPlastifizierenp1;
	private String DrehzahlPlastifizierenp2;
	private String DrehzahlPlastifizierenp3;
	private String DrehzahlPlastifizierenp4;
	private String DrehzahlPlastifizierenp5;
	private String DrehzahlPlastifizierenp6;
	private String DrehzahlPlastifizierenp7;
	
	private String HydraulikdruckEinspritzenp0;
	private String HydraulikdruckEinspritzenp1;
	private String HydraulikdruckEinspritzenp2;
	private String HydraulikdruckEinspritzenp3;
	private String HydraulikdruckEinspritzenp4;
	private String HydraulikdruckEinspritzenp5;
	private String HydraulikdruckEinspritzenp6;
	private String HydraulikdruckEinspritzenp7;

	private String WkzInnendruckEinspritzenp5;
	private String WkzInnendruckEinspritzenp6;
	private String WkzInnendruckEinspritzenp7;
	
	private String WkzInnendruckNachdruckbeginn;
	private String WkzInnendruckNachdruckp1;
	private String WkzInnendruckNachdruckp2;
	private String WkzInnendruckNachdruckp3;
	private String WkzInnendruckNachdruckp4;
	private String WkzInnendruckNachdruckp5;
	private String WkzInnendruckNachdruckp6;
	private String WkzInnendruckNachdruckp7;
	
	private String WkzInnendruckKuehlzeitende;
	private String WkzInnendruckMax;
	
	private String StaudruckPlastifizierenp1;
	private String StaudruckPlastifizierenp2;
	private String StaudruckPlastifizierenp3;
	private String StaudruckPlastifizierenp4;
	private String StaudruckPlastifizierenp5;
	private String StaudruckPlastifizierenp6;
	private String StaudruckPlastifizierenp7;
	
	private String Einzugstemperatur;
	
	private String Temperiergeraet1;
	private String Temperiergeraet2;
	private String Temperiergeraet3;
	private String Temperiergeraet4;
	
	private String HeisskanalRegelkreis1;
	private String HeisskanalRegelkreis2;
	private String HeisskanalRegelkreis3;
	private String HeisskanalRegelkreis4;
	private String HeisskanalRegelkreis5;
	private String HeisskanalRegelkreis6;
	private String HeisskanalRegelkreis7;
	private String HeisskanalRegelkreis8;
	
	private String Einspritzarbeit;
	private String Hüllkurve;
	private String SchraubImpulseKernA;
	private String SchraubImpulseKernB;
	private String Oeltemperatur;
	private String EnergiePumpenantrieb;
	private String EnergieHeizzonen;
	private String EnergieHeisskanaele;
	private String EnergieGesamt;
	
	private String EinspritzdruckMax;
	private String NachdruckMax;
	private String HydraulikdruckNachdruckstart;
	
	private String IndexToleranverletzung1;
	private String IndexToleranverletzung2;
	private String IndexToleranverletzung3;
	
	private String Wertenormierung;
	private String amerikanischeEinheiten;

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
	
	public LocalDateTime getDateTime(){
		if(this.getDatum() == "" && this.getUhrzeit()=="")
			return null;
		return LocalDateTime.parse(this.getDatum()+" "+this.getUhrzeit(), dtf);
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	  public ColumnPositionMappingStrategy getColumMapping(){
	      ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
	      strategy.setType(ProcessData.class);

	      String[] columns = new String[] {"Datum", "Uhrzeit", "Zyklus", "Zykluszeit", 
	    		  "Einspritzzeit", "Plastifizierzeit", "TemperaturHeizzone1", "TemperaturHeizzone2", 
	    		  "TemperaturHeizzone3", "TemperaturHeizzone4", "TemperaturHeizzone5", 
	    		  "Schmelzepolster", "Plastifizierende", "Werkzeugoffenposition", "Geschw.Einspritzenp0", 
	    		  "GeschwEinspritzenp1", "GeschwEinspritzenp2", "GeschwEinspritzenp3", 
	    		  "GeschwEinspritzenp4", "GeschwEinspritzenp5", "GeschwEinspritzenp6", 
	    		  "GeschwEinspritzenp7", "GeschwNachdruckBeginn", "Geschw.NachdruckEnde", 
	    		  "DrehzahlPlastifizierenp1", "DrehzahlPlastifizierenp2", "DrehzahlPlastifizierenp3", 
	    		  "DrehzahlPlastifizierenp4", "DrehzahlPlastifizierenp5", "DrehzahlPlastifizierenp6", 
	    		  "DrehzahlPlastifizierenp7", "HydraulikdruckEinspritzenp0", "HydraulikdruckEinspritzenp1",
	    		  "HydraulikdruckEinspritzenp2", "HydraulikdruckEinspritzenp3", "HydraulikdruckEinspritzenp4", 
	    		  "HydraulikdruckEinspritzenp5", "HydraulikdruckEinspritzenp6", "HydraulikdruckEinspritzenp7", 
	    		  "WkzInnendruckEinspritzenp5", "WkzInnendruckEinspritzenp6", "WkzInnendruckEinspritzenp7", 
	    		  "WkzInnendruckNachdruckbeginn", "WkzInnendruckNachdruckp1", "WkzInnendruckNachdruckp2", 
	    		  "WkzInnendruckNachdruckp3", "WkzInnendruckNachdruckp4", "WkzInnendruckNachdruckp5", 
	    		  "WkzInnendruckNachdruckp6", "WkzInnendruckNachdruckp7", "WkzInnendruckKuehlzeitende", 
	    		  "WkzInnendruckMax", "StaudruckPlastifizierenp1", "StaudruckPlastifizierenp2", 
	    		  "StaudruckPlastifizierenp3", "StaudruckPlastifizierenp4", "StaudruckPlastifizierenp5", 
	    		  "StaudruckPlastifizierenp6", "StaudruckPlastifizierenp7", "Einzugstemperatur", 
	    		  "TemperaturHeizzone6", "Temperiergeraet1", "Temperiergeraet2", "Temperiergeraet3", 
	    		  "Temperiergeraet4", "HeisskanalRegelkreis1", "HeisskanalRegelkreis2", "HeisskanalRegelkreis3", 
	    		  "HeisskanalRegelkreis4", "HeisskanalRegelkreis5", "HeisskanalRegelkreis6", 
	    		  "HeisskanalRegelkreis7", "HeisskanalRegelkreis8", "Einspritzarbeit", "Huellkurve", 
	    		  "TemperaturHeizzone7", "TemperaturHeizzone8", "TemperaturHeizzone9", "TemperaturHeizzone10", 
	    		  "SchraubImpulseKernA", "SchraubImpulseKernB", "Oeltemperatur", "EnergiePumpenantrieb", 
	    		  "EnergieHeizzonen", "EnergieHeisskanaele", "Gesamtenergie", "EinspritzdruckMax", "NachdruckMax", 
	    		  "HydraulikdruckNachdruckstart", "IndexToleranzverletzung1", "IndexToleranzverletzung2", 
	    		  "IndexToleranzverletzung3", "Wertenormierung", "amerikanischeEinheiten"}; 
	      strategy.setColumnMapping(columns);
	      return strategy;
	   }
	/**
	 * @return the datum
	 */
	public String getDatum() {
		return Datum;
	}
	/**
	 * @param datum the datum to set
	 */
	public void setDatum(String datum) {
		Datum = datum;
	}
	/**
	 * @return the uhrzeit
	 */
	public String getUhrzeit() {
		return Uhrzeit;
	}
	/**
	 * @param uhrzeit the uhrzeit to set
	 */
	public void setUhrzeit(String uhrzeit) {
		Uhrzeit = uhrzeit;
	}
	/**
	 * @return the zyklus
	 */
	public String getZyklus() {
		return Zyklus;
	}
	/**
	 * @param zyklus the zyklus to set
	 */
	public void setZyklus(String zyklus) {
		Zyklus = zyklus;
	}
	/**
	 * @return the zykluszeit
	 */
	public String getZykluszeit() {
		return Zykluszeit;
	}
	/**
	 * @param zykluszeit the zykluszeit to set
	 */
	public void setZykluszeit(String zykluszeit) {
		Zykluszeit = zykluszeit;
	}
	/**
	 * @return the einspritzzeit
	 */
	public String getEinspritzzeit() {
		return Einspritzzeit;
	}
	/**
	 * @param einspritzzeit the einspritzzeit to set
	 */
	public void setEinspritzzeit(String einspritzzeit) {
		Einspritzzeit = einspritzzeit;
	}
	/**
	 * @return the plastifizierzeit
	 */
	public String getPlastifizierzeit() {
		return Plastifizierzeit;
	}
	/**
	 * @param plastifizierzeit the plastifizierzeit to set
	 */
	public void setPlastifizierzeit(String plastifizierzeit) {
		Plastifizierzeit = plastifizierzeit;
	}
	/**
	 * @return the temperaturHeizzone1
	 */
	public String getTemperaturHeizzone1() {
		return TemperaturHeizzone1;
	}
	/**
	 * @param temperaturHeizzone1 the temperaturHeizzone1 to set
	 */
	public void setTemperaturHeizzone1(String temperaturHeizzone1) {
		TemperaturHeizzone1 = temperaturHeizzone1;
	}
	/**
	 * @return the temperaturHeizzone2
	 */
	public String getTemperaturHeizzone2() {
		return TemperaturHeizzone2;
	}
	/**
	 * @param temperaturHeizzone2 the temperaturHeizzone2 to set
	 */
	public void setTemperaturHeizzone2(String temperaturHeizzone2) {
		TemperaturHeizzone2 = temperaturHeizzone2;
	}
	/**
	 * @return the temperaturHeizzone3
	 */
	public String getTemperaturHeizzone3() {
		return TemperaturHeizzone3;
	}
	/**
	 * @param temperaturHeizzone3 the temperaturHeizzone3 to set
	 */
	public void setTemperaturHeizzone3(String temperaturHeizzone3) {
		TemperaturHeizzone3 = temperaturHeizzone3;
	}
	/**
	 * @return the temperaturHeizzone4
	 */
	public String getTemperaturHeizzone4() {
		return TemperaturHeizzone4;
	}
	/**
	 * @param temperaturHeizzone4 the temperaturHeizzone4 to set
	 */
	public void setTemperaturHeizzone4(String temperaturHeizzone4) {
		TemperaturHeizzone4 = temperaturHeizzone4;
	}
	/**
	 * @return the temperaturHeizzone5
	 */
	public String getTemperaturHeizzone5() {
		return TemperaturHeizzone5;
	}
	/**
	 * @param temperaturHeizzone5 the temperaturHeizzone5 to set
	 */
	public void setTemperaturHeizzone5(String temperaturHeizzone5) {
		TemperaturHeizzone5 = temperaturHeizzone5;
	}
	/**
	 * @return the temperaturHeizzone6
	 */
	public String getTemperaturHeizzone6() {
		return TemperaturHeizzone6;
	}
	/**
	 * @param temperaturHeizzone6 the temperaturHeizzone6 to set
	 */
	public void setTemperaturHeizzone6(String temperaturHeizzone6) {
		TemperaturHeizzone6 = temperaturHeizzone6;
	}
	/**
	 * @return the temperaturHeizzone7
	 */
	public String getTemperaturHeizzone7() {
		return TemperaturHeizzone7;
	}
	/**
	 * @param temperaturHeizzone7 the temperaturHeizzone7 to set
	 */
	public void setTemperaturHeizzone7(String temperaturHeizzone7) {
		TemperaturHeizzone7 = temperaturHeizzone7;
	}
	/**
	 * @return the temperaturHeizzone8
	 */
	public String getTemperaturHeizzone8() {
		return TemperaturHeizzone8;
	}
	/**
	 * @param temperaturHeizzone8 the temperaturHeizzone8 to set
	 */
	public void setTemperaturHeizzone8(String temperaturHeizzone8) {
		TemperaturHeizzone8 = temperaturHeizzone8;
	}
	/**
	 * @return the temperaturHeizzone9
	 */
	public String getTemperaturHeizzone9() {
		return TemperaturHeizzone9;
	}
	/**
	 * @param temperaturHeizzone9 the temperaturHeizzone9 to set
	 */
	public void setTemperaturHeizzone9(String temperaturHeizzone9) {
		TemperaturHeizzone9 = temperaturHeizzone9;
	}
	/**
	 * @return the temperaturHeizzone10
	 */
	public String getTemperaturHeizzone10() {
		return TemperaturHeizzone10;
	}
	/**
	 * @param temperaturHeizzone10 the temperaturHeizzone10 to set
	 */
	public void setTemperaturHeizzone10(String temperaturHeizzone10) {
		TemperaturHeizzone10 = temperaturHeizzone10;
	}
	/**
	 * @return the schmelzepolster
	 */
	public String getSchmelzepolster() {
		return Schmelzepolster;
	}
	/**
	 * @param schmelzepolster the schmelzepolster to set
	 */
	public void setSchmelzepolster(String schmelzepolster) {
		Schmelzepolster = schmelzepolster;
	}
	/**
	 * @return the plastifizierende
	 */
	public String getPlastifizierende() {
		return Plastifizierende;
	}
	/**
	 * @param plastifizierende the plastifizierende to set
	 */
	public void setPlastifizierende(String plastifizierende) {
		Plastifizierende = plastifizierende;
	}
	/**
	 * @return the werkzeugoffenposition
	 */
	public String getWerkzeugoffenposition() {
		return Werkzeugoffenposition;
	}
	/**
	 * @param werkzeugoffenposition the werkzeugoffenposition to set
	 */
	public void setWerkzeugoffenposition(String werkzeugoffenposition) {
		Werkzeugoffenposition = werkzeugoffenposition;
	}
	/**
	 * @return the geschwEinspritzenp0
	 */
	public String getGeschwEinspritzenp0() {
		return GeschwEinspritzenp0;
	}
	/**
	 * @param geschwEinspritzenp0 the geschwEinspritzenp0 to set
	 */
	public void setGeschwEinspritzenp0(String geschwEinspritzenp0) {
		GeschwEinspritzenp0 = geschwEinspritzenp0;
	}
	/**
	 * @return the geschwEinspritzenp1
	 */
	public String getGeschwEinspritzenp1() {
		return GeschwEinspritzenp1;
	}
	/**
	 * @param geschwEinspritzenp1 the geschwEinspritzenp1 to set
	 */
	public void setGeschwEinspritzenp1(String geschwEinspritzenp1) {
		GeschwEinspritzenp1 = geschwEinspritzenp1;
	}
	/**
	 * @return the geschwEinspritzenp2
	 */
	public String getGeschwEinspritzenp2() {
		return GeschwEinspritzenp2;
	}
	/**
	 * @param geschwEinspritzenp2 the geschwEinspritzenp2 to set
	 */
	public void setGeschwEinspritzenp2(String geschwEinspritzenp2) {
		GeschwEinspritzenp2 = geschwEinspritzenp2;
	}
	/**
	 * @return the geschwEinspritzenp3
	 */
	public String getGeschwEinspritzenp3() {
		return GeschwEinspritzenp3;
	}
	/**
	 * @param geschwEinspritzenp3 the geschwEinspritzenp3 to set
	 */
	public void setGeschwEinspritzenp3(String geschwEinspritzenp3) {
		GeschwEinspritzenp3 = geschwEinspritzenp3;
	}
	/**
	 * @return the geschwEinspritzenp4
	 */
	public String getGeschwEinspritzenp4() {
		return GeschwEinspritzenp4;
	}
	/**
	 * @param geschwEinspritzenp4 the geschwEinspritzenp4 to set
	 */
	public void setGeschwEinspritzenp4(String geschwEinspritzenp4) {
		GeschwEinspritzenp4 = geschwEinspritzenp4;
	}
	/**
	 * @return the geschwEinspritzenp5
	 */
	public String getGeschwEinspritzenp5() {
		return GeschwEinspritzenp5;
	}
	/**
	 * @param geschwEinspritzenp5 the geschwEinspritzenp5 to set
	 */
	public void setGeschwEinspritzenp5(String geschwEinspritzenp5) {
		GeschwEinspritzenp5 = geschwEinspritzenp5;
	}
	/**
	 * @return the geschwEinspritzenp6
	 */
	public String getGeschwEinspritzenp6() {
		return GeschwEinspritzenp6;
	}
	/**
	 * @param geschwEinspritzenp6 the geschwEinspritzenp6 to set
	 */
	public void setGeschwEinspritzenp6(String geschwEinspritzenp6) {
		GeschwEinspritzenp6 = geschwEinspritzenp6;
	}
	/**
	 * @return the geschwEinspritzenp7
	 */
	public String getGeschwEinspritzenp7() {
		return GeschwEinspritzenp7;
	}
	/**
	 * @param geschwEinspritzenp7 the geschwEinspritzenp7 to set
	 */
	public void setGeschwEinspritzenp7(String geschwEinspritzenp7) {
		GeschwEinspritzenp7 = geschwEinspritzenp7;
	}
	/**
	 * @return the geschwNachdruckBeginn
	 */
	public String getGeschwNachdruckBeginn() {
		return GeschwNachdruckBeginn;
	}
	/**
	 * @param geschwNachdruckBeginn the geschwNachdruckBeginn to set
	 */
	public void setGeschwNachdruckBeginn(String geschwNachdruckBeginn) {
		GeschwNachdruckBeginn = geschwNachdruckBeginn;
	}
	/**
	 * @return the geschwNachdruckEnde
	 */
	public String getGeschwNachdruckEnde() {
		return GeschwNachdruckEnde;
	}
	/**
	 * @param geschwNachdruckEnde the geschwNachdruckEnde to set
	 */
	public void setGeschwNachdruckEnde(String geschwNachdruckEnde) {
		GeschwNachdruckEnde = geschwNachdruckEnde;
	}
	/**
	 * @return the drehzahlPlastifizierenp1
	 */
	public String getDrehzahlPlastifizierenp1() {
		return DrehzahlPlastifizierenp1;
	}
	/**
	 * @param drehzahlPlastifizierenp1 the drehzahlPlastifizierenp1 to set
	 */
	public void setDrehzahlPlastifizierenp1(String drehzahlPlastifizierenp1) {
		DrehzahlPlastifizierenp1 = drehzahlPlastifizierenp1;
	}
	/**
	 * @return the drehzahlPlastifizierenp2
	 */
	public String getDrehzahlPlastifizierenp2() {
		return DrehzahlPlastifizierenp2;
	}
	/**
	 * @param drehzahlPlastifizierenp2 the drehzahlPlastifizierenp2 to set
	 */
	public void setDrehzahlPlastifizierenp2(String drehzahlPlastifizierenp2) {
		DrehzahlPlastifizierenp2 = drehzahlPlastifizierenp2;
	}
	/**
	 * @return the drehzahlPlastifizierenp3
	 */
	public String getDrehzahlPlastifizierenp3() {
		return DrehzahlPlastifizierenp3;
	}
	/**
	 * @param drehzahlPlastifizierenp3 the drehzahlPlastifizierenp3 to set
	 */
	public void setDrehzahlPlastifizierenp3(String drehzahlPlastifizierenp3) {
		DrehzahlPlastifizierenp3 = drehzahlPlastifizierenp3;
	}
	/**
	 * @return the drehzahlPlastifizierenp4
	 */
	public String getDrehzahlPlastifizierenp4() {
		return DrehzahlPlastifizierenp4;
	}
	/**
	 * @param drehzahlPlastifizierenp4 the drehzahlPlastifizierenp4 to set
	 */
	public void setDrehzahlPlastifizierenp4(String drehzahlPlastifizierenp4) {
		DrehzahlPlastifizierenp4 = drehzahlPlastifizierenp4;
	}
	/**
	 * @return the drehzahlPlastifizierenp5
	 */
	public String getDrehzahlPlastifizierenp5() {
		return DrehzahlPlastifizierenp5;
	}
	/**
	 * @param drehzahlPlastifizierenp5 the drehzahlPlastifizierenp5 to set
	 */
	public void setDrehzahlPlastifizierenp5(String drehzahlPlastifizierenp5) {
		DrehzahlPlastifizierenp5 = drehzahlPlastifizierenp5;
	}
	/**
	 * @return the drehzahlPlastifizierenp6
	 */
	public String getDrehzahlPlastifizierenp6() {
		return DrehzahlPlastifizierenp6;
	}
	/**
	 * @param drehzahlPlastifizierenp6 the drehzahlPlastifizierenp6 to set
	 */
	public void setDrehzahlPlastifizierenp6(String drehzahlPlastifizierenp6) {
		DrehzahlPlastifizierenp6 = drehzahlPlastifizierenp6;
	}
	/**
	 * @return the drehzahlPlastifizierenp7
	 */
	public String getDrehzahlPlastifizierenp7() {
		return DrehzahlPlastifizierenp7;
	}
	/**
	 * @param drehzahlPlastifizierenp7 the drehzahlPlastifizierenp7 to set
	 */
	public void setDrehzahlPlastifizierenp7(String drehzahlPlastifizierenp7) {
		DrehzahlPlastifizierenp7 = drehzahlPlastifizierenp7;
	}
	/**
	 * @return the hydraulikdruckEinspritzenp0
	 */
	public String getHydraulikdruckEinspritzenp0() {
		return HydraulikdruckEinspritzenp0;
	}
	/**
	 * @param hydraulikdruckEinspritzenp0 the hydraulikdruckEinspritzenp0 to set
	 */
	public void setHydraulikdruckEinspritzenp0(String hydraulikdruckEinspritzenp0) {
		HydraulikdruckEinspritzenp0 = hydraulikdruckEinspritzenp0;
	}
	/**
	 * @return the hydraulikdruckEinspritzenp1
	 */
	public String getHydraulikdruckEinspritzenp1() {
		return HydraulikdruckEinspritzenp1;
	}
	/**
	 * @param hydraulikdruckEinspritzenp1 the hydraulikdruckEinspritzenp1 to set
	 */
	public void setHydraulikdruckEinspritzenp1(String hydraulikdruckEinspritzenp1) {
		HydraulikdruckEinspritzenp1 = hydraulikdruckEinspritzenp1;
	}
	/**
	 * @return the hydraulikdruckEinspritzenp2
	 */
	public String getHydraulikdruckEinspritzenp2() {
		return HydraulikdruckEinspritzenp2;
	}
	/**
	 * @param hydraulikdruckEinspritzenp2 the hydraulikdruckEinspritzenp2 to set
	 */
	public void setHydraulikdruckEinspritzenp2(String hydraulikdruckEinspritzenp2) {
		HydraulikdruckEinspritzenp2 = hydraulikdruckEinspritzenp2;
	}
	/**
	 * @return the hydraulikdruckEinspritzenp3
	 */
	public String getHydraulikdruckEinspritzenp3() {
		return HydraulikdruckEinspritzenp3;
	}
	/**
	 * @param hydraulikdruckEinspritzenp3 the hydraulikdruckEinspritzenp3 to set
	 */
	public void setHydraulikdruckEinspritzenp3(String hydraulikdruckEinspritzenp3) {
		HydraulikdruckEinspritzenp3 = hydraulikdruckEinspritzenp3;
	}
	/**
	 * @return the hydraulikdruckEinspritzenp4
	 */
	public String getHydraulikdruckEinspritzenp4() {
		return HydraulikdruckEinspritzenp4;
	}
	/**
	 * @param hydraulikdruckEinspritzenp4 the hydraulikdruckEinspritzenp4 to set
	 */
	public void setHydraulikdruckEinspritzenp4(String hydraulikdruckEinspritzenp4) {
		HydraulikdruckEinspritzenp4 = hydraulikdruckEinspritzenp4;
	}
	/**
	 * @return the hydraulikdruckEinspritzenp6
	 */
	public String getHydraulikdruckEinspritzenp6() {
		return HydraulikdruckEinspritzenp6;
	}
	/**
	 * @param hydraulikdruckEinspritzenp6 the hydraulikdruckEinspritzenp6 to set
	 */
	public void setHydraulikdruckEinspritzenp6(String hydraulikdruckEinspritzenp6) {
		HydraulikdruckEinspritzenp6 = hydraulikdruckEinspritzenp6;
	}
	/**
	 * @return the hydraulikdruckEinspritzenp7
	 */
	public String getHydraulikdruckEinspritzenp7() {
		return HydraulikdruckEinspritzenp7;
	}
	/**
	 * @param hydraulikdruckEinspritzenp7 the hydraulikdruckEinspritzenp7 to set
	 */
	public void setHydraulikdruckEinspritzenp7(String hydraulikdruckEinspritzenp7) {
		HydraulikdruckEinspritzenp7 = hydraulikdruckEinspritzenp7;
	}
	/**
	 * @return the wkzInnendruckEinspritzenp5
	 */
	public String getWkzInnendruckEinspritzenp5() {
		return WkzInnendruckEinspritzenp5;
	}
	/**
	 * @param wkzInnendruckEinspritzenp5 the wkzInnendruckEinspritzenp5 to set
	 */
	public void setWkzInnendruckEinspritzenp5(String wkzInnendruckEinspritzenp5) {
		WkzInnendruckEinspritzenp5 = wkzInnendruckEinspritzenp5;
	}
	/**
	 * @return the wkzInnendruckEinspritzenp6
	 */
	public String getWkzInnendruckEinspritzenp6() {
		return WkzInnendruckEinspritzenp6;
	}
	/**
	 * @param wkzInnendruckEinspritzenp6 the wkzInnendruckEinspritzenp6 to set
	 */
	public void setWkzInnendruckEinspritzenp6(String wkzInnendruckEinspritzenp6) {
		WkzInnendruckEinspritzenp6 = wkzInnendruckEinspritzenp6;
	}
	/**
	 * @return the wkzInnendruckEinspritzenp7
	 */
	public String getWkzInnendruckEinspritzenp7() {
		return WkzInnendruckEinspritzenp7;
	}
	/**
	 * @param wkzInnendruckEinspritzenp7 the wkzInnendruckEinspritzenp7 to set
	 */
	public void setWkzInnendruckEinspritzenp7(String wkzInnendruckEinspritzenp7) {
		WkzInnendruckEinspritzenp7 = wkzInnendruckEinspritzenp7;
	}
	/**
	 * @return the wkzInnendruckNachdruckbeginn
	 */
	public String getWkzInnendruckNachdruckbeginn() {
		return WkzInnendruckNachdruckbeginn;
	}
	/**
	 * @param wkzInnendruckNachdruckbeginn the wkzInnendruckNachdruckbeginn to set
	 */
	public void setWkzInnendruckNachdruckbeginn(String wkzInnendruckNachdruckbeginn) {
		WkzInnendruckNachdruckbeginn = wkzInnendruckNachdruckbeginn;
	}
	/**
	 * @return the wkzInnendruckNachdruckp1
	 */
	public String getWkzInnendruckNachdruckp1() {
		return WkzInnendruckNachdruckp1;
	}
	/**
	 * @param wkzInnendruckNachdruckp1 the wkzInnendruckNachdruckp1 to set
	 */
	public void setWkzInnendruckNachdruckp1(String wkzInnendruckNachdruckp1) {
		WkzInnendruckNachdruckp1 = wkzInnendruckNachdruckp1;
	}
	/**
	 * @return the wkzInnendruckNachdruckp2
	 */
	public String getWkzInnendruckNachdruckp2() {
		return WkzInnendruckNachdruckp2;
	}
	/**
	 * @param wkzInnendruckNachdruckp2 the wkzInnendruckNachdruckp2 to set
	 */
	public void setWkzInnendruckNachdruckp2(String wkzInnendruckNachdruckp2) {
		WkzInnendruckNachdruckp2 = wkzInnendruckNachdruckp2;
	}
	/**
	 * @return the wkzInnendruckNachdruckp3
	 */
	public String getWkzInnendruckNachdruckp3() {
		return WkzInnendruckNachdruckp3;
	}
	/**
	 * @param wkzInnendruckNachdruckp3 the wkzInnendruckNachdruckp3 to set
	 */
	public void setWkzInnendruckNachdruckp3(String wkzInnendruckNachdruckp3) {
		WkzInnendruckNachdruckp3 = wkzInnendruckNachdruckp3;
	}
	/**
	 * @return the wkzInnendruckNachdruckp4
	 */
	public String getWkzInnendruckNachdruckp4() {
		return WkzInnendruckNachdruckp4;
	}
	/**
	 * @param wkzInnendruckNachdruckp4 the wkzInnendruckNachdruckp4 to set
	 */
	public void setWkzInnendruckNachdruckp4(String wkzInnendruckNachdruckp4) {
		WkzInnendruckNachdruckp4 = wkzInnendruckNachdruckp4;
	}
	/**
	 * @return the wkzInnendruckNachdruckp5
	 */
	public String getWkzInnendruckNachdruckp5() {
		return WkzInnendruckNachdruckp5;
	}
	/**
	 * @param wkzInnendruckNachdruckp5 the wkzInnendruckNachdruckp5 to set
	 */
	public void setWkzInnendruckNachdruckp5(String wkzInnendruckNachdruckp5) {
		WkzInnendruckNachdruckp5 = wkzInnendruckNachdruckp5;
	}
	/**
	 * @return the wkzInnendruckNachdruckp6
	 */
	public String getWkzInnendruckNachdruckp6() {
		return WkzInnendruckNachdruckp6;
	}
	/**
	 * @param wkzInnendruckNachdruckp6 the wkzInnendruckNachdruckp6 to set
	 */
	public void setWkzInnendruckNachdruckp6(String wkzInnendruckNachdruckp6) {
		WkzInnendruckNachdruckp6 = wkzInnendruckNachdruckp6;
	}
	/**
	 * @return the wkzInnendruckNachdruckp7
	 */
	public String getWkzInnendruckNachdruckp7() {
		return WkzInnendruckNachdruckp7;
	}
	/**
	 * @param wkzInnendruckNachdruckp7 the wkzInnendruckNachdruckp7 to set
	 */
	public void setWkzInnendruckNachdruckp7(String wkzInnendruckNachdruckp7) {
		WkzInnendruckNachdruckp7 = wkzInnendruckNachdruckp7;
	}
	/**
	 * @return the wkzInnendruckKuehlzeitende
	 */
	public String getWkzInnendruckKuehlzeitende() {
		return WkzInnendruckKuehlzeitende;
	}
	/**
	 * @param wkzInnendruckKuehlzeitende the wkzInnendruckKuehlzeitende to set
	 */
	public void setWkzInnendruckKuehlzeitende(String wkzInnendruckKuehlzeitende) {
		WkzInnendruckKuehlzeitende = wkzInnendruckKuehlzeitende;
	}
	/**
	 * @return the wkzInnendruckMax
	 */
	public String getWkzInnendruckMax() {
		return WkzInnendruckMax;
	}
	/**
	 * @param wkzInnendruckMax the wkzInnendruckMax to set
	 */
	public void setWkzInnendruckMax(String wkzInnendruckMax) {
		WkzInnendruckMax = wkzInnendruckMax;
	}
	/**
	 * @return the staudruckPlastifizierenp1
	 */
	public String getStaudruckPlastifizierenp1() {
		return StaudruckPlastifizierenp1;
	}
	/**
	 * @param staudruckPlastifizierenp1 the staudruckPlastifizierenp1 to set
	 */
	public void setStaudruckPlastifizierenp1(String staudruckPlastifizierenp1) {
		StaudruckPlastifizierenp1 = staudruckPlastifizierenp1;
	}
	/**
	 * @return the staudruckPlastifizierenp2
	 */
	public String getStaudruckPlastifizierenp2() {
		return StaudruckPlastifizierenp2;
	}
	/**
	 * @param staudruckPlastifizierenp2 the staudruckPlastifizierenp2 to set
	 */
	public void setStaudruckPlastifizierenp2(String staudruckPlastifizierenp2) {
		StaudruckPlastifizierenp2 = staudruckPlastifizierenp2;
	}
	/**
	 * @return the staudruckPlastifizierenp3
	 */
	public String getStaudruckPlastifizierenp3() {
		return StaudruckPlastifizierenp3;
	}
	/**
	 * @param staudruckPlastifizierenp3 the staudruckPlastifizierenp3 to set
	 */
	public void setStaudruckPlastifizierenp3(String staudruckPlastifizierenp3) {
		StaudruckPlastifizierenp3 = staudruckPlastifizierenp3;
	}
	/**
	 * @return the staudruckPlastifizierenp4
	 */
	public String getStaudruckPlastifizierenp4() {
		return StaudruckPlastifizierenp4;
	}
	/**
	 * @param staudruckPlastifizierenp4 the staudruckPlastifizierenp4 to set
	 */
	public void setStaudruckPlastifizierenp4(String staudruckPlastifizierenp4) {
		StaudruckPlastifizierenp4 = staudruckPlastifizierenp4;
	}
	/**
	 * @return the staudruckPlastifizierenp5
	 */
	public String getStaudruckPlastifizierenp5() {
		return StaudruckPlastifizierenp5;
	}
	/**
	 * @param staudruckPlastifizierenp5 the staudruckPlastifizierenp5 to set
	 */
	public void setStaudruckPlastifizierenp5(String staudruckPlastifizierenp5) {
		StaudruckPlastifizierenp5 = staudruckPlastifizierenp5;
	}
	/**
	 * @return the staudruckPlastifizierenp6
	 */
	public String getStaudruckPlastifizierenp6() {
		return StaudruckPlastifizierenp6;
	}
	/**
	 * @param staudruckPlastifizierenp6 the staudruckPlastifizierenp6 to set
	 */
	public void setStaudruckPlastifizierenp6(String staudruckPlastifizierenp6) {
		StaudruckPlastifizierenp6 = staudruckPlastifizierenp6;
	}
	/**
	 * @return the staudruckPlastifizierenp7
	 */
	public String getStaudruckPlastifizierenp7() {
		return StaudruckPlastifizierenp7;
	}
	/**
	 * @param staudruckPlastifizierenp7 the staudruckPlastifizierenp7 to set
	 */
	public void setStaudruckPlastifizierenp7(String staudruckPlastifizierenp7) {
		StaudruckPlastifizierenp7 = staudruckPlastifizierenp7;
	}
	/**
	 * @return the einzugstemperatur
	 */
	public String getEinzugstemperatur() {
		return Einzugstemperatur;
	}
	/**
	 * @param einzugstemperatur the einzugstemperatur to set
	 */
	public void setEinzugstemperatur(String einzugstemperatur) {
		Einzugstemperatur = einzugstemperatur;
	}
	/**
	 * @return the temperiergeraet1
	 */
	public String getTemperiergeraet1() {
		return Temperiergeraet1;
	}
	/**
	 * @param temperiergeraet1 the temperiergeraet1 to set
	 */
	public void setTemperiergeraet1(String temperiergeraet1) {
		Temperiergeraet1 = temperiergeraet1;
	}
	/**
	 * @return the temperiergeraet2
	 */
	public String getTemperiergeraet2() {
		return Temperiergeraet2;
	}
	/**
	 * @param temperiergeraet2 the temperiergeraet2 to set
	 */
	public void setTemperiergeraet2(String temperiergeraet2) {
		Temperiergeraet2 = temperiergeraet2;
	}
	/**
	 * @return the temperiergeraet3
	 */
	public String getTemperiergeraet3() {
		return Temperiergeraet3;
	}
	/**
	 * @param temperiergeraet3 the temperiergeraet3 to set
	 */
	public void setTemperiergeraet3(String temperiergeraet3) {
		Temperiergeraet3 = temperiergeraet3;
	}
	/**
	 * @return the temperiergeraet4
	 */
	public String getTemperiergeraet4() {
		return Temperiergeraet4;
	}
	/**
	 * @param temperiergeraet4 the temperiergeraet4 to set
	 */
	public void setTemperiergeraet4(String temperiergeraet4) {
		Temperiergeraet4 = temperiergeraet4;
	}
	/**
	 * @return the heisskanalRegelkreis1
	 */
	public String getHeisskanalRegelkreis1() {
		return HeisskanalRegelkreis1;
	}
	/**
	 * @param heisskanalRegelkreis1 the heisskanalRegelkreis1 to set
	 */
	public void setHeisskanalRegelkreis1(String heisskanalRegelkreis1) {
		HeisskanalRegelkreis1 = heisskanalRegelkreis1;
	}
	/**
	 * @return the heisskanalRegelkreis2
	 */
	public String getHeisskanalRegelkreis2() {
		return HeisskanalRegelkreis2;
	}
	/**
	 * @param heisskanalRegelkreis2 the heisskanalRegelkreis2 to set
	 */
	public void setHeisskanalRegelkreis2(String heisskanalRegelkreis2) {
		HeisskanalRegelkreis2 = heisskanalRegelkreis2;
	}
	/**
	 * @return the heisskanalRegelkreis3
	 */
	public String getHeisskanalRegelkreis3() {
		return HeisskanalRegelkreis3;
	}
	/**
	 * @param heisskanalRegelkreis3 the heisskanalRegelkreis3 to set
	 */
	public void setHeisskanalRegelkreis3(String heisskanalRegelkreis3) {
		HeisskanalRegelkreis3 = heisskanalRegelkreis3;
	}
	/**
	 * @return the heisskanalRegelkreis4
	 */
	public String getHeisskanalRegelkreis4() {
		return HeisskanalRegelkreis4;
	}
	/**
	 * @param heisskanalRegelkreis4 the heisskanalRegelkreis4 to set
	 */
	public void setHeisskanalRegelkreis4(String heisskanalRegelkreis4) {
		HeisskanalRegelkreis4 = heisskanalRegelkreis4;
	}
	/**
	 * @return the heisskanalRegelkreis5
	 */
	public String getHeisskanalRegelkreis5() {
		return HeisskanalRegelkreis5;
	}
	/**
	 * @param heisskanalRegelkreis5 the heisskanalRegelkreis5 to set
	 */
	public void setHeisskanalRegelkreis5(String heisskanalRegelkreis5) {
		HeisskanalRegelkreis5 = heisskanalRegelkreis5;
	}
	/**
	 * @return the heisskanalRegelkreis6
	 */
	public String getHeisskanalRegelkreis6() {
		return HeisskanalRegelkreis6;
	}
	/**
	 * @param heisskanalRegelkreis6 the heisskanalRegelkreis6 to set
	 */
	public void setHeisskanalRegelkreis6(String heisskanalRegelkreis6) {
		HeisskanalRegelkreis6 = heisskanalRegelkreis6;
	}
	/**
	 * @return the heisskanalRegelkreis7
	 */
	public String getHeisskanalRegelkreis7() {
		return HeisskanalRegelkreis7;
	}
	/**
	 * @param heisskanalRegelkreis7 the heisskanalRegelkreis7 to set
	 */
	public void setHeisskanalRegelkreis7(String heisskanalRegelkreis7) {
		HeisskanalRegelkreis7 = heisskanalRegelkreis7;
	}
	/**
	 * @return the heisskanalRegelkreis8
	 */
	public String getHeisskanalRegelkreis8() {
		return HeisskanalRegelkreis8;
	}
	/**
	 * @param heisskanalRegelkreis8 the heisskanalRegelkreis8 to set
	 */
	public void setHeisskanalRegelkreis8(String heisskanalRegelkreis8) {
		HeisskanalRegelkreis8 = heisskanalRegelkreis8;
	}
	/**
	 * @return the einspritzarbeit
	 */
	public String getEinspritzarbeit() {
		return Einspritzarbeit;
	}
	/**
	 * @param einspritzarbeit the einspritzarbeit to set
	 */
	public void setEinspritzarbeit(String einspritzarbeit) {
		Einspritzarbeit = einspritzarbeit;
	}
	/**
	 * @return the hüllkurve
	 */
	public String getHüllkurve() {
		return Hüllkurve;
	}
	/**
	 * @param hüllkurve the hüllkurve to set
	 */
	public void setHüllkurve(String hüllkurve) {
		Hüllkurve = hüllkurve;
	}
	/**
	 * @return the schraubImpulseKernA
	 */
	public String getSchraubImpulseKernA() {
		return SchraubImpulseKernA;
	}
	/**
	 * @param schraubImpulseKernA the schraubImpulseKernA to set
	 */
	public void setSchraubImpulseKernA(String schraubImpulseKernA) {
		SchraubImpulseKernA = schraubImpulseKernA;
	}
	/**
	 * @return the schraubImpulseKernB
	 */
	public String getSchraubImpulseKernB() {
		return SchraubImpulseKernB;
	}
	/**
	 * @param schraubImpulseKernB the schraubImpulseKernB to set
	 */
	public void setSchraubImpulseKernB(String schraubImpulseKernB) {
		SchraubImpulseKernB = schraubImpulseKernB;
	}
	/**
	 * @return the kühltemperatur
	 */
	public String getOeltemperatur() {
		return Oeltemperatur;
	}
	/**
	 * @param kühltemperatur the kühltemperatur to set
	 */
	public void setOeltemperatur(String oeltemperatur) {
		Oeltemperatur = oeltemperatur;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProcessData [Datum=" + Datum + ", Uhrzeit=" + Uhrzeit + ", Zyklus=" + Zyklus + ", Zykluszeit="
				+ Zykluszeit + ", Einspritzzeit=" + Einspritzzeit + ", Plastifizierzeit=" + Plastifizierzeit
				+ ", TemperaturHeizzone1=" + TemperaturHeizzone1 + ", TemperaturHeizzone2=" + TemperaturHeizzone2
				+ ", TemperaturHeizzone3=" + TemperaturHeizzone3 + ", TemperaturHeizzone4=" + TemperaturHeizzone4
				+ ", TemperaturHeizzone5=" + TemperaturHeizzone5 + ", TemperaturHeizzone6=" + TemperaturHeizzone6
				+ ", TemperaturHeizzone7=" + TemperaturHeizzone7 + ", TemperaturHeizzone8=" + TemperaturHeizzone8
				+ ", TemperaturHeizzone9=" + TemperaturHeizzone9 + ", TemperaturHeizzone10=" + TemperaturHeizzone10
				+ ", Schmelzepolster=" + Schmelzepolster + ", Plastifizierende=" + Plastifizierende
				+ ", Werkzeugoffenposition=" + Werkzeugoffenposition + ", GeschwEinspritzenp0=" + GeschwEinspritzenp0
				+ ", GeschwEinspritzenp1=" + GeschwEinspritzenp1 + ", GeschwEinspritzenp2=" + GeschwEinspritzenp2
				+ ", GeschwEinspritzenp3=" + GeschwEinspritzenp3 + ", GeschwEinspritzenp4=" + GeschwEinspritzenp4
				+ ", GeschwEinspritzenp5=" + GeschwEinspritzenp5 + ", GeschwEinspritzenp6=" + GeschwEinspritzenp6
				+ ", GeschwEinspritzenp7=" + GeschwEinspritzenp7 + ", GeschwNachdruckBeginn=" + GeschwNachdruckBeginn
				+ ", GeschwNachdruckEnde=" + GeschwNachdruckEnde + ", DrehzahlPlastifizierenp1="
				+ DrehzahlPlastifizierenp1 + ", DrehzahlPlastifizierenp2=" + DrehzahlPlastifizierenp2
				+ ", DrehzahlPlastifizierenp3=" + DrehzahlPlastifizierenp3 + ", DrehzahlPlastifizierenp4="
				+ DrehzahlPlastifizierenp4 + ", DrehzahlPlastifizierenp5=" + DrehzahlPlastifizierenp5
				+ ", DrehzahlPlastifizierenp6=" + DrehzahlPlastifizierenp6 + ", DrehzahlPlastifizierenp7="
				+ DrehzahlPlastifizierenp7 + ", HydraulikdruckEinspritzenp0=" + HydraulikdruckEinspritzenp0
				+ ", HydraulikdruckEinspritzenp1=" + HydraulikdruckEinspritzenp1 + ", HydraulikdruckEinspritzenp2="
				+ HydraulikdruckEinspritzenp2 + ", HydraulikdruckEinspritzenp3=" + HydraulikdruckEinspritzenp3
				+ ", HydraulikdruckEinspritzenp4=" + HydraulikdruckEinspritzenp4 + ", HydraulikdruckEinspritzenp6="
				+ HydraulikdruckEinspritzenp6 + ", HydraulikdruckEinspritzenp7=" + HydraulikdruckEinspritzenp7
				+ ", WkzInnendruckEinspritzenp5=" + WkzInnendruckEinspritzenp5 + ", WkzInnendruckEinspritzenp6="
				+ WkzInnendruckEinspritzenp6 + ", WkzInnendruckEinspritzenp7=" + WkzInnendruckEinspritzenp7
				+ ", WkzInnendruckNachdruckbeginn=" + WkzInnendruckNachdruckbeginn + ", WkzInnendruckNachdruckp1="
				+ WkzInnendruckNachdruckp1 + ", WkzInnendruckNachdruckp2=" + WkzInnendruckNachdruckp2
				+ ", WkzInnendruckNachdruckp3=" + WkzInnendruckNachdruckp3 + ", WkzInnendruckNachdruckp4="
				+ WkzInnendruckNachdruckp4 + ", WkzInnendruckNachdruckp5=" + WkzInnendruckNachdruckp5
				+ ", WkzInnendruckNachdruckp6=" + WkzInnendruckNachdruckp6 + ", WkzInnendruckNachdruckp7="
				+ WkzInnendruckNachdruckp7 + ", WkzInnendruckKuehlzeitende=" + WkzInnendruckKuehlzeitende
				+ ", WkzInnendruckMax=" + WkzInnendruckMax + ", StaudruckPlastifizierenp1=" + StaudruckPlastifizierenp1
				+ ", StaudruckPlastifizierenp2=" + StaudruckPlastifizierenp2 + ", StaudruckPlastifizierenp3="
				+ StaudruckPlastifizierenp3 + ", StaudruckPlastifizierenp4=" + StaudruckPlastifizierenp4
				+ ", StaudruckPlastifizierenp5=" + StaudruckPlastifizierenp5 + ", StaudruckPlastifizierenp6="
				+ StaudruckPlastifizierenp6 + ", StaudruckPlastifizierenp7=" + StaudruckPlastifizierenp7
				+ ", Einzugstemperatur=" + Einzugstemperatur + ", Temperiergeraet1=" + Temperiergeraet1
				+ ", Temperiergeraet2=" + Temperiergeraet2 + ", Temperiergeraet3=" + Temperiergeraet3
				+ ", Temperiergeraet4=" + Temperiergeraet4 + ", HeisskanalRegelkreis1=" + HeisskanalRegelkreis1
				+ ", HeisskanalRegelkreis2=" + HeisskanalRegelkreis2 + ", HeisskanalRegelkreis3="
				+ HeisskanalRegelkreis3 + ", HeisskanalRegelkreis4=" + HeisskanalRegelkreis4
				+ ", HeisskanalRegelkreis5=" + HeisskanalRegelkreis5 + ", HeisskanalRegelkreis6="
				+ HeisskanalRegelkreis6 + ", HeisskanalRegelkreis7=" + HeisskanalRegelkreis7
				+ ", HeisskanalRegelkreis8=" + HeisskanalRegelkreis8 + ", Einspritzarbeit=" + Einspritzarbeit
				+ ", Hüllkurve=" + Hüllkurve + ", SchraubImpulseKernA=" + SchraubImpulseKernA + ", SchraubImpulseKernB="
				+ SchraubImpulseKernB + ", Oeltemperatur=" + Oeltemperatur + ", EnergiePumpenantrieb="
				+ EnergiePumpenantrieb + ", EnergieHeizzonen=" + EnergieHeizzonen + ", EnergieHeisskanaele="
				+ EnergieHeisskanaele + ", EnergieGesamt=" + EnergieGesamt + ", EinspritzdruckMax=" + EinspritzdruckMax
				+ ", NachdruckMax=" + NachdruckMax + ", HydraulikdruckNachdruckstart=" + HydraulikdruckNachdruckstart
				+ ", IndexToleranverletzung1=" + IndexToleranverletzung1 + ", IndexToleranverletzung2="
				+ IndexToleranverletzung2 + ", IndexToleranverletzung3=" + IndexToleranverletzung3
				+ ", Wertenormierung=" + Wertenormierung + ", amerikanischeEinheiten=" + amerikanischeEinheiten + "]";
	}
	/**
	 * @return the energiePumpenantrieb
	 */
	public String getEnergiePumpenantrieb() {
		return EnergiePumpenantrieb;
	}
	/**
	 * @param energiePumpenantrieb the energiePumpenantrieb to set
	 */
	public void setEnergiePumpenantrieb(String energiePumpenantrieb) {
		EnergiePumpenantrieb = energiePumpenantrieb;
	}
	/**
	 * @return the energieHeizzonen
	 */
	public String getEnergieHeizzonen() {
		return EnergieHeizzonen;
	}
	/**
	 * @param energieHeizzonen the energieHeizzonen to set
	 */
	public void setEnergieHeizzonen(String energieHeizzonen) {
		EnergieHeizzonen = energieHeizzonen;
	}
	/**
	 * @return the energieHeisskanaele
	 */
	public String getEnergieHeisskanaele() {
		return EnergieHeisskanaele;
	}
	/**
	 * @param energieHeisskanaele the energieHeisskanaele to set
	 */
	public void setEnergieHeisskanaele(String energieHeisskanaele) {
		EnergieHeisskanaele = energieHeisskanaele;
	}
	/**
	 * @return the energieGesamt
	 */
	public String getEnergieGesamt() {
		return EnergieGesamt;
	}
	/**
	 * @param energieGesamt the energieGesamt to set
	 */
	public void setEnergieGesamt(String energieGesamt) {
		EnergieGesamt = energieGesamt;
	}
	/**
	 * @return the einspritzdruckMax
	 */
	public String getEinspritzdruckMax() {
		return EinspritzdruckMax;
	}
	/**
	 * @param einspritzdruckMax the einspritzdruckMax to set
	 */
	public void setEinspritzdruckMax(String einspritzdruckMax) {
		EinspritzdruckMax = einspritzdruckMax;
	}
	/**
	 * @return the nachdruckMax
	 */
	public String getNachdruckMax() {
		return NachdruckMax;
	}
	/**
	 * @param nachdruckMax the nachdruckMax to set
	 */
	public void setNachdruckMax(String nachdruckMax) {
		NachdruckMax = nachdruckMax;
	}
	/**
	 * @return the hydraulikdruckNachdruckstart
	 */
	public String getHydraulikdruckNachdruckstart() {
		return HydraulikdruckNachdruckstart;
	}
	/**
	 * @param hydraulikdruckNachdruckstart the hydraulikdruckNachdruckstart to set
	 */
	public void setHydraulikdruckNachdruckstart(String hydraulikdruckNachdruckstart) {
		HydraulikdruckNachdruckstart = hydraulikdruckNachdruckstart;
	}
	/**
	 * @return the indexToleranverletzung1
	 */
	public String getIndexToleranverletzung1() {
		return IndexToleranverletzung1;
	}
	/**
	 * @param indexToleranverletzung1 the indexToleranverletzung1 to set
	 */
	public void setIndexToleranverletzung1(String indexToleranverletzung1) {
		IndexToleranverletzung1 = indexToleranverletzung1;
	}
	/**
	 * @return the indexToleranverletzung2
	 */
	public String getIndexToleranverletzung2() {
		return IndexToleranverletzung2;
	}
	/**
	 * @param indexToleranverletzung2 the indexToleranverletzung2 to set
	 */
	public void setIndexToleranverletzung2(String indexToleranverletzung2) {
		IndexToleranverletzung2 = indexToleranverletzung2;
	}
	/**
	 * @return the indexToleranverletzung3
	 */
	public String getIndexToleranverletzung3() {
		return IndexToleranverletzung3;
	}
	/**
	 * @param indexToleranverletzung3 the indexToleranverletzung3 to set
	 */
	public void setIndexToleranverletzung3(String indexToleranverletzung3) {
		IndexToleranverletzung3 = indexToleranverletzung3;
	}
	/**
	 * @return the wertenormierung
	 */
	public String getWertenormierung() {
		return Wertenormierung;
	}
	/**
	 * @param wertenormierung the wertenormierung to set
	 */
	public void setWertenormierung(String wertenormierung) {
		Wertenormierung = wertenormierung;
	}
	/**
	 * @return the amerikanischeEinheiten
	 */
	public String getAmerikanischeEinheiten() {
		return amerikanischeEinheiten;
	}
	/**
	 * @param amerikanischeEinheiten the amerikanischeEinheiten to set
	 */
	public void setAmerikanischeEinheiten(String amerikanischeEinheiten) {
		this.amerikanischeEinheiten = amerikanischeEinheiten;
	}
	@Override
	public int compareTo(ProcessData otherData) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");
		LocalDateTime currldt = LocalDateTime.parse(this.getDatum()+" "+this.getUhrzeit(), dtf);
		LocalDateTime otherldt = LocalDateTime.parse(otherData.getDatum()+" "+otherData.getUhrzeit(), dtf);
		
		if(currldt.equals(otherldt))
			return 0;
		if(currldt.isAfter(otherldt))
			return 1;
		else
			return -1;
	}
	public String getHydraulikdruckEinspritzenp5() {
		return HydraulikdruckEinspritzenp5;
	}
	public void setHydraulikdruckEinspritzenp5(String hydraulikdruckEinspritzenp5) {
		HydraulikdruckEinspritzenp5 = hydraulikdruckEinspritzenp5;
	}	
}
