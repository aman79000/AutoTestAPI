package org.example;

public class payload {
    public static String  mockJson(){
        return "{\n" +
                "  \"dashboard\": {\n" +
                "    \"purchaseAmount\": 1162,\n" +
                "    \"website\": \"rahulshettyacademy.com\"\n" +
                "  },\n" +
                "  \"courses\": [\n" +
                "    {\n" +
                "      \"title\": \"Selenium Python\",\n" +
                "      \"price\": 50,\n" +
                "      \"copies\": 6\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Cypress\",\n" +
                "      \"price\": 40,\n" +
                "      \"copies\": 4\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"RPA\",\n" +
                "      \"price\": 45,\n" +
                "      \"copies\": 10\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"Appium\",\n" +
                "      \"price\": 36,\n" +
                "      \"copies\": 7\n" +
                "    }\n" +
                "  ]\n" +
                "}\n";
    }
    public static String mockJson1(){
        return "{\n" +
                "  \"order\": {\n" +
                "    \"orderId\": 98765,\n" +
                "    \"customer\": {\n" +
                "      \"customerId\": 12345,\n" +
                "      \"name\": \"Jane Smith\",\n" +
                "      \"loyaltyPoints\": 1200,\n" +
                "      \"shippingAddress\": {\n" +
                "        \"street\": \"456 Elm St\",\n" +
                "        \"city\": \"Los Angeles\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"zip\": \"90001\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"items\": [\n" +
                "      {\n" +
                "        \"itemId\": \"A001\",\n" +
                "        \"name\": \"Laptop\",\n" +
                "        \"quantity\": 1,\n" +
                "        \"price\": 1200.50,\n" +
                "        \"attributes\": {\n" +
                "          \"brand\": \"TechBrand\",\n" +
                "          \"color\": \"Silver\",\n" +
                "          \"warranty\": \"2 years\"\n" +
                "        }\n" +
                "      },\n" +
                "      {\n" +
                "        \"itemId\": \"B002\",\n" +
                "        \"name\": \"Mouse\",\n" +
                "        \"quantity\": 2,\n" +
                "        \"price\": 25.99,\n" +
                "        \"attributes\": {\n" +
                "          \"brand\": \"TechBrand\",\n" +
                "          \"color\": \"Black\",\n" +
                "          \"wireless\": true\n" +
                "        }\n" +
                "      }\n" +
                "    ],\n" +
                "    \"payment\": {\n" +
                "      \"method\": \"Credit Card\",\n" +
                "      \"transactionId\": \"TXN7890\",\n" +
                "      \"status\": \"Confirmed\"\n" +
                "    }\n" +
                "  }\n" +
                "}\n";
        }

    public static String mockJson2(){
        return"{\n" +
                "  \"order\": {\n" +
                "    \"orderId\": 98765,\n" +
                "    \"customer\": {\n" +
                "      \"customerId\": 12345,\n" +
                "      \"name\": \"Jane Smith\",\n" +
                "      \"loyaltyPoints\": 1200,\n" +
                "      \"shippingAddress\": {\n" +
                "        \"street\": \"456 Elm St\",\n" +
                "        \"city\": \"Los Angeles\",\n" +
                "        \"state\": \"CA\",\n" +
                "        \"zip\": \"90001\"\n" +
                "      }\n" +
                "}}}\n";
    }
}
