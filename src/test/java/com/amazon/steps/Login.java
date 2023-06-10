package com.amazon.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class Login {

    private WebDriver driver;


    @Given("^When I enter the url on the browser$")
    public void when_I_enter_the_url_on_the_browser()  {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/");




    }

    @When("^I click on arrow button$")
    public void i_click_on_arrow_button()  {

    }

    @Then("^I should be on amazon homepage with sign in button at the top right corner$")
    public void i_should_be_on_amazon_homepage_with_sign_in_button_at_the_top_right_corner()  {

    }

    @Given("^When I hover sign in on the menu bar$")
    public void when_I_hover_sign_in_on_the_menu_bar()  {

    }

    @When("^I click on the Sign in button$")
    public void i_click_on_the_Sign_in_button() {

    }

    @Then("^I should be able to see the page asking for email and password$")
    public void i_should_be_able_to_see_the_page_asking_for_email_and_password() {

    }

    @Given("^When I am on the login page$")
    public void when_I_am_on_the_login_page()  {

    }

    @When("^I enter the email and password$")
    public void i_enter_the_email_and_password()  {

    }

    @Then("^I should see the loggin page with user name on top right corner of the page$")
    public void i_should_see_the_loggin_page_with_user_name_on_top_right_corner_of_the_page()  {

    }

}
