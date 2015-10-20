package net.mahesh.sample.contract.common;

import javax.validation.Path;

public class Constraint {
	private String fieldName;
	private String informationMessage;
	private Object value; 
	public Constraint(Path path , String informationMessage,Object object){
		if(null!=path){
		this.fieldName=path.toString();
		}
		this.informationMessage=informationMessage;
		this.value=object;
	}
	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}
	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	/**
	 * @return the informationMessage
	 */
	public String getInformationMessage() {
		return informationMessage;
	}
	/**
	 * @param informationMessage the informationMessage to set
	 */
	public void setInformationMessage(String informationMessage) {
		this.informationMessage = informationMessage;
	}
	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Constraint ["
				+ (fieldName != null ? "fieldName=" + fieldName + ", " : "")
				+ (informationMessage != null ? "informationMessage="
						+ informationMessage + ", " : "")
				+ (value != null ? "value=" + value : "") + "]";
	}	
}
