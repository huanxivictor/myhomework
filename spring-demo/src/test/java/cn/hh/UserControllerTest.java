package cn.hh;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    //注入web上下文对象
    @Autowired
    private WebApplicationContext was;
    //定义一个mvc的伪造对象
    private MockMvc mockMvc;
    @Before
    public void setUp(){
        mockMvc= MockMvcBuilders.webAppContextSetup(was).build();
    }


    @Test
    public void whenQuerySuccess3() throws Exception{
        //模拟查询用户信息,带参数
        String listJson=mockMvc.perform(get("/user2")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .param("name","tom1")
        .param("sex","男"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(listJson);
    }
    @Test
    public void whenQuerySuccess2() throws Exception{
        //模拟查询用户信息,带参数
        String listJson=mockMvc.perform(get("/user2")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
        .param("name","tom1"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(listJson);
    }
    @Test
    public void whenQuerySuccess() throws Exception{
        //模拟查询用户信息,不带参数
        String listJson=mockMvc.perform(get("/user")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andReturn().getResponse().getContentAsString();
        System.out.println(listJson);
    }
}
