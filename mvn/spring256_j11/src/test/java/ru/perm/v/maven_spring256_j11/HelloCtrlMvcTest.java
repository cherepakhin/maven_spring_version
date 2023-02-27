package ru.perm.v.maven_spring256_j11;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {HelloCtrl.class})
@WebMvcTest
public class HelloCtrlMvcTest {
    @Autowired
    private MockMvc mockMvc;

    private final String root = "/hello";

    @Test
    public void getHelloCheckText() throws Exception {
        MvcResult result = mockMvc.perform(get(root + "/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andReturn();

        String ans = result.getResponse().getContentAsString();
        assertEquals("{\"id\":0,\"name\":\"-\"}", ans);
    }

    @Test
    public void getHelloCheckJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        MvcResult result = mockMvc.perform(get(root + "/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andReturn();

        String ans = result.getResponse().getContentAsString();
        HelloDto receivedDto = mapper.readValue(ans, HelloDto.class);
        assertEquals(new HelloDto(0L,"-"), receivedDto);
    }
}
