package com.fasoho.tddjava;

import static org.junit.jupiter.api.AssertEquals.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @project tddpractice
 * @user jp
 * @date 2019-02-24
 */
public class MailTemplateTest {

  @Test
  public void oneVariable() throws Exception {
    MailTemplate mailTemplate = new MailTemplate("Hello, ${name}");
    mailTemplate.set("name", "Reader");
    assertEquals("Hello, Reader", mailTemplate.evaluate());
  }

}
