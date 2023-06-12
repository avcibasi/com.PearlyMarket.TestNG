US_01	TC_001	"To ensure that customers can 
create a user account on the website"	"The environment should be ready 
https://pearlymarket.com/"	Navigate to the website registration page. https://pearlymarket.com	Test Env: https://pearlymarket.com/	"User should be able to see the page
Register button should be clickable
User should be able to fill the blank
User should be able to fill the blank
User should be able to fill the blank
User should be able to click the button
User should be able to register"	PASSED																		
				Click on register button																					
				Enter Customer_Username	Customer_Username:merlin																				
				Enter Customer_Email	Customer_Email: merlin.syd@fullangle.org																				
				Enter Customer_Password	"Customer_Password: rpqxm6B@123
        Check the "I agree to the privacy policy" checkbox.																					
				Click on the "SIGN UP" button.																					

US_02	TC_01	Registration should NOT be available using previously registered credentials.  (Register)	The environment should be ready https://pearlymarket.com/	User should enter a registered username. 	username:enes4	It should tell me that this account is already registered	It tells me that this account is already registered																		
				User should enter a registered email address. 	email: dashel.cristhian@fullangle.org																				
				User should enter a registered password. 	Password:9=!PG&7KHmQp$-^kq																				
				Click on the SIGN UP button to register.																					
				"An account is already registered with your email address." should be visible.																					

US_02	TC_02	Registration should NOT be available using previously registered credentials.  (Register)	The environment should be ready https://pearlymarket.com/	User should enter a registered username. 	username:enes6	It should tell me that this account is already registered	It creates new account																		
				User should enter a registered email address. 	email: khaleed.hersh@fullangle.org																				
				User should enter a registered password. 	Password:9=!PG&7KHmQp$-^kqa																				
				Click on the SIGN UP button to register.																					
				"An account is already registered with your email address." should be visible.																					

US_03	TC_01	User should add Billing  Address	User should register before add billing address (User Story US_01)	Go to website https://pearlymarket.com/	https://pearlymarket.com/		PASSED																		
				click on my account	 	button is clickable																			
				click on sign in	 	button is clickable																			
				User should enter a registered username. and registered password 	merlin, rpqxm6B@123	box are interactable																			
				click on blue sign in button		button is clickable																			
				click on the My Account Button on Main page(very end of the page)		button is clickable																			
				click on Addresses Button on My Acount page		button is clickable																			
				click on add Button under Billing Address on My Acount page		button is clickable																			
				Enter First name and Last name on My address section	Baris Manco	box are interactable																			
				Select Country / Region and enter Street Address on same menu	U.S  111 old medford ave	box are interactable																			
				enter your town and select your state		box are interactable																			
				enter your zip code and phone number		box are interactable																			
				Verify that The registered email address  filled in automatically.		veryfied																			
				click on save address		button is clickable																			
				verify that the Billing Address be added.		veryfied																			

US_04	TC_001	User should be able to add Shipping Address	The environment should be ready https://pearlymarket.com	Go to website https://pearlymarket.com/	https://pearlymarket.com/	I should see that shipping address added	PASSED																		
				click on my account																					
				click on sign in																					
				enter your  email and password	randal.adham@fullangle.org//abcde55+-*/																				
				click on blue sign in button																					
				click on addresses																					
				click on add button which is under shipping adress 																					
				enter your first and last name	Emre//Kaya																				
				select a country	Turkey																				
				enter your street address	Dere																				
				enter your town	Nilufer																				
				select your province	Bursa																				
				enter your zip code	16000																				
				click on save address																					
				verify shipping address																					

US5	TC01	Verify that the user can view their account details.	The environment should be ready https://pearlymarket.com	1. Login to the application.	Prod environmet: https://pearlymarket.com	The user should be able to see their account details, including first name, last name, display name, and email address.	PASS																		
				2. Navigate to "My Account" > "Account Details".																					

US5	TC02	Verify that the user can edit their first name,lastname,display name, email adress	The environment should be ready https://pearlymarket.com	1. Login to the application.	Prod environmet: https://pearlymarket.com	First name,lastname,display name, email address should be updated to the new value. The updated values should be visible in the account details.	PASS																		
				2. Navigate to "My Account" > "Account Details".																					
				3. Click on the "Edit" button next to the First Name field.																					
				4. Modify the first name.																					
				5. Click on the "Edit" button next to the Last Name field.																					
				6. Modify the last name.																					
				7. Click on the "Edit" button next to the Display Name field.																					
				8. Modify the display name.																					
				9. Click on the "Edit" button next to the Email Address field.																					
				10. Modify the email address.																					
				11. Click the "Save" button.																					

US5	TC03	Verify that the user can fill in the biography section.	The environment should be ready https://pearlymarket.com	1. Login to the application.	Prod environmet: https://pearlymarket.com	The biography should be saved with the new content. The updated biography should be visible in the account details.	PASS																		
				2. Navigate to "My Account" > "Account Details".																					
				3. Scroll down to the Biography section.																					
				4. Enter a new biography in the provided input field or textarea.																					
				5. Click the "Save" button.																					

US5	TC04	Verify that the user can change their password.	The environment should be ready https://pearlymarket.com	1. Login to the application.	Prod environmet: https://pearlymarket.com	Password should e´be changed succesfully	PASS																		
				2. Navigate to "My Account" > "Account Details".																					
				3. Scroll down to the Change Password section.																					
				4. Enter the current password, new password, and confirm the new password in the respective input																					
				
