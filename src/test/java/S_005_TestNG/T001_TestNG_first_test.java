package S_005_TestNG;

import org.testng.annotations.Test;

/*
1. Open url  
2. Login
3. Logout 
*/
public class T001_TestNG_first_test {
	/*//Wihout priority
	 * @Test void login() { System.out.println("Url opened "); }
	 * 
	 * @Test void open_url() { System.out.println("Login done "); }
	 * 
	 * @Test void logout() { System.out.println("Log out done"); }
	 */

	//With priority
	/*
	 * @Test(priority =1) void login() { System.out.println("Url opened "); }
	 * 
	 * @Test (priority =2) void open_url() { System.out.println("Login done "); }
	 * 
	 * @Test (priority =3) void logout() { System.out.println("Log out done"); }
	 */
	
	//priority can be random numbers no need them to be in sequence 
	/*
	 * @Test(priority =10) void login1() { System.out.println("Url opened "); }
	 * 
	 * @Test (priority =20) void open_url1() { System.out.println("Login done "); }
	 * 
	 * @Test (priority =30) void logout1() { System.out.println("Log out done"); }
	 */
	
	//If we do not provide any priority then by default last have the highest priority 
	/*
	 * @Test(priority =1) void login() { System.out.println("Url opened "); }
	 * 
	 * @Test (priority =2) void open_url() { System.out.println("Login done "); }
	 * 
	 * @Test void logout() { System.out.println("Log out done"); } //Log out done
	 * //Url opened //Login done
	 */	 
	
	//IF 2 test have same priority then they will be executed in alphabetical order 
	
	//We can have negative numbers also in priority , they will consider lowest number (here -1 ) as most priority 
	//-1,0,1
	
	
	  @Test(priority =-1) void login1() { System.out.println("Url opened "); }
	  
	  @Test (priority =0) void open_url1() { System.out.println("Login done "); }
	  
	  @Test (priority =2) void logout1() { System.out.println("Log out done"); } //
	//  Url opened // Login done // Log out done
	 
	
	//If we remove the @test from one test then only test having annotation will be executed rest not 
	
	/*
	 * @Test(priority =-1) void login1() { System.out.println("Url opened "); }
	 * 
	 * @Test (priority =0) void open_url1() { System.out.println("Login done "); }
	 * 
	 * void logout1() { System.out.println("Log out done"); } // //Url opened
	 * //Login done
	 */	 
}																					
