
public class mainrunner 
{
public static void main(String[] args)
{
	bank b[]= {new sbi(1000,3,4),new pnb(8007,4,4),new gb(6754, 3, 2),new sbi(98765,5, 2),new pnb(56438, 2, 10)};
	System.out.println("bank information");
	for (int i = 0; i < b.length; i++) 
	{
		System.out.println(b[i]+" interest is "+b[i].getinterest());
	}
	bank a=higestinterest(b);
	System.out.println("highest bank interest is");
	System.out.println(a);
	System.out.println("bank:"+a.getinterest());
	
}

private static bank higestinterest(bank[] b) {
bank ba=b[0];
for (int i = 0; i < b.length; i++)
{
if(ba.getinterest()<b[i].getinterest())
	ba=b[i];
}
	return ba;
}
}
