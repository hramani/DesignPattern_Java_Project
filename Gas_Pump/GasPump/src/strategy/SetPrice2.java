package strategy;
public class SetPrice2 extends SetPrice
{
	@Override
    public void setPrice(int g)
    {
       float a=dobj.getreg_price();
       float b=dobj.getsup_price();
       float c = dobj.getpre_price();
       if( g== 1)
       {
    	   dobj.setprice(a);
       }
       else if (g == 2)
       {
           dobj.setprice(b);
       }
       else if (g == 3)
       {
    	   dobj.setfloatc(c);
       }
       }
    
}

