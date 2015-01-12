package com.harry.tomcat.ex03one.startup;

import com.harry.tomcat.ex03one.connector.http.HttpConnector;


public final class Bootstrap {
  public static void main(String[] args) {
    HttpConnector connector = new HttpConnector();
    connector.start();
  }
}