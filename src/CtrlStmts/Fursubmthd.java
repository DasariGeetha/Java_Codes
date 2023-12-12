package CtrlStmts;

public class Fursubmthd {

	public void letter()	{
	char ch;
    for( ch='A';ch<='Z';ch++ )
	System.out.println(ch);
	}
	
    public void num() {
    int i;
	for (i=1;i<=10;i++)
	System.out.println(i);
    }

    public void decimal() {
	float f;
	for(f=1; f<=50.10; f++)
	System.out.println(f);
    }
    
    public void doub() {
		//double d;
		//for(d=10; d<=50; d++)
		//System.out.println(d);
	}
	public static void main(String[] args) {
		Fursubmthd loops=new Fursubmthd();
		loops.letter();
		loops.num();
		loops.decimal();
		loops.doub();
	}
}
