package com.revision.core.Constructor;

import java.io.IOException;

/* When a parent class constructor throws any checked exception,
 * compulsory child class constructor should throw the same checked exception or its parent.Otherwise code will not compile..*/

public class Ex6 {
	
	Ex6() throws IOException
	{
		
	}

}


class Child6 extends Ex6{
	// compiler will generate
	/*Child6()
	 * { super(); }*/ // here no checked exception is mentioned so we will get C.E.
	
	Child6() throws Exception
	{
		
	}
}

