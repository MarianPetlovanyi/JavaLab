package ua.lviv.iot.lab2.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegularExpressionLabTest {
  public RegularExpressionLab r1;
  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  @BeforeEach
  void setUp() throws Exception {
    r1= new RegularExpressionLab();
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void testFindRegExprInText() {
    r1.findRegExprInText();
  }

}
