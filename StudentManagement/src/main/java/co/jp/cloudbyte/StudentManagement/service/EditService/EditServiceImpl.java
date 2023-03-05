package co.jp.cloudbyte.StudentManagement.service.EditService;

import co.jp.cloudbyte.StudentManagement.entity.UserInfo;
import co.jp.cloudbyte.StudentManagement.form.RegisterForm;
import co.jp.cloudbyte.StudentManagement.repository.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EditServiceImpl implements EditService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserInfo editInit(String username) {
        return userInfoMapper.selectByUsername(username);
    }

    @Override
    public void userEdit(RegisterForm registerForm) {
        userInfoMapper.updateUserInfo(registerForm);
    }

    @Override
    public void deleteUser(String username) {
        userInfoMapper.deleteUserInfo(username);
    }
}
