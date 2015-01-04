package yolickide;






public class YL {

	 Commands cmd = new Commands();
	String l;
	String write(String a){

			l=a;
				l=l.replace("	", "");
				if(l.equals("{"))
				{
					return l;
				}
				
				else if(l.equals("}"))
				{
					return l;
				}
					else if(l.equals(""))
					{
					return l;
					}
					else if(l.charAt(0)=='>')
					{
					l=cmd.echo(l);
					return l;
					}
					else if(l.charAt(0)=='_')
					{
					l=cmd.echop(l);
					return l;
					}
					else if(l.charAt(0)=='L'&&l.charAt(1)=='I'&&l.charAt(2)=='B')
					{
					l=cmd.lib(l);
					return l;
					}
					else if(l.charAt(0)=='P'&&l.charAt(1)=='R'&&l.charAt(2)=='O'&&l.charAt(3)=='J'&&l.charAt(4)=='E'&&l.charAt(5)=='C'&&l.charAt(6)=='T')
					{
					l=cmd.proj(l);
					return l;
					}
					else if(l.charAt(0)=='S'&&l.charAt(1)=='T'&&l.charAt(2)=='A'&&l.charAt(3)=='R'&&l.charAt(4)=='T')
					{
					l=cmd.str(l);
					return l;
					}
				else if(l.charAt(l.length()-1)=='?'&&l.charAt(0)!='>')
				{
				l=cmd.ifdo(l);
				return l;
				}
				else if(l.charAt(0)=='b'&&l.charAt(1)=='t'&&l.charAt(2)=='n'&&l.charAt(3)==' ')
				{
				l=cmd.button(l);
				return l;
				}
				else if(l.contains("]")==false&&l.charAt(0)=='l'&&l.charAt(1)=='(')
				{
				l=cmd.fastloop(l);
				return l;
				}
				else if(l.charAt(0)=='l'&&l.charAt(1)=='b'&&l.charAt(2)=='l'&&l.charAt(3)==' ')
				{
				l=cmd.label(l);
				return l;
				}
				else if(l.charAt(1)!='.'&&l.charAt(1)!='('&&l.charAt(1)!=':'&&(l.charAt(0)=='r'&&l.charAt(1)=='e'&&l.charAt(2)=='t'))
				{
				l=cmd.rt(l);
				return l;
				}
				else if(l.charAt(1)!='.'&&l.charAt(1)!='('&&l.charAt(1)!=':'&&(l.charAt(0)=='m'&&l.charAt(1)==' '))
				{
				l=cmd.method(l);
				return l;
				}
				else if(l.charAt(1)!='.'&&l.charAt(1)!='('&&l.charAt(1)!=':'&&(( l.charAt(2)==32 || l.charAt(1)==32 )&&(l.charAt(0)=='f'||l.charAt(0)=='i'||l.charAt(0)=='d'||l.charAt(0)=='b'||l.charAt(0)=='s'||l.charAt(0)=='l')||l.charAt(0)=='c'))
				{
				l=cmd.var(l);
				return l;
				}
				else if(l.charAt(0)=='+'&&l.charAt(1)=='s'&&l.charAt(2)=='c'&&l.charAt(3)=='r')
				{
				l=cmd.screen(l);
				return l;
				}
				
				else if(l.charAt(0)=='+'&&l.charAt(1)=='s'&&l.charAt(2)=='c'&&l.charAt(3)=='a')
				{
				l=cmd.scanner(l);
				return l;
				}
				else if(l.charAt(0)=='s'&&l.charAt(1)=='.')
				{
				l=cmd.sa(l);
				return l;
				}
				else if(l.contains("]")&&l.charAt(2)=='('||l.charAt(1)=='('&&(l.charAt(0)=='i'||l.charAt(0)=='d'||l.charAt(0)=='b'||l.charAt(0)=='s'||l.charAt(0)=='l'||l.charAt(0)=='c'))
				{
				l=cmd.mas(l);
				return l;
				}
				else if(l.charAt(l.length()-1)=='!')
				{
				l=cmd.vara(l);
				return l;
				}
				
			
				else if(l.contains("]")&&l.contains("["))
				{
				l=cmd.masa(l);
				return l;
				}
				
				
				else if(l.charAt(0)=='!'&&l.charAt(1)=='?')
				{
				l=cmd.els(l);
				return l;
				}	
			
			
				else if(l.length()>1&&l.charAt(0)=='n'&&l.charAt(2)==':'||l.charAt(3)==':'&&((l.charAt(1)=='i'||l.charAt(1)=='d'||l.charAt(1)=='b'||l.charAt(1)=='s')||l.charAt(1)=='l')||(l.length()>1&&l.charAt(1)==':'||l.charAt(2)==':'&&((l.charAt(0)=='i'||l.charAt(0)=='d'||l.charAt(0)=='b'||l.charAt(0)=='s')||l.charAt(0)=='l')))
				{
				l=cmd.read(l);
				return l;
				}
				
			

			
				return l;

	
	
}
	
}


