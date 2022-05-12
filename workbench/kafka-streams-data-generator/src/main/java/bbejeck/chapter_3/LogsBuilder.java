package bbejeck.chapter_3;
import bbejeck.model.BeerPurchase;
import bbejeck.model.ClickEvent;
import bbejeck.model.Currency;
import bbejeck.model.PublicTradedCompany;
import bbejeck.model.Purchase;
import bbejeck.model.StockTransaction;
import com.github.javafaker.ChuckNorris;
import com.github.javafaker.Faker;
import com.github.javafaker.Finance;
import com.github.javafaker.Name;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.io.FileWriter;
import java.io.*;
import java.util.stream.Collectors;
import java.util.*;
import java.lang.*;
import java.util.logging.*;
import bbejeck.util.datagen.DataGenerator;




public class LogsBuilder{
	
	public static int purchasesGenerated = 0;
	

	
	public static void buildHeadings()    
	{	

			try {

                FileWriter writer = new FileWriter("/mnt/c/Users/jwnha/Documents/_School/MSDS/2022Spring/streaming/week 6/Project_Phase_2_Hancuch/OnMartData/PurchasesLog.csv",true);
                List<String> record = new ArrayList<>();
				
            	record.add("CustomerID");
				record.add("FirstName");
				record.add("LastName");
				record.add("CreditCardNumber");
				record.add("OrderID");
				record.add("PurchaseDate");
				record.add("DeliveryDate");
				record.add("ShippingClass");
				record.add("ProductID");
				record.add("Department");
				record.add("Category");
				record.add("ItemPurchased");
				record.add("Quantity");
				record.add("Price");
				record.add("ShippingCost");
				record.add("Discount");
				record.add("Sales");
				record.add("Profit");
				record.add("DistributionCenterID");
				record.add("DeliveryZipCode");
				record.add("HomeZipCode");
				record.add("TransactionStatus");
				record.add("City");
				record.add("Region");
				record.add("State");
				record.add("Country");
				record.add("Segment");
				record.add("OrderPriority");
				record.add("OrderReturned");                    
				record.add("OrderDeliveryDelayed");			
				record.add("Rating");
				record.add("ReviewID");
				record.add("Friends");
				record.add("SharedWith");
				
				record.add("ZipCodeInSupplyChainNet");  
				record.add("CityInSupplyChainNet");
				record.add("StateInSupplyChainNet");
				record.add("LatitudeInSupplyChainNet");
				record.add("LongitudeInSupplyChainNet");
				record.add("FacilityIDInSupplyChainNet");
				record.add("DistributionCenterIDInSupplyChainNet");
				record.add("WarehouseIDInSupplyChainNet");
				
				
                String collect = record.stream().collect(Collectors.joining(","));
                writer.write(collect);
                writer.close();
            }

            catch (Exception e)
            {
                System.out.println(e);
            }
						
			
			try {

                FileWriter writer = new FileWriter("/mnt/c/Users/jwnha/Documents/_School/MSDS/2022Spring/streaming/week 6/Project_Phase_2_Hancuch/OnMartData/WarehouseDistributionCenterLog.csv",true);  
                List<String> record = new ArrayList<>();
				
				record.add("FacilityZip");  
				record.add("FacilityCity");
				record.add("FacilityState");
				record.add("FacilityLatitude");
				record.add("FacilityLongitude");
				record.add("Facility_ID");
				record.add("FacilityDistribution_Center_ID");
				record.add("FacilityWarehouse_ID");                 
				record.add("FacilityTotalOrdersShipped");
				record.add("FacilityTotalOrdersReturned");
				record.add("FacilityTotalOrdersDelayedDelivery");
				
                String collect = record.stream().collect(Collectors.joining(","));
                writer.write(collect);
                writer.close();
            }

            catch (Exception e)
            {
                System.out.println(e);
            }
		
			
		

	
	}

	
	
	// Update the CSV Log to add the new purchase/order
	
