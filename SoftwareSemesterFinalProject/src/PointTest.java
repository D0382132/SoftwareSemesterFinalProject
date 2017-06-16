import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.RunBefores;


public class PointTest 
{
	private Point testCase;
	@Before
	public void RunBeforeEveryTest()//create測試物件
	{
		testCase = new Point();
	}

	@Test
	public void test1() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(29, 9, 'B'));

		assertEquals(1, testCase.getPointCount(testData));
	}
	
	@Test
	public void test2() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));

		assertEquals(1, testCase.getPointCount(testData));
	}
	
	@Test
	public void test3() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(31, 9, 'B'));

		assertEquals(0, testCase.getPointCount(testData));
	}
	
	@Test
	public void test4() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(22, 9, 'B'));

		assertEquals(1, testCase.getPointCount(testData));
	}
	
	
	@Test
	public void test5()throws WrongMachineTypeException  
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(31, 9, 'B'));
		testData.add(4,new TimeData(39, 9, 'A'));

		assertEquals(1, testCase.getPointCount(testData));
	}
	
	@Test
	public void test6() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(31, 9, 'B'));
		testData.add(4,new TimeData(40, 9, 'A'));

		assertEquals(1, testCase.getPointCount(testData));
	}
	
	@Test
	public void test7() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(31, 9, 'B'));
		testData.add(4,new TimeData(41, 9, 'A'));

		assertEquals(0, testCase.getPointCount(testData));
	}
	
	@Test
	public void test8() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(31, 9, 'B'));
		testData.add(4,new TimeData(33, 9, 'A'));

		assertEquals(1, testCase.getPointCount(testData));
	}
	
	
	@Test
	public void test9() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));
		testData.add(4,new TimeData(30, 10, 'A'));
		testData.add(5,new TimeData(40, 10, 'B'));
		testData.add(6,new TimeData(50, 10, 'A'));
		testData.add(7,new TimeData(00, 11, 'B'));

		assertEquals(2, testCase.getPointCount(testData));
	}
	
	@Test
	public void test10() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));
		testData.add(4,new TimeData(29, 10, 'A'));
		testData.add(5,new TimeData(40, 10, 'B'));
		testData.add(6,new TimeData(50, 10, 'A'));
		testData.add(7,new TimeData(59, 10, 'B'));

		assertEquals(1, testCase.getPointCount(testData));
	}
	
	@Test
	public void test11() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));
		testData.add(4,new TimeData(31, 10, 'A'));
		testData.add(5,new TimeData(40, 10, 'B'));
		testData.add(6,new TimeData(50, 10, 'A'));
		testData.add(7,new TimeData(00, 11, 'B'));

		assertEquals(2, testCase.getPointCount(testData));
	}
	
	@Test
	public void test12() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(05, 9, 'B'));
		testData.add(2,new TimeData(10, 9, 'A'));
		testData.add(3,new TimeData(15, 9, 'B'));
		testData.add(4,new TimeData(20, 10, 'A'));
		testData.add(5,new TimeData(25, 10, 'B'));
		testData.add(6,new TimeData(30, 10, 'A'));
		testData.add(7,new TimeData(35, 10, 'B'));

		assertEquals(2, testCase.getPointCount(testData));
	}
	
	
	@Test
	public void test13() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));
		testData.add(4,new TimeData(40, 9, 'A'));
		testData.add(5,new TimeData(30, 10, 'B'));
		testData.add(6,new TimeData(40, 10, 'A'));
		testData.add(7,new TimeData(50, 10, 'B'));
		testData.add(8,new TimeData(00, 11, 'A'));
		assertEquals(2, testCase.getPointCount(testData));
	}
	
	@Test
	public void test14() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));
		testData.add(4,new TimeData(40, 9, 'A'));
		testData.add(5,new TimeData(29, 10, 'B'));
		testData.add(6,new TimeData(40, 10, 'A'));
		testData.add(7,new TimeData(50, 10, 'B'));
		testData.add(8,new TimeData(00, 11, 'A'));
		assertEquals(1, testCase.getPointCount(testData));
	}
	
	
	@Test
	public void test15() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(20, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));
		testData.add(4,new TimeData(40, 9, 'A'));
		testData.add(5,new TimeData(31, 10, 'B'));
		testData.add(6,new TimeData(40, 10, 'A'));
		testData.add(7,new TimeData(50, 10, 'B'));
		testData.add(8,new TimeData(00, 11, 'A'));
		assertEquals(2, testCase.getPointCount(testData));
	}
	
	
	@Test
	public void test16() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(05, 9, 'B'));
		testData.add(2,new TimeData(10, 9, 'A'));
		testData.add(3,new TimeData(15, 9, 'B'));
		testData.add(4,new TimeData(20, 9, 'A'));
		testData.add(5,new TimeData(25, 9, 'B'));
		testData.add(6,new TimeData(20, 10, 'A'));
		testData.add(7,new TimeData(25, 10, 'B'));
		testData.add(8,new TimeData(30, 10, 'A'));
		testData.add(9,new TimeData(35, 10, 'B'));
		assertEquals(2, testCase.getPointCount(testData));
	}
	
	
	
	@Test
	public void test17() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(21, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));
		testData.add(4,new TimeData(30, 10, 'A'));
		testData.add(5,new TimeData(40, 10, 'B'));
		testData.add(6,new TimeData(50, 10, 'A'));
		testData.add(7,new TimeData(00, 11, 'B'));
		testData.add(8,new TimeData(00, 12, 'A'));
		testData.add(9,new TimeData(10, 12, 'B'));
		testData.add(10,new TimeData(20, 12, 'A'));
		testData.add(11,new TimeData(30, 12, 'B'));
		testData.add(12,new TimeData(30, 13, 'A'));
		testData.add(13,new TimeData(40, 13, 'B'));
		testData.add(14,new TimeData(50, 13, 'A'));
		testData.add(15,new TimeData(00, 14, 'B'));
		testData.add(16,new TimeData(00, 15, 'A'));
		testData.add(17,new TimeData(10, 15, 'B'));
		testData.add(18,new TimeData(20, 15, 'A'));
		testData.add(19,new TimeData(30, 15, 'B'));
		testData.add(20,new TimeData(30, 16, 'A'));
		testData.add(21,new TimeData(40, 16, 'B'));
		testData.add(22,new TimeData(50, 16, 'A'));
		testData.add(23,new TimeData(00, 17, 'B'));

		assertEquals(5, testCase.getPointCount(testData));
	}
	
	@Test
	public void test18() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(21, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));
		testData.add(4,new TimeData(30, 10, 'A'));
		testData.add(5,new TimeData(40, 10, 'B'));
		testData.add(6,new TimeData(50, 10, 'A'));
		testData.add(7,new TimeData(00, 11, 'B'));
		testData.add(8,new TimeData(00, 12, 'A'));
		testData.add(9,new TimeData(10, 12, 'B'));
		testData.add(10,new TimeData(20, 12, 'A'));
		testData.add(11,new TimeData(30, 12, 'B'));
		testData.add(12,new TimeData(30, 13, 'A'));
		testData.add(13,new TimeData(40, 13, 'B'));
		testData.add(14,new TimeData(50, 13, 'A'));
		testData.add(15,new TimeData(00, 14, 'B'));
		testData.add(16,new TimeData(00, 15, 'A'));
		testData.add(17,new TimeData(10, 15, 'B'));
		testData.add(18,new TimeData(20, 15, 'A'));

		assertEquals(4, testCase.getPointCount(testData));
	}
	
	@Test
	public void test19() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'B'));
		testData.add(2,new TimeData(21, 9, 'A'));
		testData.add(3,new TimeData(30, 9, 'B'));
		testData.add(4,new TimeData(30, 10, 'A'));
		testData.add(5,new TimeData(40, 10, 'B'));
		testData.add(6,new TimeData(50, 10, 'A'));
		testData.add(7,new TimeData(00, 11, 'B'));
		testData.add(8,new TimeData(00, 12, 'A'));
		testData.add(9,new TimeData(10, 12, 'B'));
		testData.add(10,new TimeData(20, 12, 'A'));
		testData.add(11,new TimeData(30, 12, 'B'));
		testData.add(12,new TimeData(30, 13, 'A'));
		testData.add(13,new TimeData(40, 13, 'B'));
		testData.add(14,new TimeData(50, 13, 'A'));
		testData.add(15,new TimeData(00, 14, 'B'));
		testData.add(16,new TimeData(00, 15, 'A'));
		testData.add(17,new TimeData(10, 15, 'B'));
		testData.add(18,new TimeData(20, 15, 'A'));
		testData.add(19,new TimeData(30, 15, 'B'));

		assertEquals(5, testCase.getPointCount(testData));
	}
	
	
	@Test
	public void test20() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(05, 9, 'B'));
		testData.add(2,new TimeData(10, 9, 'A'));
		testData.add(3,new TimeData(15, 9, 'B'));
		testData.add(4,new TimeData(30, 10, 'A'));
		testData.add(5,new TimeData(35, 10, 'B'));
		testData.add(6,new TimeData(40, 10, 'A'));
		testData.add(7,new TimeData(45, 10, 'B'));
		testData.add(8,new TimeData(00, 12, 'A'));
		testData.add(9,new TimeData(05, 12, 'B'));
		testData.add(10,new TimeData(10, 12, 'A'));
		testData.add(11,new TimeData(15, 12, 'B'));
		testData.add(12,new TimeData(30, 13, 'A'));
		testData.add(13,new TimeData(35, 13, 'B'));
		testData.add(14,new TimeData(40, 13, 'A'));
		testData.add(15,new TimeData(45, 13, 'B'));
		testData.add(16,new TimeData(00, 15, 'A'));
		testData.add(17,new TimeData(05, 15, 'B'));
		testData.add(18,new TimeData(10, 15, 'A'));
		testData.add(19,new TimeData(15, 15, 'B'));

		assertEquals(5, testCase.getPointCount(testData));
	}
	
	
	@Test(expected = WrongMachineTypeException.class)
	public void test21() throws WrongMachineTypeException 
	{
		ArrayList<TimeData> testData = new ArrayList<>();
		testData.add(0,new TimeData(00, 9, 'A'));
		testData.add(1,new TimeData(10, 9, 'A'));
		testData.add(2,new TimeData(20, 9, 'B'));
		testData.add(3,new TimeData(29, 9, 'B'));

		assertEquals(-1, testCase.getPointCount(testData));
	}
	
	@After
	public void RunAfterEveryTest()//create測試物件
	{
		testCase = null;
	}

}
