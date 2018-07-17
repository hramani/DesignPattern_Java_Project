/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import datastore.data;

/**
 *
 * @author hiral ramani
 */
public abstract class ReturnCash {
    
	 data dobj;
	public abstract void returnCash();
	 public void setdata(data dt)
	    {
	        dobj=dt;
	    }
}