US_06	TC_01	The user should be able to find the desired product in the search box and add the product to cart.	"The prod environment 
should be ready
https://pearlymarket.com//"	1_Go to https://pearlymarket.com/	Prod environmet: https://pearlymarket.com//	I should be able to find my products and add them in my cart.	FAILED Add to cart button is not visible for "Iphone130" and "lego" products.																		
				2_Navigate to searchbar input	Products: Iphone, Lego, Camera																				
				3_Type three different products and click on search icon																					
				4_Click on "Add to Cart" button																					
				5_Assert that "...added to your cart." message is displayed.		
        
US_06	TC_02	User should see the items that have been added to the cart. The amount of products in the cart should be adjustable by the user.	"The prod environment 
should be ready
https://pearlymarket.com//"	1_Go to https://pearlymarket.com/	Prod environmet: https://pearlymarket.com//	I should be able to see my products in my cart and update their quantities.	PASSED																		
				2_Click on "cart" and then "view cart" buttons																					
				3_Verify that products are displayed in the cart																					
				4_Click on "+" and/or "-" icons and "update cart"																					
				5_Assert that "Cart updated." message is displayed.		
        
US_06	TC_03	User should be able to see the Billing Address in order to purchase the products, view and select payment options and complete the purchase.	"The prod environment 
should be ready
https://pearlymarket.com//"	1_Go to https://pearlymarket.com/	Prod environmet: https://pearlymarket.com//	I should be able to place the order and complete the purchase.	PASSED																		
				2_Click on "cart" and then "checkout" buttons																					
				3_Verify that Billing Address and Payment Options are displayed																					
				4_Fill the necessary inputs and select payment method																					
				5_Click on "Place Order" button																					
US_07	TC_001	"





"	"The  environment 
should be ready
https://pearlymarket.com//"	The user is on "https://pearlymarket.com" home page	"









https://pearlymarket.com/

"		PASSED																		
				"Click on ""Sign In"" button
Enter  registered ""Username or email address”
Enter “Password”
Click on ""SIGN IN"" button"																					
				User selects the first product for comparison		User should be able to see the selected product																			
				Click the "Compare" button		Compare icon should be clickable																			
				User goes to home page																					
				User selects the second product for comparison		User should be able to see the selected product																			
				Click the "Compare" button		Compare icon should be clickable																			
				User goes to home page																					
				User selects the third product for comparison		User should be able to see the selected product																			
				Click the "Compare" button		Compare icon should be clickable																			
				user goes to home page																					
				User selects the fourth product for comparison		Compare icon should be clickable																			
				Click the "Compare" button		User should be able to see the selected product																			
																									
US_07	TC_002	The user must be able to remove products from comparison and add new products	The environment should be ready https://pearlymarket.com/	User clicks the x(remove) button to remove one of the selected			PASSED																		
				product from comparison box																					
				User goes home page																				
				User select another product 																					
				Click the "Compare" button	https://pearlymarket.com/																				
																				
 US_07	TC_003	           The user must be able to compare selected products and remove products from 	The environment should be ready https://pearlymarket.com/	User clicks the "START COMPARE !" button	https://pearlymarket.com/		PASSED																		
				And verify that products are compared																					
				User clicks on "Clean All" button		User should be able to remove products from comparison screen																			
				Verify that all products are compared and deleted		User should be able to see nothing																			
																							
US_08	TC_001	"
To ensure that user can add her/his favorite items to her/his Wishlist on the website"	The environment should be ready  https://pearlymarket.com/	Navigate to the homepage of the website. https://pearlymarket.com	Test Env: https://pearlymarket.com/	"User should be able to access the homepage  of website
When user hover over Men link , it should be dropdown
Shoes link should be clickable and User should be able to click on it
User should be able to see wishlist Icon when user hover over Adidas Erkek Ayakkabı product 
User should be able to click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
User should be able to click on Wishlist Icon (Heart Sign) on the homepage to see the products user has added to the wishlist"	PASSED	"User should be able to access the homepage  of website
When user hover over Men link , it should be dropdown
Shoes link should be clickable and User should be able to click on it
User should be able to see wishlist Icon when user hover over Adidas Erkek Ayakkabı product 
User should be able to click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
User should be able to click on Wishlist Icon (Heart Sign) on the homepage to see the products user has added to the wishlist"																	
				Hover over Men Link																					
				Click on Shose link under Men Link																					
				Hover over Adidas Erkek Ayakkabi product																					
				Hover over Wishlist Icon that appears on Adidas Erkek Ayakkabı product																					
				Click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist																					
				Click on Wishlist Icon (Heart Sign) on the top of the page to see the products user have added to the wishlist																					
																									
																									
																									
US_08	TC_002	"
To ensure that user can view the items added to the Wishlist(QUICK VIEW)."	The environment should be ready https://pearlymarket.com/	Navigate to the homepage of the website. https://pearlymarket.com	Test Env: https://pearlymarket.com/	"User should be able to access the homepage  of website
When user hover over Men link , it should be dropdown
Shoes link should be clickable and User should be able to click on it
User should be able to see wishlist Icon when user hover over Adidas Erkek Ayakkabı product 
User should be able to click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
User should be able to click on Wishlist Icon (Heart Sign) on the homepage to see the products user has added to the wishlist
When user click on Quick View button,User should be able to to see the properties of the product user added to Wishlist. Quick View button should be clickable"	PASSED	"User should be able to access the homepage  of website
When user hover over Men link , it should be dropdown
Shoes link should be clickable and User should be able to click on it
User should be able to see wishlist Icon when user hover over Adidas Erkek Ayakkabı product 
User should be able to click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
User should be able to click on Wishlist Icon (Heart Sign) on the homepage to see the products user has added to the wishlist
When user click on Quick View button,User should be able to to see the properties of the product user added to Wishlist. Quick View button should be clickable"																	
				Hover over Men Link																					
				Click on Shose link under Men Link																					
				Hover over Adidas Erkek Ayakkabi product																					
				Hover over Wishlist Icon that appears on Adidas Erkek Ayakkabı product																					
				Click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist																					
				Click on Wishlist Icon (Heart Sign) on the homepage to see the products you have added to the wishlist																					
				Click on Quick View button to see the properties of the product you added to Wishlist																					
																									
																									
