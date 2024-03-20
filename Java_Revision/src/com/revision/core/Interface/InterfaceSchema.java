package com.revision.core.Interface;

public interface InterfaceSchema {

	// whether we are declaring it or not by default it will be public and abstract.
	public abstract void show();
	
	void display();
	
	// protected abstract void x();	// modifier protected is not allowed in interface
	
	// whether we are declaring it or not by default it will be public static final
	public static final int a = 10;

	int b = 10;
	
	// form 8th version onwards static and default methods are allowed.
	
	default int print() {
		return 0;
		
	}
	
	/* if you use default with any other modifier we will get compile time error
	 * eg. default abstract void display();
	 * C.E -> illegal combination of modifier.*/
	static void start() {
		
	}
	
	// form 9th version onwards private methods are also allowed.
	
	private void run()
	{
		
	}
	}
