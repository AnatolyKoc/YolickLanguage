package yolickide;


 class f {

	static int i(double a)
	{
		return (int)(a);
	}
	static int i(String a)
	{
		return Integer.parseInt(a);
	}
	static float f(double a)
	{
		return (float)(a);
	}
	static float f(String a)
	{
		return Float.parseFloat(a);
	}
	static double rnd()
	{
		return Math.random();
	}
	 static double rnd(double a)
	{
		return Math.random()*a;
	}
        static double rd(double a)
	{
		return Math.round(a);
	}
	static double rnd(int a)
	{
		return (int)(Math.random()*a);
	}	
	static double pi()
	{
		return Math.PI;
	}
	static double d(double a)
	 {
		return a;
	}
	static double d(String a)
	{
		return Double.parseDouble(a);
	}
	static char c(int a)
	{
		return (char)(a);
	}
	static char c(int b, String a)
	{
		return a.charAt(b);
	}
	static int abs(int a)
	{
		return Math.abs(a);
	}
	static long l(double a)
	{
		return (long)(a);
	}
	static long l(String a)
	{
		return Long.parseLong(a);
	}
	static byte b(double a)
	{
		return (byte)(a);
	}
	static byte b(String a)
	{
		return Byte.parseByte(a);
	}
	static double pow(double a, double b)
	{
		return Math.pow(a, b);
	}
	static double mn(double a, double b)
	{
		return Math.min(a, b);
	}
	static double mx(double a, double b)
	{
		return Math.max(a, b);
	}
	static String ts(double a)
	{
		return Double.toString(a);
	}
	static String ts(int a)
	{
		return Integer.toString(a);
	}
	static String ts(char a)
	{
		return Character.toString(a);
	}
	static String ts(boolean a)
	{
		return Boolean.toString(a);
	}
	static String ts(float a)
	{
		return Float.toString(a);
	}
	static String ts(byte a)
	{
		return Byte.toString(a);
	}
	static String ts(long a)
	{
		return Long.toString(a);
	}
	


}
