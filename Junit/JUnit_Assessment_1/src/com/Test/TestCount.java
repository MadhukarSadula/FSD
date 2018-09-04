package com.Test;
import com.main.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestCount {
@Test
public void Testcount()
{int[] arr={3,5,6,8,15,2,1,16};
	SortArray obj=new SortArray();
	int[] count=obj.sortNumbers(arr);
	int[] res={1,2,3,5,6,8,15,16};
	assertArrayEquals(res, count);
}
@Test
public void Testcount2()
{
	int[] arr={3,5,3,6,8,15,2,1,16};
	SortArray obj=new SortArray();
	int[] count=obj.sortNumbers(arr);
	int[] res={1,2,3,5,8,15,16};
	assertArrayEquals(res, count);
}
	
}
