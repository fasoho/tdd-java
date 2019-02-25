package com.fasoho.tddjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasoho.tddjava.models.MailTemplate;
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

  @Test
  public void differentTemplate() throws Exception {
    MailTemplate mailTemplate = new MailTemplate("Hi, ${name}");
    mailTemplate.set("name", "Person");
    assertEquals("Hi, Person", mailTemplate.evaluate());
  }

}