US_08	TC_003	"
To ensure that user can add the items on their Wishlist to their cart and purchase. "	The environment should be ready https://pearlymarket.com/	Navigate to the homepage of the website. https://pearlymarket.com	Test Env: https://pearlymarket.com/	"User should be able to access the homepage  of website
When user hover over Men link , it should be dropdown
Shoes link should be clickable and User should be able to click on it
User should be able to see wishlist Icon when user hover over on Adidas Erkek Ayakkabı product 
User should be able to click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
User should be able to click on Wishlist Icon (Heart Sign) on the homepage to see the products user has added to the wishlist
When user click on Add To Cart button ,User should be able to add the product Which is selected to Cart  and Add To Cart button should be clickable and user shoul be able to see the number of how many products they have  added on cart icon
User should be able to click on Cart Icon on homepage to see checkout for payment. Cart Icon should be clickable.
User should be able to click on checkout button to pay for the product and checkout button should be clickable
User should be able to fill in the relevant blanks in BILLING DETAILS
User should be able to click on Pay at the door checkbox if box is not selected.
User should be able to click on place order button and see order details .Place order button should be clickable
"	PASSED	"User should be able to access the homepage  of website
When user hover over Men link , it should be dropdown
Shoes link should be clickable and User should be able to click on it
User should be able to see wishlist Icon when user hover over on Adidas Erkek Ayakkabı product 
User should be able to click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
User should be able to click on Wishlist Icon (Heart Sign) on the homepage to see the products user has added to the wishlist
When user click on Add To Cart button ,User should be able to add the product Which is selected to Cart  and Add To Cart button should be clickable and user shoul be able to see the number of how many products they have  added on cart icon
User should be able to click on Cart Icon on homepage to see checkout for payment. Cart Icon should be clickable.
User should be able to click on checkout button to pay for the product and checkout button should be clickable
User should be able to fill in the relevant blanks in BILLING DETAILS
User should be able to click on Pay at the door checkbox if box is not selected.
User should be able to click on place order button and see order details .Place order button should be clickable
"																	
				Hover over Men Link																					
				Click on Shose link under Men Link																					
				Hover over Adidas Erkek Ayakkabi product																					
				Hover over Wishlist Icon that appears on Adidas Erkek Ayakkabı product																					
				Click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist																					
				Click on Wishlist Icon (Heart Sign) on the homepage to see the products you have added to the wishlist																					
				Click on Add To Cart button to add the product you selected to Cart																					
				"Click on Cart Icon on homepage to see checkout button for payment
"																					
				Click on checkout button to pay for the product	Test Data: Java Faker Class																				
				"Fill in the relevant blanks in BILLING DETAILS such as firstname,lastname,company
name,county/region,address,Postcode/zipcode,Town/city,phone number,email address,additional information"																					
				Click on Pay at the door checkbox if box is not selected																					
				Click on place order button																					

US_08	TC_004	"

User can not see order details after clicking on place order button,
if the user does not fill in the relevant blanks which is marked asterisk sign(*) in BILLING DETAILS"	The environment should be ready https://pearlymarket.com/	Navigate to the homepage of the website. https://pearlymarket.com	Test Env: https://pearlymarket.com/	"User should be able to access the homepage  of website
User should be able to see the homepage
When user hover over Men link , it should be dropdown
Shoes link should be clickable and User should be able to click on it
User should be able to see wishlist Icon when user hover over on Adidas Erkek Ayakkabı product 
User should be able to click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
User should be able to click on Wishlist Icon (Heart Sign) on the homepage to see the products user has added to the wishlist
When user click on Add To Cart button ,User should be able to add the product Which is selected to Cart  and Add To Cart button should be clickable and user shoul be able to see the number of how many products they have  added on cart icon
User should be able to click on Cart Icon on homepage to see checkout for payment. Cart Icon should be clickable.
User should be able to click on checkout button to pay for the product and checkout button should be clickable
User has not filled in adress and phone blanks Which are required field in BILLING DETAILS 
User should be able to click on Pay at the door checkbox if box is not selected.
When user click on place order button and User should not see order details. User should be able to see ""BILLING STREET ADDRESS is a required field"" and ""BILLING PHONE is a required field."" messages on the page


"	PASSED	"User should be able to access the homepage  of website
User should be able to see the homepage
When user hover over Men link , it should be dropdown
Shoes link should be clickable and User should be able to click on it
User should be able to see wishlist Icon when user hover over on Adidas Erkek Ayakkabı product 
User should be able to click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
User should be able to click on Wishlist Icon (Heart Sign) on the homepage to see the products user has added to the wishlist
When user click on Add To Cart button ,User should be able to add the product Which is selected to Cart  and Add To Cart button should be clickable and user shoul be able to see the number of how many products they have  added on cart icon
User should be able to click on Cart Icon on homepage to see checkout for payment. Cart Icon should be clickable.
User should be able to click on checkout button to pay for the product and checkout button should be clickable
User has not filled in adress and phone blanks Which are required field in BILLING DETAILS 
User should be able to click on Pay at the door checkbox if box is not selected.
When user click on place order button and User should not see order details. User should be able to see ""BILLING STREET ADDRESS is a required field"" and ""BILLING PHONE is a required field."" messages on the page


