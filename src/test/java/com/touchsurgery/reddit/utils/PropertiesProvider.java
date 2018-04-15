package com.touchsurgery.reddit.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesProvider {

  private Properties properties;

  public PropertiesProvider(String properties_name) {
    this.properties = new Properties();
    try {
      this.properties.load(PropertiesProvider.class.getClassLoader().getResourceAsStream(properties_name));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getProperty(String key) {
    return properties.getProperty(key);
  }
}
