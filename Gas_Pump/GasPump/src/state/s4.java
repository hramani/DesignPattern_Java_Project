package state;
import outputpro.op;

public class s4 extends s
{
	@Override
	public void Cancel()
    {
      op.cancelMsg();
     
    }
        @Override
	public void SelectGas(int g)
    {
      op.setPrice(g);
     
    }
    
}
