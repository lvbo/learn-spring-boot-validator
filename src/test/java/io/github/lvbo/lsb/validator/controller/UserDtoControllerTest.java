package io.github.lvbo.lsb.validator.controller;

import com.alibaba.fastjson.JSON;
import io.github.lvbo.lsb.validator.dto.UserDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@RunWith(SpringRunner.class)
@SpringBootTest
/**
 * @author lvbo
 * @version V1.0
 * @date 2019/11/5 15:15
 */
public class UserDtoControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }
    @Test
    public void createUserNameEmpty() throws Exception {
        UserDto userDto = new UserDto();
        userDto.setAge(12);
        userDto.setPassword("123456");

        mockMvc.perform(
                MockMvcRequestBuilders.post("/v1/user")
                        .param("user", JSON.toJSONString(userDto))
                        .accept(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print());
//                .andExpect(content().string(equalTo("hello controller")));
//                .andExpect(content().string(containsString("hello")))
//                 .andReturn().getResponse().getContentAsString();
    }
}