package driver;

//importing the classes from the package
import abstractfactory.af;

import abstractfactory.cf2;
import abstractfactory.cf3;
import datastore.data;
import mdaefsm.mda;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import state.s0;
import state.s1;
import state.s2;
import state.s3;
import state.s4;
import state.s5;
import state.s6;
import state.s7;

import inputpro.GP2;
import inputpro.GP3;
import outputpro.op;


public class maindriver
{
	static Scanner input=new Scanner(System.in);
	static BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException
    {
        System.out.println("\n	\t\t\t Gas Pump Model\t \t");
		System.out.println("\n	Select the required Gas Pump from the available pumps : GasPump-1 or GasPump-2 or GasPump-3 \t\t  ");
		//System.out.println("\n\t 1. GasPump-1 \t ");
		System.out.println("\n\t 1. GasPump-1 \t ");
		System.out.println("\n\t 2. GasPump-2 \t");
		System.out.println("\n Key in your choice \t \t ");
		int choice = input.nextInt();
        switch(choice)
        {
               
                case 1:
                {
                    
                	
                	GP2 g2 = new GP2(); //g2 represents the object of Gas Pump2
                	s0 s0_o  = new s0();//s0_o represents the object Of state 0
                    s1 s1_o = new s1();
                    s2 s2_o = new s2();
                    s3 s3_o = new s3();
                    s4 s4_o = new s4();
                    s5 s5_o = new s5();
                    s6 s6_o = new s6();
                    s7 s7_o = new s7();
                    mda mda_o = new mda();
                    op op_o = new op();
                    cf2 cf2_o = new cf2();
                    data d_o;
                    d_o = cf2_o.getdata();
                    g2.setMDA(mda_o);//Setting the mda with the mda object created
                    g2.setfactory(cf2_o);// Setting the object of the concrete factory 2 
                    g2.setdata(d_o);
                    s0_o.set_op(op_o);
                    s0_o.setStateId(0);
                    s1_o.set_op(op_o);
                    s1_o.setStateId(1);
                    s2_o.set_op(op_o);
                    s2_o.setStateId(2);
                    s3_o.set_op(op_o);
                    s3_o.setStateId(3);
                    s4_o.set_op(op_o);
                    s4_o.setStateId(4);
                    s5_o.set_op(op_o);
                    s5_o.setStateId(5);
                    s6_o.set_op(op_o);
                    s6_o.setStateId(6);
                    s7_o.set_op(op_o);
                    s7_o.setStateId(7);
                    op_o.setData(d_o);
                    op_o.setfactory(cf2_o);
                    mda_o.setStates(s0_o);    
                    mda_o.setStatesList(s0_o,s1_o,s2_o,s3_o,s4_o,s5_o,s6_o,s7_o);  
                    String input=null;
                    int ch;
                    while(true)
                    {
                    	System.out.println("\n\n Please select your option from the list of the available choices for GasPump-2\t\t");
						System.out.println("\n\t\t 0.\t Activate (Regular,Super) "); 
						System.out.print(" 1.\t Start ");
						System.out.print(" 2.\t PayCredit ");
						System.out.print(" 3.\t Reject");
						System.out.print(" 4.\t Cancel ");
						System.out.println(" 5.\t Approved  ");
						System.out.print(" 6.\t Super ");
						System.out.print(" 7.\t Regular ");
						System.out.print(" 8.\t StartPump");
						System.out.print(" 9.\t PumpGallon");
						System.out.print(" 10.\t StopPump");
						System.out.print(" Press any other key to exit \n\n ");
						input=buf.readLine();
                        ch=Integer.parseInt(input);
                        switch(ch)
                        {
					case 0: System.out.println(" \nEnter the value of a to activate");
                    			float a=Float.parseFloat(buf.readLine());
                    			System.out.println("\n Enter the value of b to activate");
                    			float b=Float.parseFloat(buf.readLine());
                                        
                    			g2.Activate(a,b);      //calls method activate in GasPump1
                    			break;

							case 1: g2.Start();   
                        		break;
                        		
							case 2: g2.PayCredit();   
                    			break;
                    			
							case 3: g2.Reject();   
                        		break;
                        		
							case 4: g2.Cancel();   
                        		break;
                        		
							case 5: g2.Approved();   
                        		break;
                        		
							case 6:g2.Super();
                    			break;
                    			
							case 7:g2.Regular();
                    			break;
	
							case 8: g2.StartPump();   
                        		break;
							case 9: g2.PumpGallon();   
                        		break;
							case 10: g2.StopPump();   
                        		break;
	                    default: 
                        System.out.println("\n Please enter a correct option from the list");
                    }
                }

          
              }
              case 2:
              {
                    GP3 g3 = new GP3(); //g3 represents the object of Gas Pump3
                	s0 s0_o  = new s0();//s0_o represents the object Of state 0
                    s1 s1_o = new s1();
                    s2 s2_o = new s2();
                    s3 s3_o = new s3();
                    s4 s4_o = new s4();
                    s5 s5_o = new s5();
                    s6 s6_o = new s6();
                    s7 s7_o = new s7();
                    mda mda_o = new mda();
                    op op_o = new op();
                    cf3 cf3_o = new cf3();
                    data d_o;
                    d_o = cf3_o.getdata();
                    g3.setMDA(mda_o);//set the mda with the mda object created
                    g3.setfactory(cf3_o);
                    g3.setdata(d_o);
                    s0_o.set_op(op_o);
                    s0_o.setStateId(0);
                    s1_o.set_op(op_o);
                    s1_o.setStateId(1);
                    s2_o.set_op(op_o);
                    s2_o.setStateId(2);
                    s3_o.set_op(op_o);
                    s3_o.setStateId(3);
                    s4_o.set_op(op_o);
                    s4_o.setStateId(4);
                    s5_o.set_op(op_o);
                    s5_o.setStateId(5);
                    s6_o.set_op(op_o);
                    s6_o.setStateId(6);
                    s7_o.set_op(op_o);
                    s7_o.setStateId(7);
                    op_o.setData(d_o);
                    op_o.setfactory(cf3_o);
                    mda_o.setStates(s0_o);    
                    mda_o.setStatesList(s0_o,s1_o,s2_o,s3_o,s4_o,s5_o,s6_o,s7_o);  
                    String input=null;
                    int ch;
                    while(true)
                    {
                    	System.out.println("\n Please select your option from the list of the available choices for GasPump-3\t\t");
						System.out.print(" 0. Activate (Regular, Premium, Super) "); 
						System.out.print("\t 1.\t Start()");
						System.out.print("\t 2.\t PayCash()  ");
						System.out.print("\t 3.\t Cancel()");
                                                System.out.print("\t 4.\t Super()");
						System.out.print("\t 5.\t Premium()");
						System.out.println("\t 6.\t Regular()");
						System.out.print("\t 7.\t StartPump()");
						System.out.print("\t 8.\t PumpLiter()");
						System.out.print("\t 9.\t StopPump()");
						System.out.print("\t 10.\t PrintReceit()");
						System.out.print("\t 11.\t NoReceipt()");
						System.out.print("\t Press any other key to exit \n\n ");
						input=buf.readLine();
                                               
                        ch=Integer.parseInt(input);
                        switch(ch)
                        {
                        	case 0: System.out.println(" \n\n Enter the value of a to activate");
                            	float a=Float.parseFloat(buf.readLine());
                            	System.out.println(" \n\n Enter the value of b to activate");
                            	float b=Float.parseFloat(buf.readLine());
                                System.out.println("\n Enter the value of c to activate");
                    		float c=Float.parseFloat(buf.readLine());
                            	g3.Activate(a,b,c);      //calls method activate in GasPump1
                            	break;

                        case 1: g3.Start();   
                        		break;
                        		
                        case 2: System.out.println("\n Enter the cash amount "); 
                        		float c2=Float.parseFloat(buf.readLine());
                        		g3.PayCash(c2);  
                        		break;
                        		
                        case 3: g3.Cancel();   
                            	break;
                                
                        case 4: g3.Super();  
                            	break;
                            	
                        case 5: g3.Premium();  
                            	break;
                            	
                        case 6: g3.Regular();   
                            	break;
                            	
                        case 7: g3.StartPump();   
                            	break;
                            	
                        case 8: g3.PumpLiter();
                        	break;

                        case 9: g3.StopPump();   
                            	break;
                            
                        case 10: g3.Receipt();
                        	break;
                        	
                        case 11: g3.NoReceipt();
                        	break;
                        
                        default: 
                        	System.out.println("\n \n Please enter a correct option from the list \n ");
                                System.out.println("\n \n Please enter any key to exit \n "); 
                                break;

                    }
                        
                }

          
            }
                
                
                
                
            }
    }
	
}

