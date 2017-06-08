/**
 * 
 */
package net.ssjp.data;

import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;

/**
 * @author eugenscheller
 *
 */
public abstract class Data {
	public abstract ColumnPositionMappingStrategy<?> getColumMapping();
}
