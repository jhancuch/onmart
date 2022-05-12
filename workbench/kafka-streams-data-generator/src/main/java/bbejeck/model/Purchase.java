/*
 * Copyright 2016 Bill Bejeck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bbejeck.model;

import java.util.Date;
import java.util.Objects;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

/**
 * User: Bill Bejeck
 * Date: 2/20/16
 * Time: 9:09 AM
 */
public class Purchase {

	private String firstName;
	private String lastName;
	private String customerId;
	private String creditCardNumber;
	private String itemPurchased;
	private String department;
	private int quantity;
	private double price;
	private Date purchaseDate;
	private String zipCode;
	private String distrCenterId;
	private String city;
	private String state;
	private String country;
	private String region;
	private String orderId;
	private String productId;
	private int rating;
	private String category;
	private Date deliveryDate;
	private String shippingClass;
	private String segment;
	private double sales;
	private double discount;
	private double profit;
	private double shippingCost;
	private String orderPriority;
	private String purchaseStatus;
	private String returnedPurchase;
	private String purchaseDeliveryDelayed; 
	private String purchasedProductReviewID;
	private String friends; 
	private String sharedWithFriends; 

	
      
    private static DecimalFormat df = new DecimalFormat("0.00");

    private Purchase(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        customerId = builder.customerId;
        creditCardNumber = builder.creditCardNumber;
        itemPurchased = builder.itemPurchased;
        quantity = builder.quantity;
        price = builder.price;
        purchaseDate = builder.purchaseDate;
        zipCode = builder.zipCode;
        department = builder.department;
        distrCenterId = builder.distrCenterId;
        city = builder.city;
        state = builder.state;
        country = builder.country;
        region = builder.region;
        orderId = builder.orderId;
        productId = builder.productId;
        rating = builder.rating;
        category = builder.category;
        deliveryDate = builder.deliveryDate;
        shippingClass = builder.shippingClass;
        segment = builder.segment;
        sales = builder.sales;
        discount = builder.discount;
        profit = builder.profit;
        shippingCost = builder.shippingCost;
        orderPriority = builder.orderPriority;
		purchaseStatus = builder.purchaseStatus;
		returnedPurchase = builder.returnedPurchase; 
		purchaseDeliveryDelayed = builder.purchaseDeliveryDelayed ; 
		purchasedProductReviewID = 	builder.purchasedProductReviewID;
		friends  = 	builder.friends; 
		sharedWithFriends = builder.sharedWithFriends;


    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Purchase copy) {
        Builder builder = new Builder();
        builder.firstName = copy.firstName;
        builder.lastName = copy.lastName;
        builder.creditCardNumber = copy.creditCardNumber;
        builder.itemPurchased = copy.itemPurchased;
        builder.quantity = copy.quantity;
        builder.price = copy.price;
        builder.purchaseDate = copy.purchaseDate;
        builder.zipCode = copy.zipCode;
        builder.customerId = copy.customerId;
        builder.department = copy.department;
        builder.distrCenterId = copy.distrCenterId;
        builder.city = copy.city;
        builder.state = copy.state;
        builder.country = copy.country;
        builder.region = copy.region;
        builder.orderId = copy.orderId;
        builder.productId = copy.productId;
        builder.rating = copy.rating;
        builder.category = copy.category;
        builder.deliveryDate = copy.deliveryDate;
        builder.shippingClass = copy.shippingClass;
        builder.segment = copy.segment;
        builder.sales = copy.sales;
        builder.discount = copy.discount;
        builder.profit = copy.profit;
        builder.shippingCost = copy.shippingCost;
        builder.orderPriority = copy.orderPriority;
		builder.purchaseStatus = copy.purchaseStatus;
		builder.returnedPurchase = copy.returnedPurchase; 
		builder.purchaseDeliveryDelayed = copy.purchaseDeliveryDelayed;
		builder.purchasedProductReviewID = copy.purchasedProductReviewID;
		builder.friends = copy.friends;
		builder.sharedWithFriends = copy.sharedWithFriends;
		
        return builder;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getItemPurchased() {
        return itemPurchased;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getDepartment() {
        return department;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getDistrCenterId() {
        return distrCenterId;
    }
    
    public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String getRegion() {
		return region;
	}
	public String getOrderId() {
		return orderId;
	}
	public String getProductId() {
		return productId;
	}
	
	
    public int getRating() {
        return rating;
    }
	public String getCategory() {
		return category;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public String getShippingClass() {
		return shippingClass;
	}

	public String getSegment() {
		return segment;
	}

	public double getSales() {
		return sales;
	}

	public double getDiscount() {
		return discount;
	}

	public double getProfit() {
		return profit;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public String getOrderPriority() {
		return orderPriority;
	}

	public String getPurchaseStatus() {
		return purchaseStatus;
	}
	
	public String getReturnedPurchase() {
		return returnedPurchase;
	} 
	

	public String getPurchaseDeliveryDelayed() {
		return purchaseDeliveryDelayed;
	}
	
	public String getPurchasedProductReviewID() {
		return purchasedProductReviewID;
	}
	
	public String getFriends() {
		return friends;
	} 
	
	public String getSharedWithFriends() {
		return sharedWithFriends;
	}





	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase)) return false;

        Purchase purchase = (Purchase) o;

        if (quantity != purchase.quantity) return false;
        if (Double.compare(purchase.price, price) != 0) return false;
        if (firstName != null ? !firstName.equals(purchase.firstName) : purchase.firstName != null) return false;
        if (lastName != null ? !lastName.equals(purchase.lastName) : purchase.lastName != null) return false;
        if (customerId != null ? !customerId.equals(purchase.customerId) : purchase.customerId != null) return false;
        if (creditCardNumber != null ? !creditCardNumber.equals(purchase.creditCardNumber) : purchase.creditCardNumber != null)
            return false;
        if (itemPurchased != null ? !itemPurchased.equals(purchase.itemPurchased) : purchase.itemPurchased != null)
            return false;
        if (department != null ? !department.equals(purchase.department) : purchase.department != null) return false;
        if (orderId != null ? !orderId.equals(purchase.orderId) : purchase.orderId != null) return false;
        if (zipCode != null ? !zipCode.equals(purchase.zipCode) : purchase.zipCode != null) return false;
        return distrCenterId != null ? distrCenterId.equals(purchase.distrCenterId) : purchase.distrCenterId == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (creditCardNumber != null ? creditCardNumber.hashCode() : 0);
        result = 31 * result + (itemPurchased != null ? itemPurchased.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + quantity;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (distrCenterId != null ? distrCenterId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return "Purchase {\n" +
                " orderId: '" + orderId + "\',\n" +
                " purchaseDate: " + purchaseDate + "\',\n" +
                " deliveryDate: '" + deliveryDate + "\',\n" +
                " shippingClass: '" + shippingClass + "\',\n" +
                " customerId: '" + customerId + "\',\n" +
                " firstName: '" + firstName + "\',\n" +
                " lastName: '" + lastName + "\',\n" +
                " creditCardNumber: '" + creditCardNumber + "\',\n" +
                " segment: '" + segment + "\',\n" +
                " zipCode: '" + zipCode + "\',\n" +
                " city: '" + city + "\',\n" +
                " state: '" + state + "\',\n" +
                " country: '" + country + "\',\n" +
                " region: '" + region + "\',\n" +
                " distrCenterId: '" + distrCenterId + "\',\n" +         
                " productId: '" + productId + "\',\n" +
                " rating: '" + rating + "\',\n" +
                " department: '" + department + "\',\n" +
                " category: '" + category + "\',\n" +
                " itemPurchased: '" + itemPurchased + "\',\n" +
                " quantity: '" + quantity + "\',\n" +
                " price: '" + price + "\',\n" +
                " sales: '" + df.format(sales) + "\',\n" +
                " discount: '" + discount + "\',\n" +
                " profit: '" + df.format(profit) + "\',\n" +
                " shippingCost: '" + shippingCost + "\',\n" +
                " orderPriority: '" + orderPriority + "\'\n" +
				" purchaseStatus: '" + purchaseStatus + "\'\n" +
				" returnedPurchase: '" + returnedPurchase + "\'\n" +
				" purchaseDeliveryDelayed: '" + purchaseDeliveryDelayed + "\'\n" + 
				" purchasedProductReviewID: '" + purchasedProductReviewID + "\'\n" + 
				" friends: '" + friends + "\'\n" + 
				" sharedWithFriends: '" + sharedWithFriends + "\'\n" +

                '}';
    }

    public static final class Builder {
        private String productId;
        private int rating;
	    private String firstName;
        private String lastName;
        private String customerId;
        private String creditCardNumber;
        private String itemPurchased;
        private int quantity;
        private double price;
        private Date purchaseDate;
        private String zipCode;
        private String department;
        private String orderId;
        private String distrCenterId;     
        private String city;
        private String state;
        private String country;
        private String region;
        private String category;
        
        private Date deliveryDate;
        private String shippingClass;
        private String segment;
        
        private double sales;
        private double discount;
        private double profit;
        private double shippingCost;
        private String orderPriority;
		private String purchaseStatus;
		private String returnedPurchase;
		private String purchaseDeliveryDelayed;
		private String purchasedProductReviewID; 
		private String friends; 
		private String sharedWithFriends; 



        private static final String CC_NUMBER_REPLACEMENT="xxxx-xxxx-xxxx-";

        private Builder() {
        }

        public Builder firstName(String val) {
            firstName = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }


        public Builder maskCreditCard(){
            Objects.requireNonNull(this.creditCardNumber, "Credit Card can't be null");
            String[] parts = this.creditCardNumber.split("-");
            if (parts.length < 4 ) {
                this.creditCardNumber = "xxxx";
            } else {
                String last4Digits = this.creditCardNumber.split("-")[3];
                this.creditCardNumber = CC_NUMBER_REPLACEMENT + last4Digits;
            }
            return this;
        }

        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder distrCenterId(String distrCenterId) {
            this.distrCenterId = distrCenterId;
            return this;
        }

        public Builder creditCardNumber(String val) {
            creditCardNumber = val;
            return this;
        }
        
        public Builder itemPurchased(String val) {
            itemPurchased = val;
            return this;
        }

        public Builder quantity(int val) {
            quantity = val;
            return this;
        }

        public Builder price(double val) {
            price = val;
            return this;
        }

        public Builder purchaseDate(Date val) {
            purchaseDate = val;
            return this;
        }

        public Builder zipCode(String val) {
            zipCode = val;
            return this;
        }
        
        public Builder city(String val) {
        	city = val;
        	return this;
        }
        
        public Builder state(String val) {
        	state = val;
        	return this;
        }
        
        public Builder country(String val) {
        	country = val;
        	return this;
        }
        
        public Builder region(String val) {
        	region = val;
        	return this;
        }
        
        public Builder productId(String val) {
        	productId = val;
        	return this;
        }


        public Builder rating(int val) {
            rating = val;
            return this;
        }
        
        public Builder category(String val) {
        	category = val;
        	return this;
        }

        public Builder deliveryDate(Date val) {
        	deliveryDate = val;
        	return this;
        }
        
        public Builder shippingClass(String val) {
        	shippingClass = val;
        	return this;
        }
        
        public Builder segment(String val) {
        	segment = val;
        	return this;
        }
        
        public Builder sales(double val) {
        	sales = val;
        	return this;
        }
        
        public Builder discount(double val) {
        	discount = val;
        	return this;
        }
        
        public Builder profit(double val) {
        	profit = val;
        	return this;
        }
        
        public Builder shippingCost(double val) {
        	shippingCost = val;
        	return this;
        }
        
        public Builder orderPriority(String val) {
        	orderPriority = val;
        	return this;
        }
		
        public Builder purchaseStatus(String val) {
        	purchaseStatus = val;
        	return this;
        }
		
        public Builder returnedPurchase(String val) {
        	returnedPurchase = val;
        	return this;
        }		
		
		public Builder purchaseDeliveryDelayed(String val) {
        	purchaseDeliveryDelayed = val;
        	return this;
        }
		
		public Builder purchasedProductReviewID(String val) {
        	purchasedProductReviewID = val;
        	return this;
        } 
		
		public Builder friends(String val) {
        	friends = val;
        	return this;
        }
		
		public Builder sharedWithFriends(String val) {
        	sharedWithFriends = val;
        	return this;
        }

 		
		
		
        public Purchase build() {
            return new Purchase(this);
        }
    }
}
