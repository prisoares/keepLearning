package com.touchsurgery.reddit.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesProvider {

  private Properties properties;

  public PropertiesProvider(String properties_name) {
    this.properties = new Properties();
    try (InputStream inStream = PropertiesProvider.class.getClassLoader().getResourceAsStream(properties_name)) {
      this.properties.load(inStream);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getProperty(String key) {
    return properties.getProperty(key);
  }
}
