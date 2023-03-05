package co.jp.cloudbyte.StudentManagement.controller;

import co.jp.cloudbyte.StudentManagement.service.EditService.EditService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = LoginController.class)
@ExtendWith(SpringExtension.class)
public class LoginControllerTest {

    @MockBean
    private EditService editService;

    @Autowired
    private LoginController loginController;

    @BeforeAll
    static void initAll(){
        System.out.println("==========LoginController Test Start==========");
    }

    @BeforeEach
    void setUp() {
        System.out.println("==========Junit Case Start==========");
    }


    @Test
    public void testLoginNoArguments(){
        String result = loginController.login();
        Assertions.assertEquals("index",result);
    }

    @Test
    public void testUserRegisterNoArguments(){
        String result = loginController.userRegister();
        Assertions.assertEquals("user/register",result);
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("==========Junit Case End==========");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("==========LoginController Test End==========");
    }



}
