package com.lambdaschool.shoppingcart;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = FoundationApplication.class)
@AutoConfigureMockMvc
@WithMockUser(username = "admin", roles = {"USER", "ADMIN"})
public class UserControllerUnitTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;



    @org.junit.Before
    public void setUp() throws Exception {
        @RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).apply(SecurityMockMvcConfigures.springSecurity()).build();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void listAllUsers() {
    }

    @org.junit.Test
    public void getUserById() {
    }

    @org.junit.Test
    public void getUserByName() {
    }

    @org.junit.Test
    public void getUserLikeName() {
    }

    @org.junit.Test
    public void addNewUser() {
    }

    @org.junit.Test
    public void updateFullUser() {
    }

    @org.junit.Test
    public void updateUser() {
    }

    @org.junit.Test
    public void deleteUserById() {
    }

    @org.junit.Test
    public void getCurrentUserInfo() {
    }
}