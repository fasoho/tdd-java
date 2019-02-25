package com.fasoho.tddjava.models;

/**
 * @project tddpractice
 * @user jp
 * @date 2019-02-24
 */
public class MailTemplate {

  private String variableValue;

  private String templateText;

  public MailTemplate(String templateText) {
    this.templateText = templateText;
  }

  public void set(String name, String value) {
    this.variableValue = value;
  }

  public String evaluate() {
    return templateText.replaceAll("\\$\\{name\\}", variableValue);
  }
}
