package me.daisenho.spring.rmi.demo.common.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 一个普通的pojo类，用于测试rmi传输各种类型的数据
 * 
 * @author daisenho
 *
 */
public class MyParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//基本类型
	private int intParam;
	private short shortParam;
	private long longParam;
	private float floatParam;
	private double doubleParam;
	private byte byteParam;
	private char charParam;
	private boolean booleanParam;
	
	//最常用类型
	private String StringParam;
	
	//常用容器
	private String[] array;
	private List<String> list;
	private Map<String,String> map;

	//hessian4不支持BigDecimal传输
	private BigDecimal bigDecimalParam;
	
	public int getIntParam() {
		return intParam;
	}
	public void setIntParam(int intParam) {
		this.intParam = intParam;
	}
	public short getShortParam() {
		return shortParam;
	}
	public void setShortParam(short shortParam) {
		this.shortParam = shortParam;
	}
	public long getLongParam() {
		return longParam;
	}
	public void setLongParam(long longParam) {
		this.longParam = longParam;
	}
	public float getFloatParam() {
		return floatParam;
	}
	public void setFloatParam(float floatParam) {
		this.floatParam = floatParam;
	}
	public double getDoubleParam() {
		return doubleParam;
	}
	public void setDoubleParam(double doubleParam) {
		this.doubleParam = doubleParam;
	}
	public byte getByteParam() {
		return byteParam;
	}
	public void setByteParam(byte byteParam) {
		this.byteParam = byteParam;
	}
	public char getCharParam() {
		return charParam;
	}
	public void setCharParam(char charParam) {
		this.charParam = charParam;
	}
	public boolean isBooleanParam() {
		return booleanParam;
	}
	public void setBooleanParam(boolean booleanParam) {
		this.booleanParam = booleanParam;
	}
	public String getStringParam() {
		return StringParam;
	}
	public void setStringParam(String stringParam) {
		StringParam = stringParam;
	}
	public BigDecimal getBigDecimalParam() {
		return bigDecimalParam;
	}
	public void setBigDecimalParam(BigDecimal bigDecimalParam) {
		this.bigDecimalParam = bigDecimalParam;
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}