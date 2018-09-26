class Rational{
	int num,den;
	public void set(int a,int b){
		if(b==0)
			b=1;
		if(b<0)
			{
				b=-b;
				a=-a;
			}
		int h=gcd(a,b);
		num=a/h;
		den=b/h;
		
	}
	public int gcd(int c,int d){
		int min,g=1;
		if(c>d)
			min=d;
		else
			min=c;
		for(int i=2;i<=min;i++)
			if(c%i==0 && d%i==0)
				g=i;
		return g;
		}
	public Rational add(Rational a){
		Rational r=new Rational();
		r.den=den*a.den;
		r.num=num*a.den + a.num*den;
		int i=gcd(r.num,r.den);
		r.num=r.num/i;
		r.den=r.den/i;
		return r;
	}
	public Rational less(Rational a){
		Rational r=new Rational();
		r.den=den*a.den;
		r.num=num*a.den - a.num*den;
		int i=gcd(r.num,r.den);
		r.num=r.num/i;
		r.den=r.den/i;
		return r;
	}
	public Rational mul(Rational a){
		Rational r=new Rational();
		r.den=den*a.den;
		r.num=num*a.num;
		int i=gcd(r.num,r.den);
		r.num=r.num/i;
		r.den=r.den/i;
		return r;
	}
	public Rational divide(Rational a){
		Rational r=new Rational();
		r.den=den*a.num;
		r.num=num*a.den;
		int i=gcd(r.num,r.den);
		r.num=r.num/i;
		r.den=r.den/i;
		return r;
	}
	public void show(){
		System.out.println("The rational no is"+num+"/"+den);
	}
}