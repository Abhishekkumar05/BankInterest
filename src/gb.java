
public class gb implements bank
{
	double principal;
	double rate;
	double time;
	public gb(double principal,double rate,double time) 
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
		return "gb [principal=" + principal + ", rate=" + rate + ", time=" + time + "]";
	}
}
