package net.ssjp.data;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import net.ssjp.data.Data;

public class UserLog  extends Data implements Serializable, Comparable<UserLog>{
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Log [aEvent=" + aEvent + ", aDate=" + aDate + ", aTime=" + aTime + ", userMessageNo=" + userMessageNo
				+ ", messageType=" + messageType + ", messageText=" + messageText + ", oldVal=" + oldVal + ", newVal="
				+ newVal + ", symbolName=" + symbolName + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1299535634246112452L;
	private String aEvent;
	private String aDate;
	private String aTime;
	private String userMessageNo;
	private String messageType;
	private String messageText;
	private String oldVal;
	private String newVal;
	private String symbolName;
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");
	public UserLog(){	}
	
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	   public ColumnPositionMappingStrategy getColumMapping(){
	      ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
	      strategy.setType(UserLog.class);
	      String[] columns = new String[] {"aEvent", "aDate", "aTime", "userMessageNo", "messageType", "messageText", "oldVal", "newVal", "symbolName"}; 
	      strategy.setColumnMapping(columns);
	      return strategy;
	   }
	
	public LocalDateTime getDateTime(){
		if(this.getaDate() == "" && this.getaTime()=="")
			return null;
		return LocalDateTime.parse(this.getaDate()+" "+this.getaTime(), dtf);
	}
	/**
	 * @return the aEvent
	 */
	public String getaEvent() {
		return aEvent;
	}

	/**
	 * @param aEvent the aEvent to set
	 */
	public void setaEvent(String aEvent) {
		this.aEvent = aEvent;
	}

	/**
	 * @return the aDate
	 */
	public String getaDate() {
		return aDate;
	}

	/**
	 * @param aDate the aDate to set
	 */
	public void setaDate(String aDate) {
		this.aDate = aDate;
	}

	/**
	 * @return the aTime
	 */
	public String getaTime() {
		return aTime;
	}

	/**
	 * @param aTime the aTime to set
	 */
	public void setaTime(String aTime) {
		this.aTime = aTime;
	}

	/**
	 * @return the userMessageNo
	 */
	public String getUserMessageNo() {
		return userMessageNo;
	}

	/**
	 * @param userMessageNo the userMessageNo to set
	 */
	public void setUserMessageNo(String userMessageNo) {
		this.userMessageNo = userMessageNo;
	}

	/**
	 * @return the messageType
	 */
	public String getMessageType() {
		return messageType;
	}

	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	/**
	 * @return the messageText
	 */
	public String getMessageText() {
		return messageText;
	}

	/**
	 * @param messageText the messageText to set
	 */
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	/**
	 * @return the oldVal
	 */
	public String getOldVal() {
		return oldVal;
	}

	/**
	 * @param oldVal the oldVal to set
	 */
	public void setOldVal(String oldVal) {
		this.oldVal = oldVal;
	}

	/**
	 * @return the newVal
	 */
	public String getNewVal() {
		return newVal;
	}

	/**
	 * @param newVal the newVal to set
	 */
	public void setNewVal(String newVal) {
		this.newVal = newVal;
	}

	/**
	 * @return the symbolName
	 */
	public String getSymbolName() {
		return symbolName;
	}

	/**
	 * @param symbolName the symbolName to set
	 */
	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public int compareTo(UserLog otherLog) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");
		LocalDateTime currldt = LocalDateTime.parse(this.getaDate()+" "+this.getaTime(), dtf);
		LocalDateTime otherldt = LocalDateTime.parse(otherLog.getaDate()+" "+otherLog.getaTime(), dtf);
		
		if(currldt.equals(otherldt))
			return 0;
		if(currldt.isAfter(otherldt))
			return 1;
		else
			return -1;
	}

}