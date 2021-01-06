
public class pnb implements bank
{
double principal;
double rate;
double time;
public pnb(double principal,double rate,double time) 
{
this.principal=principal;
this.rate=rate;
this.time=time;
}
public double getinterest()
{
return (principal*time*rate)/100;
}
@Override
public String toString() {
	return "pnb [principal=" + principal + ", rate=" + rate + ", time=" + time + "]";
}

}


