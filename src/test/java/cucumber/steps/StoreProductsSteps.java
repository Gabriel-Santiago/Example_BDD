package cucumber.steps;

import com.livecodebdd.controller.ProductController;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.util.AssertionErrors.*;


@CucumberContextConfiguration
public class StoreProductsSteps {

    ProductController products  = new ProductController();

    @Given("I have more than {int} products in my store")
    public void iHaveMoreThanProductsInMyStore(int productNumber) {
        assertTrue("I have more than {int} products in my store",
                products.getAllProducts().size()>productNumber);
    }

    @And("One of these products is a CellPhone")
    public void oneOfTheseProductsIsACellPhone() {
        assertTrue("One of these products is a CellPhone",
                products.getAllProducts().contains("CellPhone"));
    }

    @Then("All product should be returned successfully")
    public void allProductShouldBeReturnedSuccessfully() {
        // Arrange
        List<String> productToBeVerified = new ArrayList<>();
        productToBeVerified.add("Mouse");
        productToBeVerified.add("Keyboard");
        productToBeVerified.add("Pen");
        productToBeVerified.add("Screen");
        productToBeVerified.add("Notebook");
        productToBeVerified.add("CellPhone");

        // Act
        //products;

        // Assert
        assertTrue("All product should be returned successfully",
                products.getAllProducts().
                        containsAll(productToBeVerified));
    }

    @Given("The store already has registered products")
    public void theStoreAlreadyHasRegisteredProducts() {
        products = new ProductController();
        products.addRegisteredProduct("Smartphone");
        products.addRegisteredProduct("Headset");
    }

    @And("The store has fewer than {int} products")
    public void theStoreHasFewerThanProducts(int arg0) {
        assertTrue("The store has fewer than {int} products",
                products.getProductCount()<arg0);
    }

    @And("The product does not exist in the store")
    public void theProductDoesNotExistInTheStore() {
        assertTrue("The product does not exist in the store",
                !products.isProductRegistered("Power Bank"));
    }

    @When("The user is going to add a product to the store")
    public void theUserIsGoingToAddAProductToTheStore() {
        products.addRegisteredProduct("Power Bank");
    }

    @Then("The product must be added successfully")
    public void theProductMustBeAddedSuccessfully() {
        assertTrue("The product must be added successfully",
                products.isProductRegistered("Power Bank"));
    }

    @Given("The store already has registered many products")
    public void theStoreAlreadyHasRegisteredManyProducts() {
        products = new ProductController();
        products.addRegisteredProduct("Smartphone");
        products.addRegisteredProduct("Headset");
        products.addRegisteredProduct("Power Bank");
    }

    @And("The product {string} is registered in the store")
    public void theProductIsRegisteredInTheStore(String arg0) {
        assertTrue("The product {string} is registered in the store",
                products.isProductRegistered(arg0));
    }

    @When("The user deletes the product {string} from the store")
    public void theUserDeletesTheProductFromTheStore(String arg0) {
        products.deleteProduct(arg0);
    }

    @Then("The product {string} should be removed from the store")
    public void theProductShouldBeRemovedFromTheStore(String arg0) {
        assertFalse("The product {string} is registered in the store",
                products.isProductRegistered(arg0));
    }

    @And("The store should have one less product")
    public void theStoreShouldHaveOneLessProduct() {
        assertEquals("The store should have one less product",
                2, products.getProductCount());
    }

    @Given("The store already has registered any products")
    public void theStoreAlreadyHasRegisteredAnyProducts() {
        products = new ProductController();
        products.addRegisteredProduct("Webcam");
        products.addRegisteredProduct("Notebook");
        products.addRegisteredProduct("Mouse");
    }

    @And("The product {string} was registered in the store")
    public void theProductWasRegisteredInTheStore(String arg0) {
        assertTrue("The product {string} was registered in the store",
                products.isProductRegistered(arg0));
    }

    @When("The user updates the product {string} to {string} in the store")
    public void theUserUpdatesTheProductToInTheStore(String arg0, String arg1) {
        products.updateProduct(arg0, arg1);
    }

    @Then("The product {string} should be in the store")
    public void theProductShouldBeInTheStore(String arg0) {
        assertTrue("The product {string} should be in the store",
                products.isProductRegistered(arg0));
    }

    @And("The product {string} should no longer be in the store")
    public void theProductShouldNoLongerBeInTheStore(String arg0) {
        assertFalse("The product {string} should no longer be in the store",
                products.isProductRegistered(arg0));
    }
}
