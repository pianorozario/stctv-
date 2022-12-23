package stc.tv.valuelabs.stepdefinition;


import io.cucumber.java.en.Given;
import stc.tv.valuelabs.basepackage.Browserlaunch;
import stc.tv.valuelabs.objectpackage.Bahrain_packages_amount;
import stc.tv.valuelabs.objectpackage.Choose_country;
import stc.tv.valuelabs.objectpackage.KSA_package_amount;
import stc.tv.valuelabs.objectpackage.Kuwait_package_amount;
import stc.tv.valuelabs.objectpackage.Language_selection;

public class Scenario_Steps extends Browserlaunch {
	
	@Given("^User can able to launch the stctv link in browser$")
	public void User_can_able_to_launch_the_stctv_link_in_browser() throws InterruptedException {
		Browserlaunch launch = new Browserlaunch();
		launch.initiate();
		
	}
	
	@Given("^Click English text button to change language$")
	public void Click_English_text_button_to_change_language() throws InterruptedException {
		Language_selection Eng = new Language_selection();
		Eng.selectlanguage();
		
	}
	
	
	@Given("^Click country selection button to change countries$")
	public void Click_country_selection_button_to_change_countries() throws InterruptedException {
		Choose_country Country = new Choose_country();
		Country.countrylist();
		
	}
	
	@Given("^user can able to choose country bahrain and validate its packages and price$")
	public void user_can_able_to_choose_country_bahrain_and_validate_its_packages_and_price() throws InterruptedException {
		Bahrain_packages_amount bh = new Bahrain_packages_amount();
		bh.bahrain_basicvalidation();
	}
	
	@Given("^user can able to choose country kuwait and validate its packages and price$")
	public void user_can_able_to_choose_country_kuwait_and_validate_its_packages_and_price() throws InterruptedException {
		Kuwait_package_amount kw = new Kuwait_package_amount();
		kw.kuwait_basicvalidation();
	}
	
	@Given("^user can able to choose country KSA and validate its packages and price$")
	public void user_can_able_to_choose_country_KSA_and_validate_its_packages_and_price() throws InterruptedException {
		KSA_package_amount sa = new KSA_package_amount();
		sa.KSA_basicvalidation();
	}
	
}
