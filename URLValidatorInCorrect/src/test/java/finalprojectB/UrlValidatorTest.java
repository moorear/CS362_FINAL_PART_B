
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }



   public void testManualTest()
   {
      //You can use this function to implement your manual testing
      UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      assertTrue(urlValidator.isValid("http://www.google.com"));

   }

   //Testing for Schemes
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing
   UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
   assertTrue(urlValidator.isValid("http://www.google.com"));
   //assertTrue(urlValidator.isValid("h3t://go.com")); //h3t scheme doesnt work
   assertTrue(urlValidator.isValid("http://go.com"));
   assertTrue(urlValidator.isValid("ftp://255.com"));

   }

   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing

   }
   //You need to create more test cases for your Partitions if you need to

   public void testIsValid()
   {
	   //You can use this function for programming based testing
     //String[] schemes = {"http","https"};

   }



}
