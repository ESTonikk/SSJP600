package net.ssjp.data;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import net.ssjp.main.HibernateUtil;
 


public class UserLogMapper {
	private File f;
	private List<UserLog> logList;

	public UserLogMapper(File f) throws FileNotFoundException{
		this.setF(f);
		this.setLogList(new ArrayList<UserLog>());
		this.load();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<UserLog> load() throws FileNotFoundException{
		CsvToBean csv = new CsvToBean();
		CSVReader reader = new CSVReader(new FileReader(f), ';', '"', 1);
		UserLog cl = new UserLog();
		List list = csv.parse(cl.getColumMapping(), reader);
		
		for (Object object : list) {
	    	cl = (UserLog) object;
	    	this.getLogList().add(cl);
		}
		
		return this.getLogList();
	}
	
	public boolean checkFile() throws IOException{
		int i=0;
		@SuppressWarnings("resource")
		CSVReader reader = new CSVReader(new FileReader(f), ';', '"', 0);
		String[] header = reader.readNext();
		String[] realheader = {"Event","Date", "Time", "User/Messagenr.", "Type/State/Recipe No./Messagetext",
				"Name/Messagetext/File name", "Old value", "New value", "Symbol name", ""};
		for(String s:header){
			if(!s.trim().equals(realheader[i])){
				return false;
			}
			i++;
		}
		return true;
	}
	
	public void process() throws FileNotFoundException{
		this.load();
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		
		for(UserLog ul:this.getLogList()){
			session.save(ul);
		}
		
		tr.commit();
		sessFact.close();
	}

	/**
	 * @return the logList
	 */
	public List<UserLog> getLogList() {
		return logList;
	}

	/**
	 * @param logList the logList to set
	 */
	public void setLogList(List<UserLog> logList) {
		this.logList = logList;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}
}
