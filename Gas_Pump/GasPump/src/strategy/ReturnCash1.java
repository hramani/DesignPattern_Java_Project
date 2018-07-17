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
public class ReturnCash1 extends ReturnCash {

	@Override
	public void returnCash() {
		// TODO Auto-generated method stub
		
	   System.out.println(" The Cash to be returned is :"+ (dobj.getfloatc()- dobj.gettotal()));
		
	}
	
    
}
