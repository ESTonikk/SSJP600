package net.ssjp.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;

public class ProcessDataMapper {
	private File f;
	private List<ProcessData> processDataList;

	//private final static Logger log = LogManager.getLogger( SGMFTPDownload.class );
	public ProcessDataMapper() {	}
	
	public ProcessDataMapper(File f) throws FileNotFoundException{
		this.setFile(f);
		this.setProcessDataList(new ArrayList<ProcessData>());
		this.setProcessDataList(this.getProcessData());
	}
	

	public boolean checkFile(){
		//TODO implementieren
		return true;
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public List<ProcessData> getProcessData() throws FileNotFoundException{
		CsvToBean csv = new CsvToBean();
		CSVReader reader = new CSVReader(new FileReader(this.getFile()), ';', '"', 1);
	    ProcessData pd = new ProcessData();
		List list = csv.parse(pd.getColumMapping(), reader);
		
		for (Object object : list) {
	    	pd = (ProcessData) object;
	    	this.getProcessDataList().add(pd);
		}
		
		return this.getProcessDataList();
	}
	
	/**
	 * @return the filepath
	 */
	public File getFile() {
		return f;
	}

	/**
	 * @param filepath the filepath to set
	 */
	public void setFile(File f) {
		this.f = f;
	}

	/**
	 * @return the processDataList
	 */
	public List<ProcessData> getProcessDataList() {
		return processDataList;
	}

	/**
	 * @param processDataList the processDataList to set
	 */
	public void setProcessDataList(List<ProcessData> processDataList) {
		this.processDataList = processDataList;
	}

}
