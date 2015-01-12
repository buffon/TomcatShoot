package com.harry.tomcat.ex03one;

import java.io.IOException;

import com.harry.tomcat.ex03one.connector.http.HttpRequest;
import com.harry.tomcat.ex03one.connector.http.HttpResponse;

public class StaticResourceProcessor {

  public void process(HttpRequest request, HttpResponse response) {
    try {
      response.sendStaticResource();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

}
