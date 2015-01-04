package yolickide;

class Commands
{

	String echo(String a)
	{
		if(a.charAt(0)=='>')
		{
		a=a.replaceFirst(">","System.out.println(");
		a=a+");";
		}

		
		return a;
	}
	String screen(String a)
	{
		
		a="Screen scr = new Screen();\n";
		return a;

	}
	String rt(String a)
	{
		
		a=a.replaceFirst("ret ", "return ");
		a=a+";";
		return a;
		
		
	}
	String label(String a)
	{
		
		a=a.replace("lbl", "JLabel");
		a=a+"=new JLabel();";
		return a;
		
		
	}
	String button(String a)
	{
		
		a=a.replace("btn", "JButton");
		a=a+"=new JButton();";
		return a;
		
		
	}
	String sa(String a)
	{
		
		a=a+";";
		return a;
		
		
	}
	String method(String a)
	{
		
		a=a.replaceFirst("m ", "");
		
		
		if(a.charAt(0)=='i')
		{
			a=a.replaceFirst("i ","int ");
		}
		else if(a.charAt(0)=='s')
		{
			a=a.replaceFirst("s ","String ");
		}
		else if(a.charAt(0)=='b'&&a.charAt(1)=='l')
		{
			a=a.replaceFirst("bl ","boolean ");
		}
		else if(a.charAt(0)=='b')
		{
			a=a.replaceFirst("b ","byte ");
		}
		else if(a.charAt(0)=='f')
		{
			a=a.replaceFirst("f ","float ");
		}
		else if(a.charAt(0)=='f')
		{
			a=a.replaceFirst("f ","float ");
		}
		else if(a.charAt(0)=='d')
		{
			a=a.replaceFirst("d ","double ");
		}
		else if(a.charAt(0)=='c')
		{
			a=a.replaceFirst("c ","char ");
		}
		else a=a.replaceFirst(" ","void ");
		a="static "+a;
		return a;
	}
	String scanner(String a)
	{
		
		a="Scanner sc = new Scanner(System.in);\n";
		return a;
	}
	String proj(String a)
	{
		
		a=a.replaceFirst("PROJECT", "public class ");
		a=a+"{";
		return a;
		
		
	}
	String lib(String a)
	{
		a=a.replaceFirst("LIB", "class ");
		return a;
	}
	String str(String a)
	{
		
		a=a.replaceFirst("START", "public class YolickIDE\n{\npublic static void main(String args[]){");

		return a;		
		
	}
	String vara(String a)
	{
		if(a.charAt(a.length()-1)=='!')
		{
		a=a.replaceFirst("!",";");
		}

		return a;
	}
	String echop(String a)
	{
		if(a.charAt(0)=='_')
		{
		a=a.replaceFirst("_","System.out.print(");
		a=a+");";
		}

		return a;
	}
	String masa(String a)
	{
		if(a.contains("="))
		{
		a=a+";";
		}
	
		return a;
	}
	
	
	String els(String a)
	{
		
		a=a.replaceFirst("!?","else");

		return a;
	}
	String ifdo(String a)
	{
		if(a.charAt(a.length()-1)=='?')
		{
		a=a.replace("?","");
		a="if("+a;
		a=a+")";
		}
	
		return a;
	}
	
	String fastloop(String a)
	{
		if(a.charAt(0)=='l'&&a.charAt(1)=='(')
		{
		a=a.replace("l(","for(int ln=0;ln<=");
		a=a.replace(")",";ln++)");
		}
		if(a.charAt(a.length()-2)==':')
		{
			a=a.replace("ln",a.substring(a.length()-1,a.length()));
			a=a.replace(a.substring(a.length()-2,a.length()), "");
		}
	
		return a;
	}
	
