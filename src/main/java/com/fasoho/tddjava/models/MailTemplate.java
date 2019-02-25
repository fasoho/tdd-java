package com.fasoho.tddjava.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @project tddpractice
 * @user jp
 * @date 2019-02-24
 */
public class MailTemplate {

  private Map<String, String> variables;

  private String templateText;

  public MailTemplate(String templateText) {
    this.variables = new HashMap<String, String>();
    this.templateText = templateText;
  }

  public void set(String name, String value) {
    this.variables.put(name, value);
  }

  public String evaluate() {
    String result = templateText;

    for(Entry<String, String> entry : variables.entrySet()) {
      String regex = "\\$\\{" + entry.getKey() + "\\}";
      result = result.replaceAll(regex, entry.getValue());
    }
    return result;
  }
}
