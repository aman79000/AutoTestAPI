package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Utils {
   public RequestSpecification reqSpec;
   PropertiesUtils prop = new PropertiesUtils();

    public RequestSpecification RequestSpec() throws IOException {
        if(reqSpec==null) {
            PrintStream log = new PrintStream(Files.newOutputStream(Paths.get("target/log.txt")));
            reqSpec = new RequestSpecBuilder().setBaseUri(prop.getUrl()).setContentType(ContentType.JSON)
                    .addHeader("Authorization", "Basic Z2FtYW43OTAwQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAwT1pCY01CcGs3MWZqMlVjU3QyQWRoY0RGbEJXbTVTM05TQXNPd0wyS1lFR2ZlLXdqU3h2cmNWbEJ4WGRmS1FkNTlIMmxxNTRwMThhS0h6NDNVTFpKMk8tWWJQM1J3aUN5dnJ0Sk5vaWEya3ZlUENlLXByMmdJU1ZSdURaam50am5UTmZ1Y2NoOW9xazlEazkzUWhvLWNpMkRyR2pUbThWUjBJbXBKd3UyMWs9MkUwNTZBMTQ=")
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log)).build();
        }

    return reqSpec;
}
}