"																	
				Hover over Men Link																					
				Click on Shose link under Men Link																					
				Hover over Adidas Erkek Ayakkabi product																					
				Hover over Wishlist Icon that appears on Adidas Erkek Ayakkabı product																					
				Click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist																					
				Click on Wishlist Icon (Heart Sign) on the homepage to see the product you have added to the wishlist																					
				Click on Add To Cart button to add the product you selected to Cart																					
				"Click on Cart Icon on homepage to see checkout button for payment
"																					
				Click on checkout button to pay for the product	Test Data: Java Faker Class																				
				Do not fill in  phone and adress blanks Which are marked with asteriks sign in BILLING DETAILS																					
				Click on Pay at the door checkbox if box is not selected																					
				"Click on place order button and see ""BILLING STREET ADDRESS is a required field"" and ""BILLING PHONE is a required field.""
messages on the page"	

US_09	TC_01	There should be a valid email address.	The environment should be ready https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	I should be able to register as a vendor	PASSED																		
				Click on Register link																					
				Click on Become a Vendor																					
				Enter the email	Email: guvelg@gmail.com																				
				Verify that “Verification code sent to your email: guvelg@gmail.com.” is visible																					
				Check your e-mail	Email account:http://gmail.com/																				
				Get the verification code from you e-mail																					
				Type verification code																					
				Enter password and confirm password(password should contain uppercase, lowercase, digit and special character)	Password:Gizem*123																				
				Click on Register to complete registration as a vendor																					

US_09	TC_02	There should be a registered email address.	The environment should be ready https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	I should not be able to register as a vendor with a registered email. I should see “This Email already exists. Please login to the site and apply as vendor.”  message appears.	PASSED																		
				Click on Register																					
				Click on Become a Vendor																					
				Enter the registered email	Email: guvelg@gmail.com																				
				Check your e-mail	Email account:http://gmail.com/																				
				Get the verification code from you e-mail																					
				Type verification code																					
				Enter password and confirm password(password should contain uppercase, lowercase, digit and special character)	Password:Gizem*123																				
				Click on Register to complete registration as a vendor																					
				Verify that “This Email already exists. Please login to the site and apply as vendor.”  message appears if user tries to register with a registered email																					

US_010	TC_001	"To ensure that the ""Too Short"" password level 
is visible on the vendor registration page."	The environment should be ready https://pearlymarket.com/	Access the website www.pearlymarket.com.	Test Env: https://pearlymarket.com/	The "Too Short" password level should be visible.																			
				Navigate to the vendor registration page.																					
				"Enter a password in the password field.
   			Check if the "Too Short" password level is visible.																					
																									
US_010	TC_002	" To ensure that the ""Weak"" password level is
 visible on the vendor registration page."	The environment should be ready https://pearlymarket.com/	Access the website www.pearlymarket.com.	Test Env: https://pearlymarket.com/	The "Weak" password level should be visible.																			
				Navigate to the vendor registration page.																					
				Check if the "Weak" password level is visible.																					
														
 US_010	TC_003	"To ensure that the ""Good"" password level is
 visible on the vendor registration page."	The environment should be ready https://pearlymarket.com/	Access the website www.pearlymarket.com.	Test Env: https://pearlymarket.com/	The "Good" password level should be visible.																			
				Navigate to the vendor registration page.																					
				Check if the "Good" password level is visible.																					
																						
 US_010	TC_004	"To ensure that the ""Strong"" password level is
 visible on the vendor registration page."	The environment should be ready https://pearlymarket.com/	Access the website www.pearlymarket.com.	Test Env: https://pearlymarket.com/	The "Strong" password level should be visible.																			
				Navigate to the vendor registration page.																					
				Check if the "Strong" password level is visible.																																																																					
																										
US_11	TC_01	There should be a valid email address which is registered as vendor.	The environment should be ready  https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	I should be able to sign in as a vendor	PASSED																		
				Click on Sign In link																					
				Enter username	Email: gizem_1206@hotmail.com																				
				Enter password	Password:Gizem*123																				
				Click on Sign In button																					
				Assert that you signed in																					

US_11	TC_02	There should be a valid email address which is registered as vendor.	The environment should be ready https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	I should be able to sign in as a vendor and see dashboard options.	PASSED																		
				Click on Sign In link																					
				Enter username	Email: gizem_1206@hotmail.com																				
				Enter password	Password:Gizem*123																				
				Click on Sign In button																					
				Assert that you signed in																					
				Click on the Sign Out icon to see "My Account"																					
				Assert that "My Account" is visible																					
				Assert that Store manager, orders, downloads, addresses , account details, wishlist, Support tickets, followings ve log out are visible in Dashboard.																					

US_11	TC_03	There should be a valid email address which is registered as vendor and a wrong password.	The environment should be ready  https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	I should NOT be able to sign in as a vendor with incorrect password.	PASSED																		
				Click on Sign In link																					
				Enter username	Email: gizem_1206@hotmail.com																				
				Enter incorrect password	Password:Gizem*12																				
				Click on Sign In button																					
				Assert that you are not able to sign in																					

US_12	TC_001	" 
 ensure that Vendor  can add their billing address successfully with all the 
