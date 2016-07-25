package me.jaegyu.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import me.jaegyu.test.helper.ControllerTestHelper;

public class RestSampleControllerTest extends ControllerTestHelper {

	@Test
	public void 샘플_url_을_호출하면_json_데이터로_응답된다() throws Exception {
		ResultActions result = mockMvc.perform(get("/sample")
				.contentType(MediaType.APPLICATION_JSON));

		result.andDo(print());
		result.andExpect(status().isOk());
	}

}
