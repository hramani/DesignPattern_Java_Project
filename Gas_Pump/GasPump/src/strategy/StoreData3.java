package strategy;
public class StoreData3 extends StoreData
{
	@Override
    public void storeData()
    {
      float a, b, c;
      a=dobj.getfloata();
      dobj.setreg1_price(a);
      b=dobj.getfloatb();
      dobj.setpre_price(b);
      c=dobj.getfloatc();
      dobj.setsup_price(c);
    }
    
}