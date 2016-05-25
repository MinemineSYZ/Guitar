
package com.pb.pojo;

import com.pb.util.Type;
import com.pb.util.Wood;
import com.pb.util.Builder;

public class GuitarSpec {
	private Builder builder; 
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;
	/**
	 * @param builder
	 * @param model
	 * @param type
	 * @param numStrings
	 * @param backWood
	 * @param topWood
	 */
	
	public boolean matches(GuitarSpec otherSpec) {
	    if (builder != otherSpec.builder)
	      return false;
	    if ((model != null) && (!model.equals("")) &&
	        (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
	      return false;
	    if (type != otherSpec.type)
	      return false;
	    if (numStrings != otherSpec.numStrings)
	      return false;
	    if (backWood != otherSpec.backWood)
	      return false;
	    if (topWood != otherSpec.topWood)
	      return false;
	    return true;
	  }
	public GuitarSpec() {
		super();
	}
	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
}
