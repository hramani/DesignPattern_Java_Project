package state;
import outputpro.op;
public class s7 extends s
{
	@Override
    public void Receipt()
    {
     op.printReceipt();
     
    }
	@Override
	public void NoReceipt()
    {
     op.NoReceipt();
     
    }
	
	@Override
	public void ReturnCash()
	{
		
		op.returnCash();
	}
}
