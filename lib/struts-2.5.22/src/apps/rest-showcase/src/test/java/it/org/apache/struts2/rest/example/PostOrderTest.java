/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package it.org.apache.struts2.rest.example;

import net.sourceforge.jwebunit.junit.WebTestCase;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import java.io.IOException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;

public class PostOrderTest extends WebTestCase {

    public void setUp() throws Exception {
        getTestContext().setBaseUrl(ParameterUtils.getBaseUrl());
    }


    public void testPostOrder() {
        beginAt("/orders/new");
        setWorkingForm(0);
        setTextField("clientName", "Test1");
        setTextField("amount", "321");
        submit();
        assertTextPresent("Test1");
        assertLinkNotPresentWithText("Back to Orders");
    }

    public void testPostOrderWithErrors() {
        beginAt("/orders/new");
        setWorkingForm(0);
        setTextField("amount", "321");
        try {
            submit();
        } catch (FailingHttpStatusCodeException ex) {
            // ignore;
        }
        assertTextPresent("client name is empty");
        assertTextFieldEquals("amount", "321");
    }

    public void testPostOrderInHtml() {
        beginAt("/orders/new.xhtml");
        setWorkingForm(0);
        setTextField("clientName", "Test2");
        setTextField("amount", "321");
        try {
            submit();
        } catch (FailingHttpStatusCodeException ex) {
            // ignore;
        }
        assertTextPresent("Test2");
        assertLinkNotPresentWithText("Back to Orders");
    }

    public void testPostOrderInXml() throws IOException {
        HttpClient client = new HttpClient();
        PostMethod method = null;
        try {
            method = new PostMethod(ParameterUtils.getBaseUrl()+"/orders.xml");
            method.setRequestEntity(new StringRequestEntity("<org.apache.struts2.rest.example.Order>\n" +
                    "<clientName>Test3</clientName>\n" +
                    "<amount>3342</amount>\n" +
                    "</org.apache.struts2.rest.example.Order>"));
            client.executeMethod(method);
            assertEquals(201, method.getStatusCode());
            assertTrue(method.getResponseHeader("Location").getValue().startsWith(ParameterUtils.getBaseUrl()+"/orders/"));
        } finally {
            method.releaseConnection();
        }
    }

    public void testPostOrderInXmlWithBadData() throws IOException {
        HttpClient client = new HttpClient();
        PostMethod method = null;
        try {
            method = new PostMethod(ParameterUtils.getBaseUrl()+"/orders.xml");
            method.setRequestEntity(new StringRequestEntity("<org.apache.struts2.rest.example.Order>\n" +
                    "<amount>3342</amount>\n" +
                    "</org.apache.struts2.rest.example.Order>"));
            client.executeMethod(method);
            assertEquals(400, method.getStatusCode());
            String response = method.getResponseBodyAsString();
            assertTrue(response.contains("<string>The client name is empty"));
            assertNull(method.getResponseHeader("Location"));
        } finally {
            method.releaseConnection();
        }
    }

    public void testPostOrderInJson() throws IOException {
        HttpClient client = new HttpClient();
        PostMethod method = null;
        try {
            method = new PostMethod(ParameterUtils.getBaseUrl()+"/orders.json");
            method.setRequestEntity(new StringRequestEntity("{\"amount\":33,\"clientName\":\"Test4\"}"));
            client.executeMethod(method);
            assertEquals(201, method.getStatusCode());
            assertTrue(method.getResponseHeader("Location").getValue().startsWith(ParameterUtils.getBaseUrl()+"/orders/"));
        } finally {
            method.releaseConnection();
        }
    }

    public void testPostOrderInJsonWithBadData() throws IOException {
        HttpClient client = new HttpClient();
        PostMethod method = null;
        try {
            method = new PostMethod(ParameterUtils.getBaseUrl()+"/orders.json");
            method.setRequestEntity(new StringRequestEntity("{\"amount\":33}"));
            client.executeMethod(method);
            String response = method.getResponseBodyAsString();
            assertEquals(400, method.getStatusCode());

            assertEquals("{\"actionErrors\":[],\"fieldErrors\":{\"clientName\":[\"The client name is empty\"]}}", response);
            assertNull(method.getResponseHeader("Location"));
        } finally {
            method.releaseConnection();
        }
    }
}