package abstractfactory;
import datastore.data;
import datastore.data2;
import strategy.StoreData;
import strategy.StoreData2;
import strategy.PayMsg;
import strategy.StoreCash;
import strategy.DisplayMenu;
import strategy.RejectMsg;
import strategy.SetW;
import strategy.SetPrice;
import strategy.ReadyMsg;
import strategy.SetInitialValues;
import strategy.PumpGasUnit;
import strategy.GasPumpedMsg;
import strategy.StopMsg;
import strategy.PrintReceipt;
import strategy.CancelMsg;
import strategy.NoReceipt;
import strategy.NoReceipt1;
import strategy.PayMsg1;
import strategy.StoreCash1;
import strategy.DisplayMenu1;
import strategy.RejectMsg1;
import strategy.ReturnCash;
import strategy.SetW1;
import strategy.SetPrice2;
import strategy.ReadyMsg1;
import strategy.SetInitialValues1;
import strategy.PumpGasUnit1;
import strategy.GasPumpedMsg1;
import strategy.StopMsg1;
import strategy.PrintReceipt1;
import strategy.CancelMsg1;

public class cf2 extends af
{
     data2 data2_o= new data2();  
	 public PrintReceipt getPrintReceipt()
    {
		
		 PrintReceipt pr =new PrintReceipt1();
		 pr.setdata(data2_o);
		       
	        return pr;
    }
	 public StoreData getStoreData()
    {
		 StoreData sd_o =new StoreData2();
		 sd_o.setdata(data2_o);
		 return sd_o;
    }
	 public SetInitialValues getSetInitialValues()
    {
		 SetInitialValues siv_o = new SetInitialValues1();
        siv_o.setdata(data2_o);
        return siv_o;
    }
	 public SetPrice getSetPrice()
    {
		 SetPrice sp_o = new SetPrice2();
	        sp_o.setdata(data2_o);
	        return sp_o;
    }
	 public StoreCash getStoreCash()
     {
		    StoreCash sc_o = new StoreCash1();
	        sc_o.setdata(data2_o);
	        return sc_o;
    }
	 public data getdata()
	 {
	        return data2_o;
	 }

	  public GasPumpedMsg getGasPumpedMsg()
    {
		  GasPumpedMsg gpm_o = new GasPumpedMsg1();
	        gpm_o.setdata(data2_o);
	        return gpm_o;

    }
	  public ReadyMsg getReadyMsg()
    {
		   ReadyMsg rm_o = new ReadyMsg1();
	        rm_o.setdata(data2_o);
	        return rm_o;

    }
	  public PayMsg getPayMsg()
    { 
		  PayMsg pm_o = new PayMsg1();
          pm_o.setdata(data2_o);
          return pm_o;

    }
	  public CancelMsg getCancelMsg()
	  {
		  CancelMsg cm_o = new CancelMsg1();
          cm_o.setdata(data2_o);
          return cm_o;
	  }
	  public StopMsg getStopMsg()
	  {
		  StopMsg sm_o = new StopMsg1();
          sm_o.setdata(data2_o);
          return sm_o;
	  }
	  public DisplayMenu getDisplayMenu()
	    {
		  DisplayMenu dm_o = new DisplayMenu1();
          dm_o.setdata(data2_o);
          return dm_o;
	    }
	    public PumpGasUnit getPumpGasUnit()
	    {
	    	 PumpGasUnit pgu_o = new  PumpGasUnit1();
	          pgu_o.setdata(data2_o);
	          return pgu_o;
	    }
	    
	    public RejectMsg getRejectMsg()
	    {
	    	RejectMsg rm_o = new RejectMsg1();
	          rm_o.setdata(data2_o);
	          return rm_o;
	    }
	    
	    public SetW getsetW()
	    {
	    	  SetW sw_o = new SetW1();
	          sw_o.setdata(data2_o);
	          return sw_o;
	    }
	    public NoReceipt getNoReceipt()
	    {
	    	NoReceipt rm_o = new NoReceipt1();
	          rm_o.setdata(data2_o);
	          return rm_o;
	    }
		@Override
		public ReturnCash returnCash() {
			// TODO Auto-generated method stub
			return null;
		}
	    
}
