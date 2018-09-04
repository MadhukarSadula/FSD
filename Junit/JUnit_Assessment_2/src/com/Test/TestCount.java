package com.Test;
import com.main.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCount {
@Test
public void Testcount()
{
	WordCount obj=new WordCount();
	double count=(double)obj.count("abc def ghi pqr");
	assertEquals(4.0, count,0.0);
}
@Test
public void Testcount2()
{
	WordCount obj=new WordCount();
	double count=(double)obj.count("abc def ghi pqr");
	assertEquals(5.0, count,0.0);
}
	
}
