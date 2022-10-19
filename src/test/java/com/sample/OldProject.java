package com.sample;

import org.openqa.selenium.WebElement;

public class OldProject extends BassClass {
	
	public void project() throws InterruptedException {
		
		//browser launch
		browserLaunch("chrome");
		//launch url
		launchUrl("https://adactinhotelapp.com/");
		//username
		WebElement user = locators("name","username");
		typeText(user,"josmisro789@gmail.com");
		//password
		WebElement pass = locators("id","password");
		typeText(pass,"1234567890");
		//login
		WebElement login = locators("id","login");
		btnClick(login);
		//location
		WebElement location = locators("id","location");
		byValue(location,"london");
		//hotels
		WebElement hotel = locators("id","hotels");
		byIndex(hotel,3);
		//Select room type
		WebElement roomtype = locators("id","room_type");
		byText(roomtype,"Double");
		//Select no of rooms
		WebElement noofrooms = locators("id","room_nos");
		byIndex(noofrooms,2);
		//Checkin date
		WebElement checkin = locators("id","datepick_in");
		clear(checkin);
		typeText(checkin,"10/09/2022");
		//Checkout date
		WebElement checkout = locators("id","datepick_out");
		clear(checkout);
		typeText(checkout,"13/09/2022");
		//Adults
		WebElement adults = locators("id","adult_room");
		byIndex(adults,3);
		//children
		WebElement children = locators("id","child_room");
		byText(children,"3 - Three");
		//Search
		WebElement search = locators("id","submit");
		btnClick(search);
		//RadioButton
		WebElement button = locators("id","radiobutton_0");
		btnClick(button);
		//Continue
		WebElement Continue = locators("xpath","//input[@id='continue']");
		btnClick(Continue);
		Thread.sleep(3000);
		//First Name
		WebElement firstname = locators("id","first_name");
		typeText(firstname,"Joseph");
		//Last Name
		WebElement lastname = locators("id","last_name");
		typeText(lastname,"Misrobin");
		//Address
		WebElement address = locators("id","address");
		typeText(address,"Adambakkam,chennai");
		//Card No
		WebElement cardno = locators("id","cc_num");
		typeText(cardno,"2345 6789 9870 3452");
		//Card Type
		WebElement cardtype = locators("id","cc_type");
		byValue(cardtype,"MAST");
		//Expiry date
		WebElement month = locators("id","cc_exp_month");
		byIndex(month,8);
		WebElement year = locators("id","cc_exp_year");
		byValue(year,"2022");
		//CCV no
		WebElement ccv = locators("id","cc_ccv");
		typeText(ccv,"123");
		//Booked
		WebElement book = locators("id","book_now");
		btnClick(book);
		
		
		
		
		
		
		
	}


	}


