package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseMockJson {




  public void parseObject(String json) {


      ObjectMapper objectMapper = new ObjectMapper();
      GetOrder getOrder = null;
      try {
          getOrder = objectMapper.readValue(json,GetOrder.class);
          Order order = getOrder.getOrder();



      } catch (Exception e) {
          e.printStackTrace();
      }
      //return getOrder;
  }
    }


