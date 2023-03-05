package co.jp.cloudbyte.StudentManagement.service.RegisterService;

import co.jp.cloudbyte.StudentManagement.form.RegisterForm;
import co.jp.cloudbyte.StudentManagement.repository.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegisterServiceImpl implements RegisterService{

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public void register(RegisterForm registerForm) {
        userInfoMapper.insertUserInfo(registerForm);
    }
}
