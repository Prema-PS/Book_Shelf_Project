package com.urbanladder.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.urbanladder.locators.HeaderLocators;
import com.urbanladder.utils.BaseClass;

public class HeaderActions {
	

	Actions handler = BaseClass.getHandler() ;
	HeaderLocators headerLocators_Obj= null;
	//Constructor   
	public HeaderActions() {

		this.headerLocators_Obj = new HeaderLocators();
		PageFactory.initElements(BaseClass.getDriver(),headerLocators_Obj);
	}

	//1)Checks for Search Input 
	public boolean CheckBookShelf(){
		return headerLocators_Obj.living_Label.isDisplayed();
	}
	
	//2)Search for "BookShelves"
	public void SearchBookShelf() {

		headerLocators_Obj.living_Label.click();
		headerLocators_Obj.bookShelf_menu.click();
		
	}

	//3)Check for Living Label 
	public boolean CheckLivngLabel() {
		return headerLocators_Obj.living_Label.isDisplayed();
	}
	
	//Mouse Hover to living
	public void MoveToLivngLabel(){
		handler.scrollToElement(headerLocators_Obj.giftCardS_Link).build().perform();
		BaseClass.sleep(2000);
		handler.moveToElement(headerLocators_Obj.living_Label).build().perform();
		BaseClass.sleep(2000);
	}

	//4)Check for Chair and SubMenu
	public boolean CheckChairMenu() {
		return headerLocators_Obj.Chair_Menu.isDisplayed(); 
	}
	
	//Find SubMenus of Chair
	public List<WebElement> ChairList(){

		return headerLocators_Obj.Chair_SubMenu;

	}

	//5)Check for LvingStorage and SubMenu
	public boolean CheckLivngStorageMenu() {
		return headerLocators_Obj.LivingStorage_Menu.isDisplayed(); 
	}
	
	//Find SubMenus of Living
	public List<WebElement> LivingStorageList(){

		return headerLocators_Obj.LivingStorage_SubMenu;

	}

	//6)Checks for GiftCards Label
	public boolean CheckGiftCards() {
		return headerLocators_Obj.giftCardS_Link.isDisplayed();
	} 
	
	//Click on Gift Cards 
	public void ClickGiftCards() {

		BaseClass.highlightElement(headerLocators_Obj.giftCardS_Link);
		headerLocators_Obj.giftCardS_Link.click();
	}

}
