package com.braintreegateway.unittest;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Environment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BraintreeGatewayTest {

    @Test
    public void testStringEnvironmentConstructor() {
       BraintreeGateway gateway = new BraintreeGateway("development", "merchant_id", "public_key", "private_key");
       assertEquals(Environment.DEVELOPMENT, gateway.getConfiguration().getEnvironment());
    }

    @Test
    public void partnerIdAlias() {
        BraintreeGateway gateway = BraintreeGateway.forPartner(Environment.DEVELOPMENT, "partner_id", "publicKey", "privateKey");
        assertEquals(gateway.getConfiguration().getPublicKey(), "publicKey");
        assertEquals(gateway.getConfiguration().getPrivateKey(), "privateKey");
    }
}
