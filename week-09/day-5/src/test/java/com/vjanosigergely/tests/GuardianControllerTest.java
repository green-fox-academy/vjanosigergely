package com.vjanosigergely.tests;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.vjanosigergely.tests.Controllers.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void GuardianControllerTest_ParameterGiven_Expected_Status_OK() throws Exception {
    mockMvc.perform(get("/groot").param("message", "blablabla"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("blablabla")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }
  @Test
  public void GuardianControllerTest_Parameter_Missing_Expected_Status_BadRequest() throws Exception{
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }


}
