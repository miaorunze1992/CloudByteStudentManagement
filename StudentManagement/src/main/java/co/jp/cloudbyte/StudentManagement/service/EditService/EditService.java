package co.jp.cloudbyte.StudentManagement.service.EditService;

import co.jp.cloudbyte.StudentManagement.entity.UserInfo;
import co.jp.cloudbyte.StudentManagement.form.RegisterForm;

public interface EditService {
    UserInfo editInit(String username);

    void userEdit(RegisterForm registerForm);

    void deleteUser(String username);
}