	String read(String a)
	{
		if(a.charAt(0)=='n'||a.charAt(2)==':'||a.charAt(3)==':')
		{
			a=a.replaceFirst(":", "");
			if(a.charAt(1)=='b'&&a.charAt(2)=='l')
			{
				a=a.replaceFirst("nbl", "");
				a=a+"=sc.nextBoolean();";
			
				a="boolean "+a;
				
				return a;
			}
			
			if(a.charAt(1)=='i')
			{
				a=a.replaceFirst("ni", "");
				a=a+"=sc.nextInt();";
				
					a="int "+a;
		
					return a;
				}
			
			if(a.charAt(1)=='s')
			{
				a=a.replaceFirst("ns", "");
				a=a+"=sc.next();";
			
				a="String "+a;
			
				return a;
			}
			if(a.charAt(1)=='l')
			{
				a=a.replaceFirst("nl", "");
				a=a+"=sc.nextLong();";
				
				a="long "+a;
				
				
				return a;
			}
			if(a.charAt(1)=='b')
			{
				a=a.replaceFirst("nb", "");
				a=a+"=sc.nextByte();";
		
				a="byte "+a;
				
				
				return a;
			}
			if(a.charAt(1)=='d')
			{
				a=a.replaceFirst("nd", "");
				a=a+"=sc.nextDouble();";
				
				a="double "+a;
				
				
				return a;
			}
			if(a.charAt(1)=='f')
			{
				a=a.replaceFirst("nf", "");
				a=a+"=sc.nextFloat();";
			
				a="float "+a;
				
				
				return a;
			}
		
		}
		if(a.charAt(1)==':'||a.charAt(2)==':')
		{
			a=a.replaceFirst(":", "");
			if(a.charAt(0)=='b'&&a.charAt(1)=='l')
			{
				a=a.replaceFirst("bl", "");
				a=a+"=sc.nextBoolean();";
				
				
				
				return a;
			}
			
			if(a.charAt(0)=='i')
			{
				a=a.replaceFirst("i", "");
				a=a+"=sc.nextInt();";
				
				
					return a;
				}
			
			if(a.charAt(0)=='s')
			{
				a=a.replaceFirst("s", "");
				a=a+"=sc.next();";
				
				
				
				return a;
			}
			if(a.charAt(0)=='l')
			{
				a=a.replaceFirst("l", "");
				a=a+"=sc.nextLong();";
				
				
				return a;
			}
			if(a.charAt(0)=='b')
			{
				a=a.replaceFirst("b", "");
				a=a+"=sc.nextByte();";
				
				
				
				return a;
			}
			if(a.charAt(0)=='d')
			{
				a=a.replaceFirst("d", "");
				a=a+"=sc.nextDouble();";
				if(a.contains("[")==false)
					
				
				return a;
			}
			if(a.charAt(0)=='f')
			{
				a=a.replaceFirst("f", "");
				a=a+"=sc.nextFloat();";
				
				
				
				return a;
			}
		
		}
		
		
		return a;
	}
	
	
	