required information"	The environment should be ready https://pearlymarket.com/	"Log in to www.pearlymarket.com as a vendor.
Go to ""My Account"" section.
Navigate to ""Addresses"" and select ""Billing Address"".
Enter valid data for First Name, Last Name, Country/Region, Street Address, Town/City, State, ZIP Code, and Phone Number.
Verify that the registered email address is automatically filled.
Click on the ""Save Address"" button.
Verify that the button clickable."	"https://pearlymarket.com/
Vendor name : Arthur
Vendor account:Arthurklasse01234@outlook.com
Vendor password: Testng2023

"	The billing address should be saved successfully, and the entered details should be associated with the vendor's account.	passed																		
																									
US_13	TC_01	There should be a valid shipping address.	The environment should be ready https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	I should be able to successfully add shipping address.	-																		
				Click on Login																					
				Enter credentials (username and password) and login to site	Username: enes1 Password:9=.RbP7.?)64Hx.a																				
				Click on log out to go to accounts page																					
				Go to addresses																					
				Go to Shipping addresses 																					
				Click on add under shiping addresses																					
				Fill in the fields (First name, Last name, Country/Region, Street address, Town / City, State, ZIP Code)																					
				Press save address																					
				The shipping address should be saved after pressing save address																					

US_13	TC_02	There should be a different shipping address.	The environment should be ready https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	I should be able to successfully add shipping address.	-																		
				Click on Register																					
				Enter credentials (username and password) and login to site	Username: enes1 Password:9=.RbP7.?)64Hx.a																				
				Click on log out to go to accounts page																					
				Go to addresses																					
				Go to Shipping addresses 																					
				Click on add under shiping addresses																					
				Fill in the fields (First name, Last name, Country/Region, Street address, Town / City, State, ZIP Code)																					
				Press save address																					
				The shipping address should be saved after pressing save address																					

US_014	TC_001	"To ensure that the options to add different 
types of products are available for vendors."	"The environment should be ready 
https://pearlymarket.com/"	Navigate to the website registration page. https://pearlymarket.com	Test Env: https://pearlymarket.com/	The options to add different types of products (Simple, Variable, Grouped, External - Affiliate) should be visible.																			
				Navigate to "My Account" and select "Store Manager."																					
				Click on "Product" from the menu options.																					
				Click on "Add New" to create a new product.																					
				"Verify that the following options are available:
"																					
				--Simple Product																					
				--Variable Product																					
				--Grouped Product																					
				--External - Affiliate Product																					

US_014	TC_002	"To ensure that vendors can add a product
 photo while creating a new product."	"The environment should be ready 
https://pearlymarket.com/"	Navigate to the website registration page. https://pearlymarket.com	Test Env: https://pearlymarket.com/	The product photo should be successfully uploaded.																			
				Navigate to "My Account" and select "Store Manager."																					
				Click on "Product" from the menu options.																					
				Click on "Add New" to create a new product.																					
				Upload a product photo in the designated field.																					

US_014	TC_003	"To ensure that vendors can write 
the product title, short description 
and description while 
creating a new product."	"The environment should be ready 
https://pearlymarket.com/"	Navigate to the website registration page. https://pearlymarket.com	Test Env: https://pearlymarket.com/	The product title, short description, and description should be successfully entered.																			
				Navigate to "My Account" and select "Store Manager."																					
				Click on "Product" from the menu options.																					
				Click on "Add New" to create a new product.																					
				"Enter the product title, short description, and description
 in the respective fields."																					

US_014	TC_004	"To ensure that vendors can 
select categories and add 
new categories while
 creating a new product."	"The environment should be ready
 https://pearlymarket.com/"	Navigate to the website registration page. https://pearlymarket.com	Test Env: https://pearlymarket.com/	The categories should be selectable, and vendors should be able to add new categories if required.																			
				Navigate to "My Account" and select "Store Manager."																					
				Click on "Product" from the menu options.																					
				Click on "Add New" to create a new product.																					
				Verify that the categories are selectable.																					
				 Select an appropriate category.																					
				"
Verify that there is an option to add new categories."																					
				Add a new category if needed.																					

US_014	TC_005	"To ensure that vendors can select 
product brands and
 add new product brands
 while creating a new product."	"To ensure that vendors can select
 product brands and 
add new product brands while
 creating a new product."	Navigate to the website registration page. https://pearlymarket.com	Test Env: https://pearlymarket.com/	The product brands should be selectable																			
				Navigate to "My Account" and select "Store Manager."																					
				Click on "Product" from the menu options.																					
				Click on "Add New" to create a new product.																					
				Verify that the product brands are selectable.																					
				Select a suitable product brand.																					
				Verify that there is an option to add new product brands																					
				Add a new product brand if required.																					

US_15	TC_001	"Confirm that vendors can see the required menus (Inventory, Shipping, Attributes, Linked, Seo, and Advanced)
 in the product management section."	The environment should be ready https://pearlymarket.com/	"1-Log in to www.pearlymarket.com as Vendor #2.
2-Go to ""My Account"" section
3-Navigate to ""Store Manager"" and select ""Product"".
4-Verify that the following menus are visible: Inventory, Shipping, Attributes, Linked, Seo, Advanced."	"https://pearlymarket.com/
vendor account  gmail: mfaslnn@gmail.com
vendor account password: Testngqa2023."	The Inventory, Shipping, Attributes, Linked, Seo, and Advanced menus should be visible on the "Add New Product" page, indicating that the user can perform relevant processes.	PASSED																		
																																
