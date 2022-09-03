package function;

import pages.LoginPage;

public class Login {
	
static LoginPage loginpage=new LoginPage();

	 public static void clickSignIn(){
		 loginpage.clickSignIn();
	    }
	 
	 
	 public static void enterEmail(){
		 loginpage.enterEmail();
	    }
	 
	 public static void clickCreateAccount(){
		 loginpage.clickCreateAccount();
	    }
	 
	 public static void selectGender(){
		 loginpage.selectGender();
	    }
	
	 public static void enterFirstName(){
		 loginpage.enterFirstName();
	    }
	 
	 public static void enterLastName(){
		 loginpage.enterLastName();
	    }
	 
	 public static void enterEmailAddress(){
		 loginpage.enterEmailAddress();
	    }
	 
	 public static void enterPassword(){
		 loginpage.enterPassword();
	    }
	 
	 public static void enterFirstNameForAddress(){
		 loginpage.enterFirstNameForAddress();
	    }
	 
	 public static void enterLastNameForAddress(){
		 loginpage.enterLastNameForAddress();
	    }
	 
	 public static void enterAaddress(){
		 loginpage.enterAaddress();
	    }
	 
	 public static void enterCity(){
		 loginpage.enterCity();
	    }
	 
	 public static void selectState(){
		 loginpage.selectState();
	    }
	 
	 public static void enterZip(){
		 loginpage.enterZip();
	    }
	 
	 public static void enterMobilePhone(){
		 loginpage.enterMobilePhone();
	    }
	 
	 public static void enterAddressAlias(){
		 loginpage.enterAddressAlias();
	    }
	 
	 public static void clickRegister(){
		 loginpage.clickRegister();
	    }
	 
	 public static void clickTshirts(){
		 loginpage.clickTshirts();
	    }
	 
	 public static void addProduct(){
		 loginpage.addProduct();
	    }
	 
	 public static String getLoggedInUserName(){
		 return loginpage.getLoggedInUserName();
	    }
	 
	 public static String getShoppingCartSummary(){
		 return loginpage.getShoppingCartSummary();
	    }
	 
	 public static void beforeTest(){
		 loginpage.beforeTest();
	    }
	 
	 public static void afterTest(){
		 loginpage.afterTest();
	    }
}