	String var(String a)
	{
		
		if(a.charAt(0)=='b'&&a.charAt(1)=='l')
		{
			a=a.replaceFirst("bl ", "boolean ")+";";
			
			
			return a;
			
		}
		
			if(a.charAt(0)=='i')
			{
				a=a.replaceFirst("i ", "int ")+";";
				
				
				return a;
				}
			
			if(a.charAt(0)=='s')
			{
				a=a.replaceFirst("s ", "String ")+";";
				
				
				return a;
			}
			if(a.charAt(0)=='l')
			{
				a=a.replaceFirst("l ", "long ")+";";
				
				
				return a;
			}
			if(a.charAt(0)=='b')
			{
				a=a.replaceFirst("b ", "byte ")+";";
				
				
				return a;
			
			}
			if(a.charAt(0)=='d')
			{
				a=a.replaceFirst("d ", "double ")+";";
				
				
				return a;
			}
			if(a.charAt(0)=='f')
			{
				a=a.replaceFirst("f ", "float ")+";";
				
				
				
				return a;
			}
			if(a.charAt(0)=='c')
			{
				a=a.replaceFirst("c ", "char ")+";";
				
				
				return a;
			}
			
			
			return a;
			
		
		
	}
	String mas(String a)
	{
		
		if(a.charAt(0)=='b'&&a.charAt(1)=='l')
		{
			
			String d="";
			int b=0;
			for(int i=0;i!=a.indexOf(")");i++)
			{
				b=i;
				
			}
			String c=a.substring(2,b+1).replace("(","");
			a=a.replaceFirst(a.substring(2,b+1).replace("(",""), "");

			for(int i=0;i!=Integer.parseInt(c);i++)
			{
				
				d=d+"[]";
			}
			
			a=a.replace("bl", "boolean");
			a=a.replaceFirst(":", "= new ");
			a=a.replace("()", d);
			a=a+";";
			
			
			return a;
		}
		
			if(a.charAt(0)=='i')
			{
				String d="";
				int b=0;
				for(int i=0;i!=a.indexOf(")");i++)
				{
					b=i;
					
				}
				String c=a.substring(1,b+1).replace("(","");
				a=a.replaceFirst(a.substring(1,b+1).replace("(",""), "");
	
				for(int i=0;i!=Integer.parseInt(c);i++)
				{
					
					d=d+"[]";
				}
				
				a=a.replace("i", "int");
				a=a.replaceFirst(":", "= new ");
				a=a.replace("()", d);
				a=a+";";
				
				
				return a;
				}
			
			if(a.charAt(0)=='s')
			{
				String d="";
				int b=0;
				for(int i=0;i!=a.indexOf(")");i++)
				{
					b=i;
					
				}
				String c=a.substring(1,b+1).replace("(","");
				a=a.replaceFirst(a.substring(1,b+1).replace("(",""), "");
	
				for(int i=0;i!=Integer.parseInt(c);i++)
				{
					
					d=d+"[]";
				}
				
				a=a.replace("s", "String");
				a=a.replaceFirst(":", "= new ");
				a=a.replace("()", d);
				a=a+";";
				
				
				return a;
				
				
			}
			if(a.charAt(0)=='c')
			{
				String d="";
				int b=0;
				for(int i=0;i!=a.indexOf(")");i++)
				{
					b=i;
					
				}
				String c=a.substring(1,b+1).replace("(","");
				a=a.replaceFirst(a.substring(1,b+1).replace("(",""), "");
	
				for(int i=0;i!=Integer.parseInt(c);i++)
				{
					
					d=d+"[]";
				}
				
				a=a.replace("c", "char");
				a=a.replaceFirst(":", "= new ");
				a=a.replace("()", d);
				a=a+";";
				
				
				return a;
				
				
			}
			if(a.charAt(0)=='l')
			{
				String d="";
				int b=0;
				for(int i=0;i!=a.indexOf(")");i++)
				{
					b=i;
					
				}
				String c=a.substring(1,b+1).replace("(","");
				a=a.replaceFirst(a.substring(1,b+1).replace("(",""), "");
	
				for(int i=0;i!=Integer.parseInt(c);i++)
				{
					
					d=d+"[]";
				}
				
				a=a.replace("l", "long");
				a=a.replaceFirst(":", "= new ");
				a=a.replace("()", d);
				a=a+";";
				
				
				return a;
			}
			if(a.charAt(0)=='b')
			{
				String d="";
				int b=0;
				for(int i=0;i!=a.indexOf(")");i++)
				{
					b=i;
					
				}
				String c=a.substring(1,b+1).replace("(","");
				a=a.replaceFirst(a.substring(1,b+1).replace("(",""), "");
	
				for(int i=0;i!=Integer.parseInt(c);i++)
				{
					
					d=d+"[]";
				}
				
				a=a.replace("b", "byte");
				a=a.replaceFirst(":", "= new ");
				a=a.replace("()", d);
				a=a+";";
				
				
				return a;
			
			}
			if(a.charAt(0)=='d')
			{
				String d="";
				int b=0;
				for(int i=0;i!=a.indexOf(")");i++)
				{
					b=i;
					
				}
				String c=a.substring(1,b+1).replace("(","");
				a=a.replaceFirst(a.substring(1,b+1).replace("(",""), "");
	
				for(int i=0;i!=Integer.parseInt(c);i++)
				{
					
					d=d+"[]";
				}
				
				a=a.replace("d", "double");
				a=a.replaceFirst(":", "= new ");
				a=a.replace("()", d);
				a=a+";";
				
				
				return a;
			}
			if(a.charAt(0)=='f')
			{
				String d="";
				int b=0;
				for(int i=0;i!=a.indexOf(")");i++)
				{
					b=i;
					
				}
				String c=a.substring(1,b+1).replace("(","");
				a=a.replaceFirst(a.substring(1,b+1).replace("(",""), "");
	
				for(int i=0;i!=Integer.parseInt(c);i++)
				{
					
					d=d+"[]";
				}
				
				a=a.replace("f", "float");
				a=a.replaceFirst(":", "= new ");
				a=a.replace("()", d);
				a=a+";";
				
				
				return a;
			}
			
			
			return a;
			
		
		
	}
	
}
