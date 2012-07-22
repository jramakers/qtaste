package com.qspin.qtaste.tools.model;

public class Event {

	public Event()
	{
		
	}
	
	public String toString()
	{
		return "Event on " + mComponentName + " (" + mSourceClass + ") of type " + mType + " (timestamp :" + mTimeStamp + ")";
	}
	
	public String getComponentName()
	{ 
		return mComponentName;
	}
	public void setComponentName(String pComponentName)
	{ 
		mComponentName = pComponentName;
	}
	public String getSouceClass()
	{ 
		return mSourceClass;
	}
	public void setSourceClass(String pSourceClass)
	{ 
		mSourceClass = pSourceClass;
	}
	public long getTimeStamp()
	{ 
		return mTimeStamp;
	}
	public void setTimeStamp(long pTime)
	{ 
		mTimeStamp = pTime;
	}
	public String getType()
	{
		return mType;
	}
	public void setType(String pType) {
		mType = pType;
	}
	
	protected String mComponentName;
	protected String mSourceClass;
	protected String mType;
	protected long mTimeStamp;
	
}
