package net.ssjp.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;

public class DataPreSetMapper{
	private String name;
	private File file;
	private List<DataPreset> settingList;

	public DataPreSetMapper(File file) throws FileNotFoundException{
		this.setFile(file);
		this.setSettingList(new LinkedList<DataPreset>());
		this.getRawSettings();
	}
	
	public boolean checkFile(){
		//TODO implementieren
		return true;
	}
	
	@Override
	public String toString() {
		return "DataPreSetMapper [name=" + name + ", file=" + file + ", settingList=" + settingList + "]";
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked"})
	private List<DataPreset> getRawSettings() throws FileNotFoundException{
		
		CsvToBean csv = new CsvToBean();
		CSVReader reader = new CSVReader(new FileReader(this.getFile()), ';', '"', 1);
	    DataPreset setting = new DataPreset();
		List list = csv.parse(setting.getColumMapping(), reader);
		
		for (Object object : list) {
	    	setting = (DataPreset) object;
	    	this.getSettingList().add(setting);
		}
		return this.getSettingList();
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}



	/**
	 * @return the settingList
	 */
	public List<DataPreset> getSettingList() {
		return settingList;
	}

	/**
	 * @param settingList the settingList to set
	 */
	public void setSettingList(List<DataPreset> settingList) {
		this.settingList = settingList;
	}
}
