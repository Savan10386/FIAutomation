package Com.FI.TestScripts;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class AddIndicator {
	
	InternetExplorerDriver oDriver;
    WebElement oElement ;
	@BeforeTest
	public void setUp() throws Exception {
		
		File file = new File("C:/Users/Savan/Desktop/selenium-2.33.0/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		 oDriver = new InternetExplorerDriver();
	   oDriver.get("http://fhf/RapidMain/Indicators/FinancialIndicators/Dashboard/FIDashboard.aspx");
		
	}
	
	
 @Test
	public void testLogin() throws Exception {
	 
	 
	 //mahesh check in
		try
		{
	     oDriver.findElement(By.id("ctl00_Repeater1_ctl00_HyperLinkIcon")).click();
	     
	     Thread.sleep(2000);
	     
	     oDriver.findElement(By.className("handle")).click(); 
	     
	     oDriver.findElement(By.id("ctl00_ctl00_ContentBody_TreeView1t43")).click();
	     
	     System.out.println("Text123");
	     
	     Thread.sleep(5000);
	     
	     //click on add indicator
	         
				oElement =oDriver.findElement(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_ListIndicator_gvIndicatorList_tcfooter7"));                                    
				List<WebElement> options = oElement.findElements(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_ListIndicator_gvIndicatorList_footer7_imgAddIndicator"));
				 for (WebElement option : options) {
				      option.click();
				      option.click();
				       break;    		
			}
				 
			    
	    	     
	     oDriver.findElement(By.id("txtIndicatorName")).sendKeys("New");
	     
	   //click on category
	    	    oDriver.findElement(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_AddIndicator_ucCategory_ddeCategory_B-1")).click();
				oElement =oDriver.findElement(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_AddIndicator_ucCategory_ddeCategory_DDD_DDTC_gvCategory_DXMainTable"));                                    
				 options = oElement.findElements(By.tagName("td"));
				 for (WebElement option : options) {
					 
					 if ("statistics".equals(option.getText()))
					 {
				      option.click();
				       break; 
					 }
			
				 
			}
				 //click on subcategory
				 oDriver.findElement(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_AddIndicator_ucSubCategory_ddeSubCategory_B-1")).click();
					oElement =oDriver.findElement(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_AddIndicator_ucSubCategory_ddeSubCategory_DDD_DDTC_gvSubCategory_DXMainTable"));                                    
					 options = oElement.findElements(By.tagName("td"));
					 for (WebElement option : options) {
						 
						 if ("statistics".equals(option.getText()))
						 {
					      option.click();
					       break; 
						 }
				
					 
				}
					 //click on Indictor type
					 oDriver.findElement(By.name("ctl00$ctl00$ContentBody$AdministrativeBody$AddIndicator$ucIndicatorTypes$ddlIndicatorType")).click();
					oElement = oDriver.findElement(By.id("ctl00$ctl00$ContentBody$AdministrativeBody$AddIndicator$ucIndicatorTypes$ddlIndicatorType"));
						//oElement =oDriver.findElement(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_AddIndicator_ucCategory_ddeCategory_DDD_DDTC_gvCategory_DXMainTable"));                                    
						 options = oElement.findElements(By.tagName("option"));
						 for (WebElement option : options) {
							 
							 if ("GL Financial".equals(option.getText()))
							 {
						      option.click();
						       break; 
							 }
					
						 
					}
						 //favourable trend
						 
						 oDriver.findElement(By.name("ctl00$ctl00$ContentBody$AdministrativeBody$AddIndicator$ucTrends$ddlTrends")).click();
							oElement =oDriver.findElement(By.name("ctl00$ctl00$ContentBody$AdministrativeBody$AddIndicator$ucTrends$ddlTrends"));                                    
							 options = oElement.findElements(By.tagName("option"));
							 for (WebElement option : options) {
								 
								 if ("Higher".equals(option.getText()))
								 {
							      option.click();
							       break; 
								 }
						
							 
						}
							 
							 //calculation type
							 
							 oDriver.findElement(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_AddIndicator_ucCalculationTypes_ddlCalculationType")).click();
								oElement =oDriver.findElement(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_AddIndicator_ucCalculationTypes_ddlCalculationType"));                                    
								 options = oElement.findElements(By.tagName("option"));
								 for (WebElement option : options) {
									 
									 if ("D".equals(option.getText()))
									 {
								      option.click();
								       break; 
									 }
							
								 
							}
								 oDriver.findElement(By.id("ctl00_ctl00_ContentBody_AdministrativeBody_AddIndicator_btnSave")).click();
		
			
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception e");
		}
	}
	@AfterTest
	public void tearDown() throws Exception {
		//oDriver.quit();
    		}
	
	public void dropdown()
	{
		
	}

}
