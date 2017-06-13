/**
 * 
 */
package net.ssjp.data;

import java.io.Serializable;

import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;

/**
 * @author Eugen
 *
 */
public class DataPreset extends Data implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -8457945602122479859L;
	private String dataType;
	private String aName;
	private String value;
	private String description;
	/**
	 * 
	 */
	
	public DataPreset(){	}
	
	public DataPreset(String aSetting) {
		String[] vals = aSetting.trim().split(";");
		this.setDataType(vals[0]);
		this.setaName(vals[1]);
		this.setValue(vals[2]);
		this.setDescription(vals[3]);
	}

	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}
	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	/**
	 * @return the aName
	 */
	public String getaName() {
		return aName;
	}
	/**
	 * @param aName the aName to set
	 */
	public void setaName(String aName) {
		this.aName = aName;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	


	@SuppressWarnings({"rawtypes", "unchecked"})
    public ColumnPositionMappingStrategy getColumMapping(){
       ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
       strategy.setType(DataPreset.class);

       String[] columns = new String[] {"dataType", "aName", "value", "description"};
       strategy.setColumnMapping(columns);
       return strategy;
    }

	@Override
	public String toString() {
		return String.format(
                "DataPreset[datatype=%s, name='%s', value='%s', description='%s']",
                dataType, aName, value, description);
	}

}