US_15	TC_002	"Confirm  that vendors can perform inventory processes, such as managing stock, setting stock status, 
and enabling the option to sell individually."	The environment should be ready https://pearlymarket.com/	"1-Log in to www.pearlymarket.com as Vendor #2.
2-Go to ""My Account"" section.
3-Navigate to ""Store Manager"" and select ""Product"".
4-Click on the ""Add New Product"" option.
5-Fill in the required details for the new product, including SKU, Manage Stock, Stock status, and Sold Individually.
6-Save the product."	"https://pearlymarket.com/
vendor account  gmail: mfaslnn@gmail.com
vendor account password: Testngqa2023."	"The product should be saved successfully, and the inventory processes 
(SKU, Manage Stock, Stock status, Sold Individually) 
should be applied as per the entered details."	PASSED																		
																									
US_15	TC_003	"Confirm  that vendors can perform shipping processes, such as setting weight, dimensions, 
shipping class, and processing time."	The environment should be ready https://pearlymarket.com/	"1-Log in to www.pearlymarket.com as Vendor #2.
2-Go to ""My Account"" section.
3-Navigate to ""Store Manager"" and select ""Product"".
4-Click on the ""Add New Product"" option.
5-Fill in the required details for the new product, including Weight, Dimensions, Shipping class, and Processing Time.
6-Save the product.
"	"https://pearlymarket.com/
vendor account  gmail: mfaslnn@gmail.com
vendor account password: Testngqa2023."	"The product should be saved successfully, and the shipping processes 
(Weight, Dimensions, Shipping class, Processing Time) 
should be applied as per the entered details."	PASSED																		
																											
US_15	TC_004	Confirm  that vendors can perform attributes processes, such as selecting colors and sizes for their products.	The environment should be ready https://pearlymarket.com/	"1-Log in to www.pearlymarket.com as Vendor #2.
2-Go to ""My Account"" section.
3-Navigate to ""Store Manager"" and select ""Product"".
4-Click on the ""Add New Product"" option.
5-Fill in the required details for the new product, including Attributes (e.g., Color, Size).
6-Save the product."	"https://pearlymarket.com/
vendor account  gmail: mfaslnn@gmail.com
vendor account password: Testngqa2023."	"The product should be saved successfully, and the attribute processes (e.g., Color, Size) 
should be applied as per the entered details."	PASSED																		
																									
US_16	TC_01	Simple Product should be default and Virtual and Downloadable should be selectable.	The prod environment: https://pearlymarket.com// Vendor should have been logged in.	1_Go to https://pearlymarket.com/	Prod environmet: https://pearlymarket.com//	As vendor, I should be able to see simple product as default and Virtual and Downloadable options are available when adding my product.	PASSED																		
				2_Click on "My Account", "Store Manager" buttons.	Email:tsgmail.com																				
				3_Hover over "Products" and click on "Add New" button	Password: TS																				
				4_Assert that "Simple Product" is selected as default in products dropdown.																					
				5_Assert that Virtual and Downloadable checkbox buttons are displayed and clickable.																					

US_16	TC_02	"User should be able to write Price, Sale Price and Product Title and select categories.
User should be able to see that the new product has been added in the Product section."	The prod environment: https://pearlymarket.com// Vendor should have been logged in.	1_Go to https://pearlymarket.com/	Prod environmet: https://pearlymarket.com//	As vendor, I should be able to set product title, price, sale price and category when adding my product. Then I should be able to see the newly added product in the products list.	PASSED																		
				2_Click on "My Account", "Store Manager" buttons.	Email:tsgmail.com																				
				3_Hover over "Products" and click on "Add New" button	Password: TS																				
				4_Fill product title, price and sale price inputs.	Product: carpet. Price: 100, Sale Price: 80																				
				5_Select the given categories	Product Categories: Home&Garden, Home, HomeLife																				
				6_Upload "Featured img" and "Gallery Images"	Files on Desktop: flower.jpeg, flower.jpeg																				
				7_Click on "Submit" button and assert that "Product Succesfully Published" message																					
				8_Click on "Products"																					
				9_Assert that newly added product is displayed																					

US_17	TC_001	User should be able to shop as a Vendor 	The environment should be ready  https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/		      PASSED																		
				Click on Register link																					
				Click on Become a Vendor		User should be able to sign in as a vendor																			
				Enter the email	Email: pearly_market@outlook.com																				
				Verify that “Verification code sent to your email:a.alpha70051503@gmail.com.” is visible																					
				Check your e-mail	Email account:http://outlook.com/																				
				Get the verification code from your e-mail																					
				Type verification code																					
				Enter password 	Password: pm_project_pm																				
				Click on Register to complete registration as a vendor																					

US-17	TC_002	Users should be able to select Product / Products, 	The environment should be ready  https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/		PASSED																		
				User verifies "Pearly Market" title is displayed																					
				User clicks on "Sign In" button																					
				User fills registered  "Username or email address”	Email: a.alpha70051503@gmail.com																				
				User fills “Password”	Password: AlphaTesters2023																				
				Click on "SIGN IN" button																					
				Verify that user has successfully logged in to his account																					
				Search bar should be displayed and enable																					
				User clicks on search bar																					
				User search for "Sport Women’s Wear"																					
				User clicks on the searched element																					
				Verify "Sport Women’s Wear" title is displayed																					
				Verify "ADD TO CART" button is displayed and clickable																					
				User clicks on "ADD TO CART" button																					
				User clicks on the "Cart" notification option																					
				Verify that the "SHOPPING CART" title is displayed																					
				User clicks on "CHECKOUT" button																					
				Verify the "YOUR ORDER" title																					

US_17	TC_003	User can fill their “BILLING DETAILS” successfully	The environment should be ready  https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/																				
				User clicks on the "Cart" notification option																					
				User clicks on "CHECKOUT" button																					
				User fills “BILLING DETAILS” details		"Billing details" should be completed	PASSED																		
				Enter your First and Last name																					
				Select a Company name																					
				Enter your Street address																					
				Enter your Home number  and Town/City																					
				Enter your Zip code																					
				Enter your Phone number																					
																									
