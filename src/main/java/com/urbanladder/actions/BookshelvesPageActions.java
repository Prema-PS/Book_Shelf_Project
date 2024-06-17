package com.urbanladder.actions;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.urbanladder.locators.BookshelvesPageLocators;
import com.urbanladder.utils.BaseClass;

public class BookshelvesPageActions {
	

	Actions handler = BaseClass.getHandler();
	BookshelvesPageLocators bookshelvespagelocator_Obj = null;

	//Constructor
	public BookshelvesPageActions() {
		this.bookshelvespagelocator_Obj = new BookshelvesPageLocators();
		PageFactory.initElements(BaseClass.getDriver(),bookshelvespagelocator_Obj);
	
	}
	
	//Check for BookShelves Page
	public boolean checkBookShelfUrl() {

		return BaseClass.getWait(10).until(ExpectedConditions.urlContains("bookshelf"));

	}
	
	//Check for Popup 
	public boolean checkPopupBanner(){
		return bookshelvespagelocator_Obj.Popup.isDisplayed();
	}
	
	//Close Popup
	public void closePopup() {
		bookshelvespagelocator_Obj.closePopup.click();
		BaseClass.highlightElement(bookshelvespagelocator_Obj.closePopup);
		
	}
	
	//Checks for Prize 
	public boolean CheckPrizeFilter() {
		return bookshelvespagelocator_Obj.price_Filter.isDisplayed();
	}
	
	//MouseHover to Prize Filter 
	public void MovetoPrizeFilter() {
		BaseClass.getWait(20).until(ExpectedConditions.visibilityOf(bookshelvespagelocator_Obj.price_Filter));
		handler.moveToElement(bookshelvespagelocator_Obj.price_Filter).build().perform();

	}

	//Check for Right Dragger 
	public boolean CheckRightDragger() {
		return bookshelvespagelocator_Obj.Right_Dragger.isDisplayed();
	}
	
	//Drag And Set the Price to 15000
	public void DragAndSet() {
		handler.dragAndDropBy(bookshelvespagelocator_Obj.Right_Dragger, -280, 0).build().perform();

	}
	
	//Select storage type as open
	public void selectStorageOpen() {

		BaseClass.sleep(2000);
		bookshelvespagelocator_Obj.storage_Type.click();

		bookshelvespagelocator_Obj.open_Type.click();
		
	}

	//Check for Out Of Stock 
	public boolean CheckOutOfStock() {
		return bookshelvespagelocator_Obj.outOfStock_CheckBox.isDisplayed();
	}
	
	//Click Out Of Stock 
	public void ExcludeOutOfStock() {
		
		BaseClass.getWait(10).until(ExpectedConditions.elementToBeClickable(bookshelvespagelocator_Obj.outOfStock_CheckBox));
		
		bookshelvespagelocator_Obj.outOfStock_CheckBox.click();

	}
	
	//Check For SortBy DropDown
	public boolean CheckDropDown() {
		return bookshelvespagelocator_Obj.SortBy_DropDown.isDisplayed();
	}
	
	//House Hover to DropDown
	public void MovetoDropDown() {
		handler.moveToElement(bookshelvespagelocator_Obj.SortBy_DropDown).build().perform();;
	}
	
	//Check For High To Low Option
	public boolean CheckHightoLow() {
		return bookshelvespagelocator_Obj.HighToLow_Option.isDisplayed();
	}
	
	//Click on  High To Low Option
	public void ClickHighToLow() {
		bookshelvespagelocator_Obj.HighToLow_Option.click();
		BaseClass.highlightElement(bookshelvespagelocator_Obj.HighToLow_Option);
	}


	//Check and return the Results Displayed
	public List<WebElement> ProductName() {

		if(!(bookshelvespagelocator_Obj.HighToLow_Option.isSelected())) {
			BaseClass.sleep(3000);			
		}
		
		try{
			return bookshelvespagelocator_Obj.ProductName;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}
	
	public List<WebElement> PublishedBy() {
		try{
			return bookshelvespagelocator_Obj.PublishedBy;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}
	
	public List<WebElement> DiscountPrice() {
		try{
			return bookshelvespagelocator_Obj.DiscountPrice;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}
	
	public List<WebElement> OriginalPrice() {
		try{
			return bookshelvespagelocator_Obj.OriginalPrice;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}
	
	public List<WebElement> EMI() {
		try{
			return bookshelvespagelocator_Obj.EMiFrom;
		}catch(Exception e) {
			System.out.println("No Results Found to Display");
			return null;
		}
	}



}