	public static void buildCSVLog(Purchase p)
	{
		// The following are random numbers used to indicate  if the purchased product was:
		// 		1. Returned to retailer
		//		2. Product delivery to customer delayed after the initial promised delivery date
		//		3. If the Purchase/Order was declined for some reason by Security or Fraud Detection Department
		
		int returnedPurchase = new Random().nextInt(5)+1;
		int purchaseDeliveryDelayed = new Random().nextInt(5)+1;
		int purchaseStatus = new Random().nextInt(5)+1;
		
		
		
		try {

			FileWriter writer = new FileWriter("/mnt/c/Users/jwnha/Documents/_School/MSDS/2022Spring/streaming/week 6/Project_Phase_2_Hancuch/OnMartData/PurchasesLog.csv", true);
			List<String> record = new ArrayList<>();
			record.add("\r"+p.getCustomerId()); 
			record.add(p.getFirstName());
			record.add(p.getLastName());
			record.add(p.getCreditCardNumber());
			record.add(p.getOrderId());
			record.add(p.getPurchaseDate().toString());
			record.add(p.getDeliveryDate().toString());
			record.add(p.getShippingClass());
			record.add(p.getProductId());
			record.add(p.getDepartment());
			record.add(p.getCategory());
			record.add(p.getItemPurchased());
			record.add(Integer.toString(p.getQuantity()));
			record.add(Double.toString(p.getPrice()));
			record.add(Double.toString(p.getShippingCost()));
			record.add(Double.toString(p.getDiscount()));
			record.add(Double.toString(p.getSales()));
			record.add(Double.toString(p.getProfit()));
			record.add(DataGenerator.wdcMap.get(p.getZipCode()).getDistrCenterId());    
			record.add(p.getZipCode());
			record.add(p.getZipCode());

			record.add(p.getPurchaseStatus());

			record.add(p.getCity());  
			record.add(p.getRegion());
			record.add(p.getState());  
			record.add(p.getCountry());
			record.add(p.getSegment());
			record.add(p.getOrderPriority());
						
			record.add(p.getReturnedPurchase());
						
			record.add(p.getPurchaseDeliveryDelayed());
			
			record.add(Integer.toString(p.getRating()));
			
			
			record.add(p.getPurchasedProductReviewID());
			
						
			record.add(p.getFriends());
			
			record.add(p.getSharedWithFriends());
			
			
			record.add(p.getZipCode());
			record.add(DataGenerator.wdcMap.get(p.getZipCode()).getCity());   
			record.add(DataGenerator.wdcMap.get(p.getZipCode()).getState());
			record.add(DataGenerator.wdcMap.get(p.getZipCode()).getLatitude());   
			record.add(DataGenerator.wdcMap.get(p.getZipCode()).getLongitude());                   
			record.add(DataGenerator.wdcMap.get(p.getZipCode()).getFacilityId());
			record.add(DataGenerator.wdcMap.get(p.getZipCode()).getDistrCenterId());
			record.add(DataGenerator.wdcMap.get(p.getZipCode()).getWarehouseId());
			
			
			String collect = record.stream().collect(Collectors.joining(","));
			writer.write(collect);
			writer.close();
		}

		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		purchasesGenerated += 1;
		

		if ((purchasesGenerated % DataGenerator.DEFAULT_NUM_PURCHASES) == 0){
			System.out.println("\n\n_______________________________________________" +
								   "_______________________________________________" );
								   
			System.out.println("\n\n MockDataProducer Status: Total number of purchases produced is " + purchasesGenerated + 
								" out of " + DataGenerator.TOTAL_NUM_PURCHASES + " total expected \n");
								
								
			System.out.println("_______________________________________________" +
								   "_______________________________________________\n\n" );
			
		}
		
		if (purchasesGenerated == DataGenerator.TOTAL_NUM_PURCHASES)  			
		{

			purchasesGenerated += 1;
			
						
			try 
			{

		
				String collect = null;
				FileWriter writer = new FileWriter("/mnt/c/Users/jwnha/Documents/_School/MSDS/2022Spring/streaming/week 6/Project_Phase_2_Hancuch/OnMartData/WarehouseDistributionCenterLog.csv", true);
				for (int i = 1; i < DataGenerator.zipCodesValuesList.size(); i++)
				{
					
					List<String> record = new ArrayList<>();
					String zip = DataGenerator.zipCodesValuesList.get(i);
					record.add("\r"+DataGenerator.wdcMap.get(zip).getZip());
					record.add(DataGenerator.wdcMap.get(zip).getCity());
					record.add(DataGenerator.wdcMap.get(zip).getState());
					record.add(DataGenerator.wdcMap.get(zip).getLatitude());
					record.add(DataGenerator.wdcMap.get(zip).getLongitude());
					record.add(DataGenerator.wdcMap.get(zip).getFacilityId());
					record.add(DataGenerator.wdcMap.get(zip).getDistrCenterId());
					record.add(DataGenerator.wdcMap.get(zip).getWarehouseId());
					record.add(Integer.toString(DataGenerator.wdcMap.get(zip).getTotalPurchases()));
					record.add(Integer.toString(DataGenerator.wdcMap.get(zip).getTotalPurchasesReturned()));
					record.add(Integer.toString(DataGenerator.wdcMap.get(zip).getTotalPurchasesDeliveryDelayed()));
					
					collect = record.stream().collect(Collectors.joining(","));
					writer.write(collect);
					
					
				}
				writer.close();
				
				return;
			}

			catch (Exception e)
			{
				System.out.println(e);
			}
			
			return;
		}
		
	    
		
	}

}