US_17	TC_004	User should be able to complete shopping	The environment should be ready  https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/		       PASSED																		
				User clicks on the "Cart" notification option																					
				User clicks on "CHECKOUT" button																					
				Assert  that"Total" is displayed																					
				User should be able to select the "Wire transfer/EFT" and “ Pay at the door” options																					
				Click on “PLACE ORDER” button																					
																														
US18	TC01	Verify that the user can create a coupon with a percentage discount.	The environment should be ready https://pearlymarket.com	1. Login to the application as a vendor.	Prod environmet: https://pearlymarket.com	The coupon should be created with the specified details. The generated coupon should be visible in the vendor's coupon list.	PASS																		
				2. Navigate to "My Account" > "Coupons" > "Add New".																					
				3. Enter a unique code for the coupon.																					
				4. Add a description for the coupon.																					
				5. Select "Percentage discount" as the discount type.																					
				6. Enter the percentage discount amount.																					
				7. Set an expiration date for the coupon.																					
				8. Select the "Allow free shipping" option.																					
				9. Select the "Show on store" option.																					
				10. Click the "Save" button.																					
	
US18  TC02	Verify that the user can create a coupon with a fixed product discount.	The environment should be ready https://pearlymarket.com	1. Login to the application as a vendor.	Prod environmet: https://pearlymarket.com	The coupon should be created with the specified details. The generated coupon should be visible in the vendor's coupon list.	PASS																		
				2. Navigate to "My Account" > "Coupons" > "Add New".																					
				3. Enter a unique code for the coupon.																					
				4. Add a description for the coupon.																					
				5. Select "Fixed product discount" as the discount type.																					
				6. Enter the fixed discount amount.																					
				7. Set an expiration date for the coupon.																					
				8. Select the "Allow free shipping" option.																					
				9. Select the "Show on store" option.																					
				10. Click the "Save" button.																					

US18	TC03	Verify that the coupon amount field is properly validated.	The environment should be ready https://pearlymarket.com	1. Login to the application as a vendor.	Prod environmet: https://pearlymarket.com	The system should display an error message indicating that the coupon amount is invalid and prevent the coupon from being created.	FAIL																		
				2. Navigate to "My Account" > "Coupons" > "Add New".																					
				3. Enter a unique code for the coupon.																					
				4. Add a description for the coupon.																					
				5. Select "Percentage discount" as the discount type.																					
				6. Enter an invalid coupon amount (e.g., a negative value or non-numeric characters).																					
				7. Set an expiration date for the coupon.																					
				8. Select the "Allow free shipping" option.																					
				9. Select the "Show on store" option.																					
				10. Click the "Save" button.																					
     
 US18	TC04	Verify that the expiration date field is properly validated.	The environment should be ready https://pearlymarket.com	1. Login to the application as a vendor.	Prod environmet: https://pearlymarket.com	The system should display an error message indicating that the coupon expirration date is invalid and prevent the coupon from being created.	FAIL																		
				2. Navigate to "My Account" > "Coupons" > "Add New".																					
				3. Enter a unique code for the coupon.																					
				4. Add a description for the coupon.																					
				5. Select "Percentage discount" as the discount type.																					
				6. Enter a valid coupon amount.																					
				7. Enter an invalid expiration date (e.g., a past date).																					
				8. Select the "Allow free shipping" option.																					
				9. Select the "Show on store" option.																					
				10. Click the "Save" button.																					

US_019	TC_001	To verify that the user can shop as a customer with the created coupon on the site	The environment should be ready https://pearlymarket.com/	Access the website www.pearlymarket.com.	Test Env: https://pearlymarket.com/	The user should be able to shop as a customer with the created coupon.																			
				Login as a customer.		The applied coupon should result in a discounted price for the products in the order.																			
				"
         Browse and search for desired products."		The payment process should be completed successfully.																			
				Add the desired products to the cart.		The order should be placed successfully with the applied coupon and the correct discounted price.																			
				Apply the created coupon during the checkout process.																					
				Verify that the coupon is successfully applied and the discounted price is reflected in the order total.																					
				Proceed with the payment process.																					
				Verify that the payment is processed successfully.																					
				Complete the purchase and place the order.																					
				Verify that the order is placed successfully with the applied coupon and the correct discounted price.																					

US_019	TC_002	To verify that an invalid coupon code is not applied during the checkout process.	The environment should be ready https://pearlymarket.com/	Access the website www.pearlymarket.com.	Test Env: https://pearlymarket.com/	An invalid coupon code should not be applied during the checkout process.																			
				Login as a customer.		The payment process should be completed successfully.																	
         Browse and search for desired products.
  	     The order should be placed successfully without the invalid coupon being applied.																			
				Add the desired products to the cart.																					
				Enter an invalid coupon code during the checkout process.																					
				Verify that the invalid coupon code is not applied.																					
				Proceed with the payment process.																					
				Verify that the payment is processed successfully.																					
				Complete the purchase and place the order.																					
				Verify that the order is placed successfully without the invalid coupon being applied.																					
	
