
public class sbi implements bank
{
double principal;
double rate;
double time;
sbi(double principal,double rate,double time)
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
	return "sbi [principal=" + principal + ", rate=" + rate + ", time=" + time + "]";
}

}
