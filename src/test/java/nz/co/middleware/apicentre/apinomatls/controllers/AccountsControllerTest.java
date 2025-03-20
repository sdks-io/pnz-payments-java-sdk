/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import nz.co.middleware.apicentre.apinomatls.AccountAndTransactionAPISpecificationClient;
import nz.co.middleware.apicentre.apinomatls.exceptions.ApiException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static AccountAndTransactionAPISpecificationClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static AccountsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getAccountsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Get a list of accounts.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetAccounts() throws Exception {
        // Parameters for the API call
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        String xMerchantIpAddress = null;
        String xCustomerUserAgent = null;

        // Set callback and perform API call
        try {
            controller.getAccounts(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xMerchantIpAddress, xCustomerUserAgent);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("x-fapi-interaction-id", TestHelper.NULL_STRING);
        headers.put("Content-Type", "application/json; charset=utf-8");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