US_20	"TC_01"	User should be able to shop as a Vendor with the created Coupon	The environment should be ready https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	User can be able to enter "Pearly Market" home page	User can be able to enter "Pearly Market" home page																		
				User verifies "Pearly Market" title is displayed		"Pearly Market" titile should be displayed																			
				User clicks on "Sign In" button		"Sign In" button should be clickable 																			
				User fill the "Username or email address", "Password" and clicks on "SIGN IN" button		User should be abel to fill all the required details for sign in to his account																			
				Verify that user has succesfully loged in to his account		User should be able to log in to his account																			
				Search bar should be displayed and enable 		Search bar should be displayed																			
				User clicks on srearch bar 		User shoule be able to click on the search bar																			
				User srearch for "Gray Leather Shoes"		User should be able to search "Gray Leather Shoes"																			
				User clicks on the searched element 		Searched element should be clickable																			
				Verify "Gray Leather Shoes" title is displayed		The "Gray Leather Shoes" should be displayed																			
				Verify "ADD TO CART" button is displayed and clickable		"ADD TO CART" button should be displayed																			
				User clicks on "ADD TO CART" button		User should able to click on "ADD TO CART" button																			
				User clicks on the "Cart" notification option 		"Cart" notification option should be displayed and it is clickable																			
				Verify that the "SHOPPING CART" title is displayed		User should be able to see the "SHOPPING CART"																			
				User clicks on "CHECKOUT" button		"PROCEED TO CHECKOUT" button should be clickable																			
				Verify the "YOUR ORDER" title		"YOUR ORDER" title should be displayed																			
				User fills the "BILLING DETAILS"		"BILLING DETAILS" should be displayed																			
				Verify "Total" is displayed		The total amount should be displayed																			
				User should be able to select the "Wire transfer/EFT" option		User should be able to selecet the payment method																			
				By clicking on Place Order, the user should be able to see that the shopping has been completed		By clicking the order should be completed	By clicking the order should be completed																		

US_20	TC_02	User should be able to shop as a Vendor with the created Coupon	The environment should be ready https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	User can be able to enter "Pearly Market" home page																			
				User verifies "Pearly Market" title is displayed		"Pearly Market" titile should be displayed																			
				User clicks on "Sign In" button		"Sign In" button should be clickable																			
				User fills the "Username or email address", "Password" and clicks on "SIGN IN" button		User should be able to fill the all the required details and "SIGN IN" button should be clickable																			
				Verify user has loged in to his account		User should be loged in to his account																			
				User clicks on "My Account" option		"My Account" option should be clickable																			
				Verify "My Account" title is displayed		"Hello (not ? Log out)" should be displayed																			
				User clicks on "ORDERS" option		"ORDERS" option should be clickable																			
				"Orders" text should be displayed		"Orders" should be dispayed after clicking on "ORDERS" option																			
				User clicks on "VIEW" button		"VIEW" button should be clickable 																			
				User should be able to see "ORDER DETAILS" text		"ORDER DETAILS" text should be dispayed																			

US_20	TC_03	User should be able to shop as a Vendor with the created Coupon	The environment should be ready https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	User can be able to enter "Pearly Market" home page	User can be able to enter "Pearly Market" home page																		
				User verifies "Pearly Market" title is displayed		"Pearly Market" titile should be displayed																			
				User clicks on "Sign In" button		"Sign In" button should be clickable																			
				User fills the "Username or email address", "Password" and clicks on "SIGN IN" button		User should be able to fill the all the required details and "SIGN IN" button should be clickable																			
				Verify user has loged in to his account		User should be loged in to his account																			
				User clicks on "My Account" option		"My Account" option should be clickable																			
				Verify " My Account" is displayed		"My Account" should be displayed																			
				User clicks on "Store Manager" option		"Store Manager" button should be clickable																			
				Verify "Store Manager" is displayed		"Store Manager" should be displayed																			
				User clicks on " Coupons" button and after clicks on "Add New"		User should be click on "Coupon" and "Create new" buttons																			
				User should be able to fill all the details of the new coupon to create a new coupon		All the details should be filled																			
				User clicks on "SUBMIT" button		"SUBMIT" button should be clickable																			

US_20	TC_04	User should be able to shop as a Vendor with the created Coupon	The environment should be ready https://pearlymarket.com/	Go to website https://pearlymarket.com/	Test Env: https://pearlymarket.com/	User can be able to enter "Pearly Market" home page	"Pearly Market" titile should be displayed																		
				User verifies "Pearly Market" title is displayed		"Pearly Market" titile should be displayed																			
				User clicks on "Sign In" button		"Sign In" button should be clickable																			
				User fills the "Username or email address", "Password" and clicks on "SIGN IN" button		User should be able to fill the all the required details and "SIGN IN" button should be clickable																			
				Verify user has loged in to his account		User should be loged in to his account																			
				User clicks on srearch bar 		User shoule be able to click on the search bar																			
				User srearch for "Mouse"		User should be able to search "Mouse"																			
				User clicks on the searched element 		Searched element should be clickable																			
				User clicks on the first searched mouse																					
				Verify "mouse" title is displayed		"mouse" title should be dispayed																			
				User clicks on  "ADD TO CART" button 		"ADD TO CART" button should be clickable																			
				User clicks on the "Cart" notification option 		"Cart" notification option should be clickable																			
				Verify that the "SHOPPING CART" title is displayed		"SHOPPING CART" title should be displayed																			
				User clicks on "PROCEED TO CHECKOUT" button		"PROCEED TO CHECKOUT" button should be clickable																			
				Verify the "Have a coupon? ENTER YOUR CODE" option		"Have a coupon?" option should be is dispayed																			
				User clicks on "ENTER YOUR CODE" option		 "ENTER YOUR CODE" option should be dispayed and it is clickabel																			
				User clicks on "coupon code" box and types the coupon		User shoud be able to fill the coupon code in the box																			
				User clicks "APPLY COUPON" button		"APPLY COUPON" button should be clickable																			
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
																									
